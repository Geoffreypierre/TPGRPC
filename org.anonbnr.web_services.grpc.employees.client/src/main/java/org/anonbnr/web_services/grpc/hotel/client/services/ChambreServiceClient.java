package org.anonbnr.web_services.grpc.hotel.client.services;

import org.springframework.stereotype.Service;

import com.example.grpc.Chambre;
import com.example.grpc.ChambreCount;
import com.example.grpc.ChambreId;
import com.example.grpc.ChambreList;
import com.example.grpc.Empty;
import com.example.grpc.ChambreServiceGrpc.ChambreServiceBlockingStub;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class ChambreServiceClient {
	
	// Automatically inject the gRPC client stub using the @GrpcClient annotation
		@GrpcClient("chambre-service")
		private ChambreServiceBlockingStub blockingStub;
		
		public ChambreList getAllChambres(Empty request) {
			return blockingStub.getAllChambres(request);
		}
		
		public Chambre getChambreById(ChambreId request) {
			return blockingStub.getChambreById(request);
		}
		
		public ChambreCount getChambreCount(Empty request) {
			return blockingStub.getChambreCount(request);
		}
		
		public Chambre addChambre(Chambre request) {
			return blockingStub.addChambre(request);
		}
		
		public Empty deleteChambreById(ChambreId request) {
			return blockingStub.deleteChambreById(request);
		}
		
		public Chambre updateChambre(Chambre request) {
			return blockingStub.updateChambre(request);
		}
}
