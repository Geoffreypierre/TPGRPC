package org.anonbnr.web_services.grpc.employees.server.services;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import com.example.grpc.Partenaire;
import com.example.grpc.PartenaireCount;
import com.example.grpc.PartenaireId;
import com.example.grpc.PartenaireList;
import com.example.grpc.PartenaireServiceGrpc.PartenaireServiceImplBase;
import com.example.grpc.Empty;
import org.anonbnr.web_services.grpc.employees.server.repository.PartenaireRepository;

@GrpcService
public class PartenaireServiceImpl extends PartenaireServiceImplBase {

    private final PartenaireRepository partenaireRepository;

    public PartenaireServiceImpl(PartenaireRepository partenaireRepository) {
        this.partenaireRepository = partenaireRepository;
    }

    @Override
    public void getAllPartenaires(Empty request, StreamObserver<PartenaireList> responseObserver) {
        // Créer un builder pour PartenaireList
        PartenaireList.Builder builder = PartenaireList.newBuilder();

        // Parcourir tous les partenaires et les ajouter au builder
        partenaireRepository.findAll().forEach(partenaire -> {
            Partenaire grpcPartenaire = Partenaire.newBuilder()
                .setId(partenaire.getId_partenaire()) // Correspond à l'ID du partenaire
                .setNomPartenaire(partenaire.getNom_partenaire()) // Correspond au nom
                .setReducPourcentage(partenaire.getReduc_pourcentage()) // Correspond au pourcentage de réduction
                .build();
            builder.addPartenaire(grpcPartenaire);
        });

        // Construire la réponse et l'envoyer
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }


    @Override
    public void getPartenaireById(PartenaireId request, StreamObserver<Partenaire> responseObserver) {
        partenaireRepository.findById(request.getId()).ifPresentOrElse(
        		partenaire -> responseObserver.onNext(Partenaire.newBuilder()
    					.setId(partenaire.getId_partenaire())
    					.setNomPartenaire(partenaire.getNom_partenaire())
    					.setReducPourcentage(partenaire.getReduc_pourcentage())
    					.build()),
    			() -> responseObserver.onError(new IllegalArgumentException(
        				String.format("Employee with id %s not found", request.getId())))
		);
    	
    	responseObserver.onCompleted();
    }

    @Override
    public void addPartenaire(Partenaire request, StreamObserver<Partenaire> responseObserver) {
    	if (partenaireRepository.existsById(request.getId()))
    		responseObserver.onError(new IllegalArgumentException(
    				String.format("Employee ID %s already exists", request.getId())));
    	else {
    		org.anonbnr.web_services.grpc.employees.server.model.Partenaire newPartenaire = new
    				org.anonbnr.web_services.grpc.employees.server.model.Partenaire(request.getNomPartenaire(), request.getReducPourcentage());
    		org.anonbnr.web_services.grpc.employees.server.model.Partenaire savedPartenaire = partenaireRepository.save(newPartenaire);
    		responseObserver.onNext(Partenaire.newBuilder()
					.setId(savedPartenaire.getId_partenaire())
					.setNomPartenaire(savedPartenaire.getNom_partenaire())
					.setReducPourcentage(savedPartenaire.getReduc_pourcentage())
					.build());
    	}
    	responseObserver.onCompleted();
    }

    @Override
    public void updatePartenaire(Partenaire request, StreamObserver<Partenaire> responseObserver) {
        
    	if (partenaireRepository.existsById(request.getId())) {
    		org.anonbnr.web_services.grpc.employees.server.model.Partenaire updatedPartenaire = new
    				org.anonbnr.web_services.grpc.employees.server.model.Partenaire(request.getNomPartenaire(), request.getReducPourcentage());
    		updatedPartenaire.setId_partenaire(request.getId());
    		org.anonbnr.web_services.grpc.employees.server.model.Partenaire savedPartenaire = partenaireRepository.save(updatedPartenaire);
    		responseObserver.onNext(Partenaire.newBuilder()
					.setId(savedPartenaire.getId_partenaire())
					.setNomPartenaire(savedPartenaire.getNom_partenaire())
					.setReducPourcentage(savedPartenaire.getReduc_pourcentage())
					.build());
    	}
    	else
    		responseObserver.onError(new IllegalArgumentException(
    				String.format("Employee with id %s not found", request.getId())));
    	responseObserver.onCompleted();
    
    }

    @Override
    public void deletePartenaireById(PartenaireId request, StreamObserver<Empty> responseObserver) {
    	if (partenaireRepository.existsById(request.getId())) {
    		partenaireRepository.deleteById(request.getId());
    		responseObserver.onNext(Empty.newBuilder().build());
    	}
    	else
    		responseObserver.onError(new IllegalArgumentException(
    				String.format("Employee with id %s not found", request.getId())));
    	responseObserver.onCompleted();
    }
}
