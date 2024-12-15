package org.anonbnr.web_services.grpc.hotel.client.services;

import org.springframework.stereotype.Service;

import com.example.grpc.Empty;
import com.example.grpc.Partenaire;
import com.example.grpc.PartenaireCount;
import com.example.grpc.PartenaireId;
import com.example.grpc.PartenaireList;
import com.example.grpc.PartenaireServiceGrpc.PartenaireServiceBlockingStub;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class PartenaireServiceClient {

	// Automatically inject the gRPC client stub using the @GrpcClient annotation
	@GrpcClient("partenaire-service")
	private PartenaireServiceBlockingStub blockingStub;
	
	public PartenaireList getAllPartenaires(Empty request) {
		return blockingStub.getAllPartenaires(request);
	}
	
	public Partenaire getPartenaireById(PartenaireId request) {
		return blockingStub.getPartenaireById(request);
	}
	
	public PartenaireCount getPartenaireCount(Empty request) {
		return blockingStub.getPartenaireCount(request);
	}
	
	public Partenaire addPartenaire(Partenaire request) {
		return blockingStub.addPartenaire(request);
	}
	
	public Empty deletePartenaireById(PartenaireId request) {
		return blockingStub.deletePartenaireById(request);
	}
	
	public Partenaire updatePartenaire(Partenaire request) {
		return blockingStub.updatePartenaire(request);
	}
}
