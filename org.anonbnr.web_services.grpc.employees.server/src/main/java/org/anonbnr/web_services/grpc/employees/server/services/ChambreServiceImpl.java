package org.anonbnr.web_services.grpc.employees.server.services;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.io.IOException;
import java.util.Base64;

import com.example.grpc.Adresse;
import com.example.grpc.Chambre;
import com.example.grpc.ChambreCount;
import com.example.grpc.ChambreId;
import com.example.grpc.ChambreList;
import com.example.grpc.ChambreServiceGrpc.ChambreServiceImplBase;
import com.example.grpc.Empty;
import com.example.grpc.Hotel;
import com.example.grpc.HotelCount;
import com.example.grpc.Partenaire;

import org.anonbnr.web_services.grpc.employees.server.repository.ChambreRepository;

@GrpcService
public class ChambreServiceImpl extends ChambreServiceImplBase {

    private final ChambreRepository chambreRepository;

    public ChambreServiceImpl(ChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }

    @Override
    public void getAllChambres(Empty request, StreamObserver<ChambreList> responseObserver) {
        ChambreList.Builder chambreListBuilder = ChambreList.newBuilder();
        chambreRepository.findAll().forEach(chambre -> {
            // Récupérer l'objet Hotel de votre modèle Java (org.anonbnr.web_services.grpc.employees.server.model.Hotel)
            org.anonbnr.web_services.grpc.employees.server.model.Hotel hotel = chambre.getHotelId();

            // Construire un objet Hotel de type com.example.grpc.Hotel pour le message gRPC
            Hotel grpcHotel = Hotel.newBuilder()
                .setNom(hotel.getNom())  // Utilisez les getters de votre modèle Java pour remplir les champs
                .setAdresse(Adresse.newBuilder()
                        .setRue(hotel.getAdresse().getRue())
                        .setVille(hotel.getAdresse().getVille())
                        .setPays(hotel.getAdresse().getPays())
                        .build())  // Si applicable, sinon retirez cette ligne
                .setNombreEtoiles(hotel.getNombreEtoiles())  // Si applicable
                .setPartenaire(Partenaire.newBuilder()
                    	.setNomPartenaire(hotel.getPartenaire().getNom_partenaire())
                    	.setReducPourcentage(hotel.getPartenaire().getReduc_pourcentage())
                    	.build())
                .build();

            // Construire l'objet Chambre gRPC
            Chambre grpcChambre = Chambre.newBuilder()
                .setNumero(chambre.getNumero())
                .setNomChambre(chambre.getnomChambre())  // Nom de la chambre
                .setNbLit(chambre.getNb_lit())  // Nombre de lits
                .setPrix(chambre.getPrixParNuit())  // Prix par nuit
                .setHotel(grpcHotel)  // Utiliser l'objet Hotel gRPC
                .build();

            chambreListBuilder.addChambres(grpcChambre);
        });

        responseObserver.onNext(chambreListBuilder.build());
        responseObserver.onCompleted();
    }

    
    @Override
    public void getChambreCount(Empty request, StreamObserver<ChambreCount> responseObserver) {
    	responseObserver.onNext(ChambreCount.newBuilder()
    			.setCount((int)chambreRepository.count()).build());
    	responseObserver.onCompleted();
    }

    @Override
    public void getChambreById(ChambreId request, StreamObserver<Chambre> responseObserver) {
        long numero = request.getNumero();
        chambreRepository.findById(numero).ifPresent(chambre -> {
            // Récupérer l'objet Hotel de votre modèle Java (org.anonbnr.web_services.grpc.employees.server.model.Hotel)
            org.anonbnr.web_services.grpc.employees.server.model.Hotel hotel = chambre.getHotelId();

            // Construire un objet Hotel de type com.example.grpc.Hotel pour le message gRPC
            Hotel grpcHotel = Hotel.newBuilder()
                .setNom(hotel.getNom())  // Utilisez les getters de votre modèle Java pour remplir les champs
                .setAdresse(Adresse.newBuilder()
                    .setRue(hotel.getAdresse().getRue())
                    .setVille(hotel.getAdresse().getVille())
                    .setPays(hotel.getAdresse().getPays())
                    .build())  // Si applicable, sinon retirez cette ligne
                .setNombreEtoiles(hotel.getNombreEtoiles())  // Si applicable
                .setPartenaire(Partenaire.newBuilder()
                    	.setNomPartenaire(hotel.getPartenaire().getNom_partenaire())
                    	.setReducPourcentage(hotel.getPartenaire().getReduc_pourcentage())
                    	.build())
                .build();

            // Construire l'objet Chambre gRPC
            Chambre grpcChambre = Chambre.newBuilder()
                .setNumero(chambre.getNumero())
                .setNomChambre(chambre.getnomChambre())  // Nom de la chambre
                .setNbLit(chambre.getNb_lit())  // Nombre de lits
                .setPrix(chambre.getPrixParNuit())  // Prix par nuit
                .setHotel(grpcHotel)  // Utiliser l'objet Hotel gRPC
                .setImagePath(Base64.getEncoder().encodeToString(chambre.getPic_bytes()))
                .build();

            // Envoyer la réponse
            responseObserver.onNext(grpcChambre);
            responseObserver.onCompleted();
        });
    }

