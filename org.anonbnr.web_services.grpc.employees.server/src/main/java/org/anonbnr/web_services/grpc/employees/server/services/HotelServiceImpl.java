package org.anonbnr.web_services.grpc.employees.server.services;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.grpc.Hotel;
import com.example.grpc.HotelCount;
import com.example.grpc.HotelId;
import com.example.grpc.HotelList;
import com.example.grpc.HotelServiceGrpc.HotelServiceImplBase;
import com.example.grpc.Partenaire;
import com.example.grpc.Adresse;
import com.example.grpc.Empty;
import org.anonbnr.web_services.grpc.employees.server.repository.HotelRepository;



@GrpcService
public class HotelServiceImpl extends HotelServiceImplBase {

	//@Autowired
    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
    	this.hotelRepository = hotelRepository;
    }

    @Override
    public void getAllHotels(Empty request, StreamObserver<HotelList> responseObserver) {
        HotelList.Builder responseBuilder = HotelList.newBuilder();
        hotelRepository.findAll().forEach(hotel -> {
            Hotel grpcHotel = Hotel.newBuilder()
                .setIdHotel(hotel.getIdHotel())
                .setNom(hotel.getNom())
                .setPrix(hotel.getPrix())
                .setNombreEtoiles(hotel.getNombreEtoiles())
                .setAdresse(Adresse.newBuilder()
                    .setRue(hotel.getAdresse().getRue())
                    .setVille(hotel.getAdresse().getVille())
                    .setPays(hotel.getAdresse().getPays())
                    .build())
                .setPartenaire(Partenaire.newBuilder()
                	.setNomPartenaire(hotel.getPartenaire().getNom_partenaire())
                	.setReducPourcentage(hotel.getPartenaire().getReduc_pourcentage())
                	.build())
                .build();
            responseBuilder.addHotel(grpcHotel);
        });
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getHotelCount(Empty request, StreamObserver<HotelCount> responseObserver) {
    	responseObserver.onNext(HotelCount.newBuilder()
    			.setCount((int)hotelRepository.count()).build());
    	responseObserver.onCompleted();
    }
    @Override
    public void getHotelById(HotelId request, StreamObserver<Hotel> responseObserver) {
        hotelRepository.findById(request.getIdHotel()).ifPresentOrElse(
        		hotel -> responseObserver.onNext(Hotel.newBuilder()
                        .setIdHotel(hotel.getIdHotel())
                        .setNom(hotel.getNom())
                        .setPrix(hotel.getPrix())
                        .setNombreEtoiles(hotel.getNombreEtoiles())
                        .setAdresse(Adresse.newBuilder()
                            .setRue(hotel.getAdresse().getRue())
                            .setVille(hotel.getAdresse().getVille())
                            .setPays(hotel.getAdresse().getPays())
                            .build())
                        .build()),
    			() -> responseObserver.onError(new IllegalArgumentException(
        				String.format("Hotel with id %s not found", request.getIdHotel())))
		);
    	
    	responseObserver.onCompleted();
    }

    @Override
    public void addHotel(Hotel request, StreamObserver<Hotel> responseObserver) {
        try {
            // Vérification si l'hôtel existe déjà
            if (hotelRepository.existsById(request.getIdHotel())) {
                responseObserver.onError(new IllegalArgumentException(
                    String.format("Hotel ID %s already exists", request.getIdHotel())));
                return;
            }

            // Création d'une nouvelle instance d'hôtel à partir des données du client
            org.anonbnr.web_services.grpc.employees.server.model.Hotel newHotel = new org.anonbnr.web_services.grpc.employees.server.model.Hotel();
            newHotel.setNom(request.getNom());
            newHotel.setPrix(request.getPrix());
            newHotel.setNombreEtoiles(request.getNombreEtoiles());
            newHotel.setAdresse(null);
            // Construction de l'adresse
            //newHotel.setAdresse(new Adresse("France", "Paris", "Avenue des Champs-Élysées", "75008", 10, 12345));


            // Sauvegarde dans la base de données
            org.anonbnr.web_services.grpc.employees.server.model.Hotel savedHotel = hotelRepository.save(newHotel);

            // Construction et envoi de la réponse gRPC
            Hotel grpcResponse = Hotel.newBuilder()
                .setIdHotel(savedHotel.getIdHotel())
                .setNom(savedHotel.getNom())
                .setPrix(savedHotel.getPrix())
                .setNombreEtoiles(savedHotel.getNombreEtoiles())
                .setAdresse(Adresse.newBuilder()
                    .setPays(savedHotel.getAdresse().getPays())
                    .setVille(savedHotel.getAdresse().getVille())
                    .setRue(savedHotel.getAdresse().getRue())
                    .setLieuDit(savedHotel.getAdresse().getLieuDit())
                    .setNumero(savedHotel.getAdresse().getNumero())
                    .setPositionGPS(savedHotel.getAdresse().getPositionGPS())
                    .build())
                .build();

            responseObserver.onNext(grpcResponse);
            responseObserver.onCompleted();
        } catch (Exception e) {
            // Gestion des erreurs
            responseObserver.onError(new RuntimeException("Failed to add hotel: " + e.getMessage(), e));
        }
    }

}
