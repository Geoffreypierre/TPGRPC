package org.anonbnr.web_services.grpc.employees.server.data;

import java.time.LocalDate;
import java.util.ArrayList;

import org.anonbnr.web_services.grpc.employees.server.model.Adresse;
import org.anonbnr.web_services.grpc.employees.server.model.Chambre;
import org.anonbnr.web_services.grpc.employees.server.model.Client;
import org.anonbnr.web_services.grpc.employees.server.model.Employee;
import org.anonbnr.web_services.grpc.employees.server.model.Hotel;
import org.anonbnr.web_services.grpc.employees.server.model.Partenaire;
import org.anonbnr.web_services.grpc.employees.server.model.Reservation;
import org.anonbnr.web_services.grpc.employees.server.repository.ChambreRepository;
import org.anonbnr.web_services.grpc.employees.server.repository.ClientRepository;
import org.anonbnr.web_services.grpc.employees.server.repository.EmployeeRepository;
import org.anonbnr.web_services.grpc.employees.server.repository.HotelRepository;
import org.anonbnr.web_services.grpc.employees.server.repository.PartenaireRepository;
import org.anonbnr.web_services.grpc.employees.server.repository.ReservationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeDataLoader {
	
	// Logger instance for logging information
		private Logger logger = LoggerFactory.getLogger(EmployeeDataLoader.class);
	
	@Bean
	CommandLineRunner preloadDatabase(EmployeeRepository repository,HotelRepository hotelRepository, ChambreRepository chambreRepository, ClientRepository clientRepository, ReservationRepository reservationRepository, PartenaireRepository partenaireRepository) {
		return args -> {
			
			ArrayList<Client> listClients = new ArrayList<>();
        	listClients.add(new Client("Thor", "Fils d'Odin", "0123456789"));
        	listClients.add(new Client("Bruce", "Baner", "0000000000"));
        	listClients.add(new Client("John", "Doe", 	"1111111111"));
        	listClients.add(new Client("Tony", "Stark", "9876543210"));
        	
            ArrayList<Partenaire> listPartenaires1 = new ArrayList<>();
            listPartenaires1.add(new Partenaire("Agence du plaisir", 10));
            listPartenaires1.add(new Partenaire("Agence Renne", 40));
            listPartenaires1.add(new Partenaire("Agence du bonheur", 50));
            listPartenaires1.add(new Partenaire("Agence Paris", 50));
        	
            ArrayList<Adresse> adresses = new ArrayList<>();
            adresses.add(new Adresse("Mexique", "Mexico", "Rue Pere Forasse", "75001", 0, 0));
            adresses.add(new Adresse("France", "Paris", "Avenue des Champs-Elysees", "75008", 10, 12345));
            adresses.add(new Adresse("Etats-Unis", "New York", "Broadway", "10007", 50, 67890));
            adresses.add(new Adresse("Japon", "Tokyo", "Shibuya Crossing", "150-0002", 20, 98765));
            adresses.add(new Adresse("Allemagne", "Berlin", "Unter den Linden", "10117", 30, 45678));
            adresses.add(new Adresse("Royaume-Uni", "Londres", "Oxford Street", "W1D 1BS", 15, 11223));
            adresses.add(new Adresse("Espagne", "Barcelone", "La Rambla", "08002", 25, 33456));
            adresses.add(new Adresse("Bresil", "Rio de Janeiro", "Avenida Atlantica", "22021-001", 40, 33567));

            
            ArrayList<Hotel> listHotels = new ArrayList<>();
            //listHotels.add(new Hotel(0, "Casa des Papels", adresses.get(0), 200, 5,listPartenaires1.get(0)));
            listHotels.add(new Hotel("Casa des Papels", adresses.get(0), 200, 5,listPartenaires1.get(0)));
            listHotels.add(new Hotel("Eiffel Retreat", adresses.get(1), 150, 4,listPartenaires1.get(3)));
            listHotels.add(new Hotel("Broadway Bliss", adresses.get(2), 300, 5));
            listHotels.add(new Hotel("Shibuya Serenity", adresses.get(3), 120, 3,listPartenaires1.get(1)));
            listHotels.add(new Hotel("Berlin Boutique", adresses.get(4), 220, 4));
            listHotels.add(new Hotel("Oxford Comfort", adresses.get(5), 180, 3));
            listHotels.add(new Hotel("Rambla Getaway", adresses.get(6), 250, 4));
            listHotels.add(new Hotel("Rio Splendor", adresses.get(7), 310, 5));


            ArrayList<Chambre> listChambres1 = new ArrayList<>();
            listChambres1.add(new Chambre("FestiRoom", 1, 100.0, listHotels.get(2), "src/main/java/Image_chambre/chambre1.jpg"));
            listChambres1.add(new Chambre("MidRoom", 2, 150.0, listHotels.get(1), "src/main/java/Image_chambre/chambre2.jpg"));
            listChambres1.add(new Chambre("BobyRoom", 3, 200.0, listHotels.get(2), "src/main/java/Image_chambre/chambre3.jpg"));

           // Hotel hotel2 = new Hotel(1, "Le Diamant", "France", "Paris","Rue Saint-Honore", "75002", 5, 48, 55, chambres2, partenaires2);
            ArrayList<Reservation> listReservations = new ArrayList<>();
            listReservations.add(new Reservation(LocalDate.of(2024, 6, 2), LocalDate.of(2024, 6, 10), listClients.get(0), listChambres1.get(0)));
            listReservations.add(new Reservation(LocalDate.of(2024, 6, 2), LocalDate.of(2024, 6, 10), listClients.get(3), listChambres1.get(1)));
            listReservations.add(new Reservation(LocalDate.of(2024, 10, 11), LocalDate.of(2024, 10, 20), listClients.get(2), listChambres1.get(0)));
            

            // Enregistrement dans la base de donnees
            for(Client client : listClients) {
            	logger.info("Preloading database with " + clientRepository.save(client));
            }
            for(Partenaire partenaire : listPartenaires1) {
            	logger.info("Preloading database with " + partenaireRepository.save(partenaire));
            }
            for (Hotel hotel : listHotels) {
            	logger.info("Preloading database with " + hotelRepository.save(hotel));
			}
            for(Chambre chambre : listChambres1) {
            	logger.info("Preloading database with " + chambreRepository.save(chambre));
            }
            for(Reservation reservation : listReservations) {
            	logger.info("Preloading database with " + reservationRepository.save(reservation));
            }

        };
	}
}
