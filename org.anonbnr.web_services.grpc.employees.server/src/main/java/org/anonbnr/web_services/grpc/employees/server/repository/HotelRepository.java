package org.anonbnr.web_services.grpc.employees.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.anonbnr.web_services.grpc.employees.server.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
