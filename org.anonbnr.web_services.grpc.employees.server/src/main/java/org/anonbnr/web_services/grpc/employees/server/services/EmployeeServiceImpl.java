package org.anonbnr.web_services.grpc.employees.server.services;

import org.anonbnr.web_services.grpc.employees.server.repository.EmployeeRepository;

import com.example.grpc.Employee;
import com.example.grpc.EmployeeCount;
import com.example.grpc.EmployeeId;
import com.example.grpc.EmployeeList;
import com.example.grpc.EmployeeServiceGrpc.EmployeeServiceImplBase;
import com.example.grpc.Empty;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EmployeeServiceImpl extends EmployeeServiceImplBase {
	
	private final EmployeeRepository repository;
	
	public EmployeeServiceImpl(EmployeeRepository repository) {
		this.repository = repository;
	}
    
    @Override
    public void getAllEmployees(Empty request, StreamObserver<EmployeeList> responseObserver) {
    	EmployeeList.Builder builder = EmployeeList.newBuilder();
    	repository.findAll().forEach(employee -> builder.addEmployees(
    			Employee.newBuilder()
    			.setId(employee.getId())
    			.setName(employee.getName())
    			.setRole(employee.getRole())
    			.setEmail(employee.getEmail())
    			.build()
		));
    	
    	responseObserver.onNext(builder.build());
    	responseObserver.onCompleted();
    }
    
    @Override
    public void getEmployeeCount(Empty request, StreamObserver<EmployeeCount> responseObserver) {
    	responseObserver.onNext(EmployeeCount.newBuilder()
    			.setCount((int)repository.count()).build());
    	responseObserver.onCompleted();
    }
    
    @Override
    public void getEmployeeById(EmployeeId request, StreamObserver<Employee> responseObserver) {
    	repository.findById(request.getId()).ifPresentOrElse(
    			employee -> responseObserver.onNext(Employee.newBuilder()
    					.setId(employee.getId())
    					.setName(employee.getName())
    					.setRole(employee.getRole())
    					.setEmail(employee.getEmail())
    					.build()),
    			() -> responseObserver.onError(new IllegalArgumentException(
        				String.format("Employee with id %s not found", request.getId())))
		);
    	
    	responseObserver.onCompleted();
    }
    
    @Override
    public void addEmployee(Employee request, StreamObserver<Employee> responseObserver) {
    	if (repository.existsById(request.getId()))
    		responseObserver.onError(new IllegalArgumentException(
    				String.format("Employee ID %s already exists", request.getId())));
    	else {
    		org.anonbnr.web_services.grpc.employees.server.model.Employee newEmployee = new
    				org.anonbnr.web_services.grpc.employees.server.model.Employee(request.getName(), request.getRole(), request.getEmail());
    		org.anonbnr.web_services.grpc.employees.server.model.Employee savedEmployee = repository.save(newEmployee);
    		responseObserver.onNext(Employee.newBuilder()
    				.setId(savedEmployee.getId())
    				.setName(savedEmployee.getName())
    				.setRole(savedEmployee.getRole())
    				.setEmail(savedEmployee.getEmail())
    				.build());
    	}
    	responseObserver.onCompleted();
    }
    
    @Override
    public void deleteEmployeeById(EmployeeId request, StreamObserver<Empty> responseObserver) {
    	if (repository.existsById(request.getId())) {
    		repository.deleteById(request.getId());
    		responseObserver.onNext(Empty.newBuilder().build());
    	}
    	else
    		responseObserver.onError(new IllegalArgumentException(
    				String.format("Employee with id %s not found", request.getId())));
    	responseObserver.onCompleted();
    }
    
    @Override
    public void updateEmployee(Employee request, StreamObserver<Employee> responseObserver) {
    	if (repository.existsById(request.getId())) {
    		org.anonbnr.web_services.grpc.employees.server.model.Employee updatedEmployee = new
    				org.anonbnr.web_services.grpc.employees.server.model.Employee(request.getName(), request.getRole(), request.getEmail());
    		updatedEmployee.setId(request.getId());
    		org.anonbnr.web_services.grpc.employees.server.model.Employee savedEmployee = repository.save(updatedEmployee);
    		responseObserver.onNext(Employee.newBuilder()
    				.setId(savedEmployee.getId())
    				.setName(savedEmployee.getName())
    				.setRole(savedEmployee.getRole())
    				.setEmail(savedEmployee.getEmail())
    				.build());
    	}
    	else
    		responseObserver.onError(new IllegalArgumentException(
    				String.format("Employee with id %s not found", request.getId())));
    	responseObserver.onCompleted();
    }
}
