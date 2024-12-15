package org.anonbnr.web_services.grpc.hotel.client.services;

import org.springframework.stereotype.Service;

import com.example.grpc.Empty;
import com.example.grpc.Reservation;
import com.example.grpc.ReservationCount;
import com.example.grpc.ReservationId;
import com.example.grpc.ReservationList;
import com.example.grpc.ReservationServiceGrpc.ReservationServiceBlockingStub;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class ReservationServiceClient {
	// Automatically inject the gRPC client stub using the @GrpcClient annotation
	@GrpcClient("reservation-service")
	private ReservationServiceBlockingStub blockingStub;
	
	public ReservationList getAllReservations(Empty request) {
		return blockingStub.getAllReservations(request);
	}
	
	public Reservation getReservationById(ReservationId request) {
		return blockingStub.getReservationById(request);
	}
	
	public ReservationCount getReservationCount(Empty request) {
		return blockingStub.getReservationCount(request);
	}
	
	public Reservation addReservation(Reservation request) {
		return blockingStub.addReservation(request);
	}
	
	public Empty deleteReservationById(ReservationId request) {
		return blockingStub.deleteReservationById(request);
	}
	/*
	public Reservation updateReservation(Reservation request) {
		return blockingStub.updateReservation(request);
	}
	*/
}
