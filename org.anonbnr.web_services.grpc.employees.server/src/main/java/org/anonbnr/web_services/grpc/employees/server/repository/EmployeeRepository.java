package org.anonbnr.web_services.grpc.employees.server.repository;

import org.anonbnr.web_services.grpc.employees.server.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
