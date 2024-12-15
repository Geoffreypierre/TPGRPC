package org.anonbnr.web_services.grpc.hotel.client.services;

import com.example.grpc.Hotel;
import com.example.grpc.HotelCount;
import com.example.grpc.HotelId;
import com.example.grpc.HotelList;

import org.springframework.stereotype.Service;

import com.example.grpc.Empty;
import com.example.grpc.HotelServiceGrpc.HotelServiceBlockingStub;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class HotelServiceClient {

	// Automatically inject the gRPC client stub using the @GrpcClient annotation
	@GrpcClient("hotel-service")
	private HotelServiceBlockingStub blockingStub;
	
	public HotelList getAllHotels(Empty request) {
		return blockingStub.getAllHotels(request);
	}
	
	public Hotel getHotelById(HotelId request) {
		return blockingStub.getHotelById(request);
	}
	
	public HotelCount getHotelCount(Empty request) {
		return blockingStub.getHotelCount(request);
	}
	
	public Hotel addHotel(Hotel request) {
		return blockingStub.addHotel(request);
	}
	
	public Empty deleteHotelById(HotelId request) {
		return blockingStub.deleteHotelById(request);
	}
	
	public Hotel updateHotel(Hotel request) {
		return blockingStub.updateHotel(request);
	}
}
