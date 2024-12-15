package org.anonbnr.web_services.grpc.hotel.client.services;

import org.springframework.stereotype.Service;

import com.example.grpc.Client;
import com.example.grpc.ClientCount;
import com.example.grpc.ClientId;
import com.example.grpc.ClientList;
import com.example.grpc.ClientServiceGrpc.ClientServiceBlockingStub;

import com.example.grpc.Empty;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class ClientServiceClient {
	// Automatically inject the gRPC client stub using the @GrpcClient annotation
		@GrpcClient("client-service")
		private ClientServiceBlockingStub blockingStub;
		
		public ClientList getAllClients(Empty request) {
			return blockingStub.getAllClients(request);
		}
		
		public Client getClientById(ClientId request) {
			return blockingStub.getClientById(request);
		}
		
		public ClientCount getClientCount(Empty request) {
			return blockingStub.getClientCount(request);
		}
		
		public Client addClient(Client request) {
			return blockingStub.addClient(request);
		}
		
		public Empty deleteClientById(ClientId request) {
			return blockingStub.deleteClientById(request);
		}
		
		public Client updateClient(Client request) {
			return blockingStub.updateClient(request);
		}
}
