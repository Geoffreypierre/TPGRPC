package org.anonbnr.web_services.grpc.employees.server.services;


import java.time.LocalDate;

import com.example.grpc.Reservation;
import com.example.grpc.ReservationCount;
import com.example.grpc.ReservationId;
import com.example.grpc.ReservationList;
import com.example.grpc.ReservationServiceGrpc.ReservationServiceImplBase;
import com.example.grpc.Adresse;
import com.example.grpc.Chambre;
import com.example.grpc.Client;
import com.example.grpc.Empty;
import com.example.grpc.Hotel;

import org.anonbnr.web_services.grpc.employees.server.repository.ChambreRepository;
import org.anonbnr.web_services.grpc.employees.server.repository.ClientRepository;
import org.anonbnr.web_services.grpc.employees.server.repository.ReservationRepository;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ReservationServiceImpl extends ReservationServiceImplBase {

    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;
    private final ChambreRepository chambreRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository, ClientRepository clientRepository, ChambreRepository chambreRepository) {
        this.reservationRepository = reservationRepository;
		this.clientRepository = clientRepository;
		this.chambreRepository = chambreRepository;
    }

    @Override
    public void getAllReservations(Empty request, StreamObserver<ReservationList> responseObserver) {
        ReservationList.Builder reservationListBuilder = ReservationList.newBuilder();

        reservationRepository.findAll().forEach(reservation -> {
            // Conversion de l'entité Client vers Client gRPC
            Client grpcClient = Client.newBuilder()
            		.setId(reservation.getClient().getId())
                    .setNom(reservation.getClient().getNom())
                    .setPrenom(reservation.getClient().getPrenom())
                    .setInfoCarteCredit(reservation.getClient().getInfo_carte_credit())
                    .build();

            // Conversion de l'entité Chambre vers Chambre gRPC
            Chambre grpcChambre = Chambre.newBuilder()
                .setNumero(reservation.getChambre().getNumero())
                .setNomChambre(reservation.getChambre().getnomChambre())
                .setNbLit(reservation.getChambre().getNb_lit())
                .setPrix(reservation.getChambre().getPrixParNuit())
                .setHotel(Hotel.newBuilder()
                    .setNom(reservation.getChambre().getHotelId().getNom())
                    .setAdresse(Adresse.newBuilder()
                        .setRue(reservation.getChambre().getHotelId().getAdresse().getRue())
                        .setVille(reservation.getChambre().getHotelId().getAdresse().getVille())
                        .setPays(reservation.getChambre().getHotelId().getAdresse().getPays())
                        .build())
                    .setNombreEtoiles(reservation.getChambre().getHotelId().getNombreEtoiles())
                    .build())
                .build();

            // Construction de l'objet Reservation gRPC
            Reservation grpcReservation = Reservation.newBuilder()
                .setId(reservation.getId())
                .setDateArrivee(reservation.getDate_arrivee().toString()) // Formatage des dates
                .setDateDepart(reservation.getDate_depart().toString())
                .setClient(grpcClient)
                .setChambre(grpcChambre)
                .build();

            reservationListBuilder.addReservations(grpcReservation);
        });

        responseObserver.onNext(reservationListBuilder.build());
        responseObserver.onCompleted();
    }


    @Override
    public void getReservationCount(Empty request, StreamObserver<ReservationCount> responseObserver) {
    	responseObserver.onNext(ReservationCount.newBuilder()
    			.setCount((int)reservationRepository.count()).build());
    	responseObserver.onCompleted();
    }
    
    @Override
    public void getReservationById(ReservationId request, StreamObserver<Reservation> responseObserver) {
        reservationRepository.findById(request.getId()).ifPresent(reservation -> {
        	
            // Conversion de l'entité Client vers Client gRPC
            Client grpcClient = Client.newBuilder()
            		.setId(reservation.getClient().getId())
                    .setNom(reservation.getClient().getNom())
                    .setPrenom(reservation.getClient().getPrenom())
                    .setInfoCarteCredit(reservation.getClient().getInfo_carte_credit())
                    .build();
        	
            // Conversion de l'entité Chambre vers Chambre gRPC
            Chambre grpcChambre = Chambre.newBuilder()
                .setNumero(reservation.getChambre().getNumero())
                .setNomChambre(reservation.getChambre().getnomChambre())
                .setNbLit(reservation.getChambre().getNb_lit())
                .setPrix(reservation.getChambre().getPrixParNuit())
                .setHotel(Hotel.newBuilder()
                    .setNom(reservation.getChambre().getHotelId().getNom())
                    .setAdresse(Adresse.newBuilder()
                        .setRue(reservation.getChambre().getHotelId().getAdresse().getRue())
                        .setVille(reservation.getChambre().getHotelId().getAdresse().getVille())
                        .setPays(reservation.getChambre().getHotelId().getAdresse().getPays())
                        .build())
                    .setNombreEtoiles(reservation.getChambre().getHotelId().getNombreEtoiles())
                    .build())
                .build();
            
            Reservation grpcReservation = Reservation.newBuilder()
                .setId(reservation.getId())
                .setDateArrivee(reservation.getDate_arrivee().toString())
                .setDateDepart(reservation.getDate_depart().toString())
                .setClient(grpcClient)
                .setChambre(grpcChambre)
                .build();
            responseObserver.onNext(grpcReservation);
            responseObserver.onCompleted();
        });
    }

    @Override
    public void addReservation(Reservation request, StreamObserver<Reservation> responseObserver) {
        try {
            // Vérifier si la réservation existe déjà
            if (reservationRepository.existsById(request.getId())) {
                responseObserver.onError(new IllegalArgumentException(
                        String.format("Reservation ID %s already exists", request.getId())));
                return;
            }

            // Récupération du client à partir de l'ID fourni (si applicable)
            org.anonbnr.web_services.grpc.employees.server.model.Client client = clientRepository.findById(request.getClient().getId())
                .orElseThrow(() -> new IllegalArgumentException("Client not found with ID: " + request.getClient().getId()));

            // Récupération de la chambre à partir de l'ID fourni
            org.anonbnr.web_services.grpc.employees.server.model.Chambre chambre = chambreRepository.findById(request.getChambre().getNumero())
                .orElseThrow(() -> new IllegalArgumentException("Chambre not found with ID: " + request.getChambre().getNumero()));

            // Création de la nouvelle réservation
            org.anonbnr.web_services.grpc.employees.server.model.Reservation newReservation = new org.anonbnr.web_services.grpc.employees.server.model.Reservation(
                    LocalDate.parse(request.getDateArrivee()),
                    LocalDate.parse(request.getDateDepart()),
                    client,
                    chambre
            );

            // Sauvegarde de la réservation
            org.anonbnr.web_services.grpc.employees.server.model.Reservation savedReservation = reservationRepository.save(newReservation);

            // Conversion de l'entité Client vers Client gRPC
            Client grpcClient = Client.newBuilder()
                    .setId(savedReservation.getClient().getId())
                    .setNom(savedReservation.getClient().getNom())
                    .setPrenom(savedReservation.getClient().getPrenom())
                    .setInfoCarteCredit(savedReservation.getClient().getInfo_carte_credit())
                    .build();

            // Conversion de l'entité Chambre vers Chambre gRPC
            Chambre grpcChambre = Chambre.newBuilder()
                    .setNumero(savedReservation.getChambre().getNumero())
                    .setNomChambre(savedReservation.getChambre().getnomChambre())
                    .setNbLit(savedReservation.getChambre().getNb_lit())
                    .setPrix(savedReservation.getChambre().getPrixParNuit())
                    .setHotel(Hotel.newBuilder()
                            .setNom(savedReservation.getChambre().getHotelId().getNom())
                            .setAdresse(Adresse.newBuilder()
                                    .setRue(savedReservation.getChambre().getHotelId().getAdresse().getRue())
                                    .setVille(savedReservation.getChambre().getHotelId().getAdresse().getVille())
                                    .setPays(savedReservation.getChambre().getHotelId().getAdresse().getPays())
                                    .build())
                            .setNombreEtoiles(savedReservation.getChambre().getHotelId().getNombreEtoiles())
                            .build())
                    .build();

            // Envoi de la réponse gRPC
            responseObserver.onNext(Reservation.newBuilder()
                    .setId(savedReservation.getId())
                    .setDateArrivee(savedReservation.getDate_arrivee().toString())
                    .setDateDepart(savedReservation.getDate_depart().toString())
                    .setClient(grpcClient)
                    .setChambre(grpcChambre)
                    .build());
            responseObserver.onCompleted();

        } catch (IllegalArgumentException e) {
            // Gestion des erreurs pour les ID non trouvés ou incohérences
            responseObserver.onError(e);
        } catch (Exception e) {
            // Gestion des erreurs générales
            responseObserver.onError(new RuntimeException("An error occurred while adding the reservation: " + e.getMessage()));
        }
    }


    @Override
    public void deleteReservationById(ReservationId request, StreamObserver<Empty> responseObserver) {
        reservationRepository.deleteById(request.getId());
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}
