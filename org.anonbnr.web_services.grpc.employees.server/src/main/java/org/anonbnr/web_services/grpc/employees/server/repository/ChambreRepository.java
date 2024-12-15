package org.anonbnr.web_services.grpc.employees.server.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.anonbnr.web_services.grpc.employees.server.model.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre, Long>{
	 // Méthode personnalisée pour trouver des chambres par l'ID de l'hôtel
    //List<Chambre> findByHotelId(long hotelId);
}
