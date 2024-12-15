package org.anonbnr.web_services.grpc.hotel.client.services;

import org.springframework.stereotype.Service;

import com.example.grpc.Employee;
import com.example.grpc.EmployeeCount;
import com.example.grpc.EmployeeId;
import com.example.grpc.EmployeeList;
import com.example.grpc.EmployeeServiceGrpc.EmployeeServiceBlockingStub;
import com.example.grpc.Empty;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class EmployeeServiceClient {

	// Automatically inject the gRPC client stub using the @GrpcClient annotation
	@GrpcClient("employee-service")
	private EmployeeServiceBlockingStub blockingStub;
	
	public EmployeeList getAllEmployees(Empty request) {
		return blockingStub.getAllEmployees(request);
	}
	
	public Employee getEmployeeById(EmployeeId request) {
		return blockingStub.getEmployeeById(request);
	}
	
	public EmployeeCount getEmployeeCount(Empty request) {
		return blockingStub.getEmployeeCount(request);
	}
	
	public Employee addEmployee(Employee request) {
		return blockingStub.addEmployee(request);
	}
	
	public Empty deleteEmployeeById(EmployeeId request) {
		return blockingStub.deleteEmployeeById(request);
	}
	
	public Employee updateEmployee(Employee request) {
		return blockingStub.updateEmployee(request);
	}
}
