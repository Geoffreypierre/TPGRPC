package org.anonbnr.web_services.grpc.employees.server.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.anonbnr.web_services.grpc.employees.server.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}