    @Override
    public void addChambre(Chambre request, StreamObserver<Chambre> responseObserver) {
        try {
            // Vérification si la chambre existe déjà
            if (chambreRepository.existsById(request.getNumero())) {
                responseObserver.onError(new IllegalArgumentException(
                    String.format("Chambre ID %s already exists", request.getNumero())));
            } else {
                // Récupérer l'Hotel à partir de l'ID fourni dans la requête
            	// Exemple de création d'un hôtel avec ses informations
            	org.anonbnr.web_services.grpc.employees.server.model.Hotel hotel = new org.anonbnr.web_services.grpc.employees.server.model.Hotel("Hotel Paris",new org.anonbnr.web_services.grpc.employees.server.model.Adresse("Place du Casino","Monaco","Monaco","aaa", 99, 15235),(float) 1206.0, 5);


                // Création d'une nouvelle chambre avec les données fournies
                org.anonbnr.web_services.grpc.employees.server.model.Chambre newChambre = new 
                    org.anonbnr.web_services.grpc.employees.server.model.Chambre(
                    request.getNomChambre(),
                    request.getNbLit(),
                    request.getPrix(),
                    hotel,  // On associe l'hôtel récupéré
                    request.getImagePath() // Chemin d'image à traiter
                );

                // Sauvegarde dans le repository
                org.anonbnr.web_services.grpc.employees.server.model.Chambre savedChambre = chambreRepository.save(newChambre);

                // Construction de la réponse gRPC avec l'hôtel
                Hotel grpcHotel = Hotel.newBuilder()
                        .setNom(hotel.getNom())
                        .setAdresse(Adresse.newBuilder()
                            .setRue(hotel.getAdresse().getRue())
                            .setVille(hotel.getAdresse().getVille())
                            .setPays(hotel.getAdresse().getPays())
                        .build())
                    .setNombreEtoiles(hotel.getNombreEtoiles())
                    .build();

                // Construction de l'objet Chambre gRPC
                Chambre grpcChambre = Chambre.newBuilder()
                    .setNumero(savedChambre.getNumero())
                    .setNomChambre(savedChambre.getnomChambre())
                    .setNbLit(savedChambre.getNb_lit())
                    .setPrix(savedChambre.getPrixParNuit())
                    .setHotel(grpcHotel)  // Lier l'objet Hotel
                    .build();

                // Envoyer la réponse
                responseObserver.onNext(grpcChambre);
            }
            responseObserver.onCompleted();
        } catch (IOException e) {
            // Gestion d'une erreur d'entrée/sortie
            responseObserver.onError(new RuntimeException("Error processing the image file: " + e.getMessage()));
        } catch (IllegalArgumentException e) {
            // Gestion des autres exceptions comme IllegalArgumentException
            responseObserver.onError(e);
        }
    }


    
/*
    @Override
    public void updateChambre(Chambre request, StreamObserver<Chambre> responseObserver) {
        try {
            if (chambreRepository.existsById(request.getNumero())) {
                // Si la chambre existe, on met à jour ses informations
                org.anonbnr.web_services.grpc.employees.server.model.Hotel hotel = 
                    new org.anonbnr.web_services.grpc.employees.server.model.Hotel(
                        request.getHotelId().getNom(), // Récupérer le nom de l'hôtel depuis la requête
                        new org.anonbnr.web_services.grpc.employees.server.model.Adresse(
                            request.getHotelId().getAdresse().getRue(),
                            request.getHotelId().getAdresse().getVille(),
                            request.getHotelId().getAdresse().getPays(),
                            request.getHotelId().getAdresse().getCodePostal(),
                            request.getHotelId().getAdresse().getNumeroTel(),
                            request.getHotelId().getAdresse().getCodeGeo()
                        ),
                        request.getHotelId().getPrix(),  // Prix de la chambre
                        request.getHotelId().getNombreEtoiles() // Nombre d'étoiles
                    );

                // Création de la nouvelle chambre avec les informations mises à jour
                org.anonbnr.web_services.grpc.employees.server.model.Chambre updatedChambre = new 
                    org.anonbnr.web_services.grpc.employees.server.model.Chambre(
                        request.getNomChambre(), 
                        request.getNbLit(), 
                        request.getPrix(),
                        hotel,  // L'hôtel mis à jour
                        request.getImagePath() // Le chemin de l'image
                    );

                updatedChambre.setNumero(request.getNumero());  // Conserver le numéro de chambre

                // Sauvegarde la chambre mise à jour dans le repository
                org.anonbnr.web_services.grpc.employees.server.model.Chambre savedChambre = chambreRepository.save(updatedChambre);

                // Construction de la réponse gRPC
                responseObserver.onNext(Chambre.newBuilder()
                        .setNumero(savedChambre.getNumero())
                        .setNomChambre(savedChambre.getnomChambre())
                        .setNbLit(savedChambre.getNb_lit())
                        .setPrix(savedChambre.getPrixParNuit())
                        .build());
            } else {
                responseObserver.onError(new IllegalArgumentException(
                    String.format("Chambre with ID %s not found", request.getNumero())));
            }
            responseObserver.onCompleted();
        } catch (IOException e) {
            // Gestion des erreurs d'entrée/sortie
            responseObserver.onError(new RuntimeException("Error processing the image file: " + e.getMessage()));
        } catch (IllegalArgumentException e) {
            // Gestion des autres erreurs comme IllegalArgumentException
            responseObserver.onError(e);
        }
    }
*/


    @Override
    public void deleteChambreById(ChambreId request, StreamObserver<Empty> responseObserver) {
        chambreRepository.deleteById(request.getNumero());
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}
