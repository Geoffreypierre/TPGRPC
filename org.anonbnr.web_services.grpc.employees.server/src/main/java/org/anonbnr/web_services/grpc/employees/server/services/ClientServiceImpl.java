package org.anonbnr.web_services.grpc.employees.server.services;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import com.example.grpc.Client;
import com.example.grpc.ClientCount;
import com.example.grpc.ClientId;
import com.example.grpc.ClientList;
import com.example.grpc.ClientServiceGrpc.ClientServiceImplBase;
import com.example.grpc.Empty;
import org.anonbnr.web_services.grpc.employees.server.repository.ClientRepository;


@GrpcService
public class ClientServiceImpl extends ClientServiceImplBase {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void getAllClients(Empty request, StreamObserver<ClientList> responseObserver) {
        ClientList.Builder clientListBuilder = ClientList.newBuilder();
        clientRepository.findAll().forEach(client -> {
            Client grpcClient = Client.newBuilder()
                .setId(client.getId())
                .setNom(client.getNom())
                .setPrenom(client.getPrenom())
                .setInfoCarteCredit(client.getInfo_carte_credit())
                .build();
            clientListBuilder.addClients(grpcClient);
        });
        responseObserver.onNext(clientListBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getClientCount(Empty request, StreamObserver<ClientCount> responseObserver) {
    	responseObserver.onNext(ClientCount.newBuilder()
    			.setCount((int)clientRepository.count()).build());
    	responseObserver.onCompleted();
    }
    
    @Override
    public void getClientById(ClientId request, StreamObserver<Client> responseObserver) {
        long id = request.getId();
        clientRepository.findById(id).ifPresent(client -> {
            Client grpcClient = Client.newBuilder()
                .setId(client.getId())
                .setNom(client.getNom())
                .setPrenom(client.getPrenom())
                .setInfoCarteCredit(client.getInfo_carte_credit())
                .build();
            responseObserver.onNext(grpcClient);
            responseObserver.onCompleted();
        });
    }

    @Override
    public void addClient(Client request, StreamObserver<Client> responseObserver) {
    	if (clientRepository.existsById(request.getId()))
    		responseObserver.onError(new IllegalArgumentException(
    				String.format("Employee ID %s already exists", request.getId())));
    	else {
    		org.anonbnr.web_services.grpc.employees.server.model.Client newEmployee = new
    				org.anonbnr.web_services.grpc.employees.server.model.Client(request.getNom(), request.getPrenom(), request.getInfoCarteCredit());
    		org.anonbnr.web_services.grpc.employees.server.model.Client  savedEmployee = clientRepository.save(newEmployee);
    		responseObserver.onNext(Client.newBuilder()
    				.setId(savedEmployee.getId())
    				.setNom(savedEmployee.getNom())
    				.setPrenom(savedEmployee.getPrenom())
    				.setInfoCarteCredit(savedEmployee.getInfo_carte_credit())
    				.build());
    	}
    	responseObserver.onCompleted();
    }

    @Override
    public void updateClient(Client request, StreamObserver<Client> responseObserver) {
        if (clientRepository.existsById(request.getId())) {
        	org.anonbnr.web_services.grpc.employees.server.model.Client updatedEmployee = new
        			org.anonbnr.web_services.grpc.employees.server.model.Client(request.getNom(), request.getPrenom(), request.getInfoCarteCredit());
    		updatedEmployee.setId(request.getId());
    		org.anonbnr.web_services.grpc.employees.server.model.Client savedEmployee = clientRepository.save(updatedEmployee);
    		responseObserver.onNext(Client.newBuilder()
    				.setId(savedEmployee.getId())
    				.setNom(savedEmployee.getNom())
    				.setPrenom(savedEmployee.getPrenom())
    				.setInfoCarteCredit(savedEmployee.getInfo_carte_credit())
    				.build());
    	}
    	else
    		responseObserver.onError(new IllegalArgumentException(
    				String.format("Employee with id %s not found", request.getId())));
    	responseObserver.onCompleted();
    }

    @Override
    public void deleteClientById(ClientId request, StreamObserver<Empty> responseObserver) {
        clientRepository.deleteById(request.getId());
        responseObserver.onNext(Empty.getDefaultInstance());
        responseObserver.onCompleted();
    }
}
