package org.anonbnr.web_services.grpc.hotel.client.cli;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;

import org.anonbnr.web_services.grpc.hotel.client.services.ChambreServiceClient;
import org.anonbnr.web_services.grpc.hotel.client.services.ClientServiceClient;
import org.anonbnr.web_services.grpc.hotel.client.services.HotelServiceClient;
import org.anonbnr.web_services.grpc.hotel.client.services.ReservationServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.grpc.Chambre;
import com.example.grpc.ChambreId;
import com.example.grpc.ChambreList;
import com.example.grpc.Client;
import com.example.grpc.ClientId;
import com.example.grpc.Empty;

import com.example.grpc.Hotel;
import com.example.grpc.HotelCount;
import com.example.grpc.HotelId;
import com.example.grpc.HotelList;
import com.example.grpc.Reservation;
import com.example.grpc.ReservationList;

import io.grpc.StatusRuntimeException;

@Component
public class HotelClientCLI implements CommandLineRunner {
	
	@Autowired
	private HotelServiceClient hotelServiceClient;
	@Autowired
	private ChambreServiceClient chambreServiceClient;
	@Autowired
	private ReservationServiceClient reservationServiceClient;
	@Autowired
	private ClientServiceClient clientServiceClient;

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String choice = "";
		
		System.out.println("Welcome to the Hotel Service CLI");
		
		do {
			menu();
			choice = scanner.nextLine().trim();
			
			switch(choice) {
            case "1": // Display all hotels
                handleDisplayAllHotels();
                break;
                
            case "2": // Get number of hotels
                handleGetHotelCount();
                break;
                
            case "3": // Get hotel by ID
                handleGetHotelById(scanner);
                break;
                
            case "4": // Display all rooms
                handleDisplayAllRooms();
                break;
               
            case "5": // Display all offre
            	handleResearchOffre();
                break;
                
            case "6": // Display all offre by ID
            	handleResearchOffreByParam(scanner);
                break;

            case "7": // Register reservation
            	handleRegisterReservation(scanner);
                break; 
            
            case "8": // Display all offre by ID
            	handleDisplayAllReservation();
                break; 
                
            case "9": // Get hotel by ID
                handleGetChambreById(scanner);
                break;
                
			case "q":
				System.out.println("Exiting CLI...");
				System.exit(0);
				break;
			
			default:
				System.out.println("Invalid option. Please try again.");
			}
			
		} while (!choice.equalsIgnoreCase("q"));
	}

	private void menu() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\nMenu:")
			.append("\n1. List all hotels")
			.append("\n2. Get total hotel count")
	        .append("\n3. Obtenir un hôtel par ID.")
	        .append("\n4. Afficher toutes les chambres.")
	        .append("\n5. Afficher toutes les offres.")
	        .append("\n6. Chercher une offre de chambre")
	        .append("\n7. Réserver une chambre.")
	        .append("\n8. Afficher toutes les reservations")
	        .append("\n9. Obtenir un chambre par ID.")
			.append("\nq. Quit")
			.append("\nEnter your choice: ");
		
		System.out.println(buffer);
	}

	private void handleDisplayAllHotels() {
		// TODO Auto-generated method stub
		try {
			HotelList hotelList = hotelServiceClient.getAllHotels(
					Empty.newBuilder().build());
			System.out.println("Hotel:");
			hotelList.getHotelList().forEach(hotel ->
					//System.out.printl("[idHotel=  %d  , nom= %s , nombreEtoiles= %d"/*, prix= %d  , adresse= + %s */+"]",hotel.getIdHotel(), hotel.getNom(), hotel.getPrix(), hotel.getNombreEtoiles(), hotel.getAdresse())
					System.out.println("Hotel [idHotel=" + hotel.getIdHotel() + ", nom=" + hotel.getNom() + ", prix=" + hotel.getPrix() + ", nombreEtoiles=" + hotel.getNombreEtoiles()+ ", adresse=" + hotel.getAdresse() +  ", [Partenaire="+ hotel.getPartenaire() +"]]")
					//System.out.println(hotel)
					);
					
		} catch (StatusRuntimeException e) {
            System.err.println("Error: " + e.fillInStackTrace());
        }
	}
	
	private void handleGetHotelCount() {
		// TODO Auto-generated method stub
		try {
			HotelCount count = hotelServiceClient.getHotelCount(Empty.newBuilder().build());
			System.out.println("Total number of hotels: " + count.getCount());
		} catch (StatusRuntimeException e) {
            //System.err.println("Error: " + e.fillInStackTrace());
			e.printStackTrace();
        }
	}
	
	private void handleGetHotelById(Scanner scanner) {
		// TODO Auto-generated method stub
		long id = 0;
		try {
			System.out.print("Enter hotel ID: ");
			id = Long.parseLong(scanner.nextLine().trim());
			Hotel hotel = hotelServiceClient.getHotelById(
					HotelId.newBuilder().setIdHotel(id).build());
			
			System.out.println("Hotel [idHotel=" + hotel.getIdHotel() + ", nom=" + hotel.getNom() + ", prix=" + hotel.getPrix() + ", nombreEtoiles=" + hotel.getNombreEtoiles()+ ", adresse=" + hotel.getAdresse() + "]");
		} catch (NumberFormatException e) {
            System.err.println("Error: Invalid Hotel ID " + e.getMessage());
        } catch (StatusRuntimeException e) {
        	System.err.println("Error: No Hotel exists with ID " + id);
        }
	}

	private void handleGetChambreById(Scanner scanner) {
	    long id = 0;
	    try {
	        System.out.print("Enter Chambre ID: ");
	        id = Long.parseLong(scanner.nextLine().trim());

	        // Récupérer les détails de la chambre via le client gRPC.
	        Chambre chambre = chambreServiceClient.getChambreById(
	                ChambreId.newBuilder().setNumero(id).build());

	        // Affichage des détails de la chambre.
	        System.out.println("Chambre{" +
	                "numero=" + chambre.getNumero() +
	                ", nomChambre=" + chambre.getNomChambre() +
	                ", nb_lit=" + chambre.getNbLit() +
	                ", prix=" + chambre.getPrix() +
	                '}');
	        System.out.println("-----------------------------------------");

	        // Décodage de l'image Base64 en byte[].
	        String imageString = chambre.getImagePath();
	        if (imageString == null || imageString.isEmpty()) {
	            System.out.println("Aucune image associée à cette chambre.");
	            return;
	        }

	        byte[] byteArray = Base64.getDecoder().decode(imageString);

	        // Lecture des données d'image.
	        ByteArrayInputStream bis = new ByteArrayInputStream(byteArray);
	        BufferedImage bImage2 = ImageIO.read(bis);
	        if (bImage2 == null) {
	            System.out.println("Les données d'image ne sont pas valides.");
	            return;
	        }

	        // Chemin de sauvegarde dans le dossier img du projet client.
	        String img = System.getProperty("user.dir") + "/img";
	        File dossier = new File(img);
	        if (!dossier.exists()) {
	            boolean created = dossier.mkdirs();
	            if (!created) {
	                System.out.println("Pas de dossier img.");
	                return;
	            }
	        }

	        // Création et écriture du fichier image.
	        String nomFichier = "chambre" + chambre.getNumero() + ".jpg";
	        File fichierImage = new File(dossier, nomFichier);
	        ImageIO.write(bImage2, "jpg", fichierImage);

	        System.out.println("Image créée et enregistrée dans : " + fichierImage.getAbsolutePath());

	    } catch (NumberFormatException e) {
	        System.err.println("Error: Invalid Chambre ID " + e.getMessage());
	    } catch (StatusRuntimeException e) {
	        System.err.println("Error: No Chambre exists with ID " + id);
	    } catch (IOException e) {
	        System.err.println("Error: Problem handling the image - " + e.getMessage());
	    }
	}


	private void handleDisplayAllReservation() {
		// TODO Auto-generated method stub
		try {
			ReservationList reservationList = reservationServiceClient.getAllReservations(
					Empty.newBuilder().build());
			System.out.println("Reservation:");
			reservationList.getReservationsList().forEach(reservation ->
					System.out.println("Reservation{ id=" + reservation.getId() + ", date_arrivee=" + reservation.getDateArrivee() + ", date_depart=" + reservation.getDateDepart() + ", client=" + reservation.getClient() + ", chambre=" + reservation.getChambre() +'}')); 
			                //", [chambre=n°" + chambre.getNumero() + "-" +"nom: "+ chambre.getnomChambre() +" - Hotel :"+chambre.getHotel().getNom()+ "]" + 
			                
		} catch (StatusRuntimeException e) {
            System.err.println("Error: " + e.fillInStackTrace());
        }
	}

	private void handleRegisterReservation(Scanner scanner) {
		// TODO Auto-generated method stub
		try {
	        System.out.print("Entrez l'ID de la chambre que vous souhaitez réserver : ");
			String idchambreX = scanner.nextLine().trim();
			Chambre chambre = chambreServiceClient.getChambreById(ChambreId.newBuilder().setNumero(Long.parseLong(idchambreX)).build());
	        System.out.print("Entrez l'ID du client : ");
			String idclientX = scanner.nextLine().trim();
			Client client = clientServiceClient.getClientById(ClientId.newBuilder().setId(Long.parseLong(idclientX)).build());
	        // Saisie des dates de réservation
	        System.out.print("Entrez la date d'arrivée (format YYYY-MM-DD) : ");
	        String dateArriveeStr = scanner.nextLine().trim();
	        LocalDate dateArrivee = LocalDate.parse(dateArriveeStr);

	        System.out.print("Entrez la date de départ (format YYYY-MM-DD) : ");
	        String dateDepartStr = scanner.nextLine().trim();
	        LocalDate dateDepart = LocalDate.parse(dateDepartStr);

	        // Vérification de la disponibilité de la chambre pour les dates sélectionnées
	        if (!filterByDate(chambre, dateArriveeStr, dateDepartStr)) {
	            System.out.println("La chambre n'est pas disponible pour les dates sélectionnées.");
	            return;
	        }
			
			Reservation newReservation = Reservation.newBuilder()
					.setChambre(chambre)
					.setClient(client)
					.setDateArrivee(dateArriveeStr)
					.setDateDepart(dateDepartStr)
					.build();
			
			Reservation addedReservation = reservationServiceClient.addReservation(newReservation);
            if (addedReservation != null) {
                System.out.println("Réservation effectuée avec succès !");
                System.out.println("Détails de la réservation : ");
                System.out.println("Reservation{ id=" + addedReservation.getId() + ", date_arrivee=" + addedReservation.getDateArrivee() + ", date_depart=" + addedReservation.getDateDepart() + ", client=" + addedReservation.getClient() + ", chambre=" + addedReservation.getChambre() +'}'); 
            } else {
                System.out.println("Erreur lors de la création de la réservation.");
            }
		} catch (StatusRuntimeException e) {
            System.err.println("Error: " + e.getStatus().getDescription());
        }
	}

	private void handleResearchOffre() {
		// TODO Auto-generated method stub
		try {
			ChambreList chambreList = chambreServiceClient.getAllChambres(
					Empty.newBuilder().build());
			System.out.println("Offre:");
			chambreList.getChambresList().forEach(chambre ->
			System.out.println(toStringForResearch(chambre)));
		} catch (StatusRuntimeException e) {
            System.err.println("Error: " + e.fillInStackTrace());
        }
	}

	private void handleDisplayAllRooms() {
		// TODO Auto-generated method stub
		try {
			ChambreList chambreList = chambreServiceClient.getAllChambres(
					Empty.newBuilder().build());
			System.out.println("Chambre:");
			chambreList.getChambresList().forEach(chambre ->
			System.out.println("Chambre{" + "numero=" + chambre.getNumero() +", nomChambre=" + chambre.getNomChambre() +", nb_lit=" + chambre.getNbLit() +", prix=" + chambre.getPrix() +'}')); 
			                //", [chambre=n°" + chambre.getNumero() + "-" +"nom: "+ chambre.getnomChambre() +" - Hotel :"+chambre.getHotel().getNom()+ "]" + 
			                
		} catch (StatusRuntimeException e) {
            System.err.println("Error: " + e.fillInStackTrace());
        }
	}
	
	private void handleResearchOffreByParam(Scanner scanner) {
	    try {
	        // Demander les paramètres à l'utilisateur
	        System.out.print("Entrez la ville souhaitée: ");
	        String ville = scanner.nextLine().trim();

	        System.out.print("Entrez la date de début souhaitée (format: yyyy-MM-dd): ");
	        String dateDeb = scanner.nextLine().trim();

	        System.out.print("Entrez la date de fin souhaitée (format: yyyy-MM-dd): ");
	        String dateFin = scanner.nextLine().trim();

	        System.out.println("Entrez un nombre de personnes à héberger: ");
	        String nbPersonnes = scanner.nextLine().trim();
	        Integer number = Integer.valueOf(nbPersonnes);
	        int nbPersonnes2 = number.intValue();

	        System.out.println("Entrez un nombre d'étoiles minimum:");
	        String nbEtoiles = scanner.nextLine().trim();
	        Integer number2 = Integer.valueOf(nbEtoiles);
	        int nbEtoiles2 = number2.intValue();

	        // Récupérer toutes les chambres via gRPC
	        ChambreList chambreList = chambreServiceClient.getAllChambres(Empty.newBuilder().build());

	        // Vérifier si des chambres ont été récupérées
	        if (chambreList != null && chambreList.getChambresCount() > 0) {
	            // Filtrer les chambres selon les critères
	            List<Chambre> chambresFiltrees = chambreList.getChambresList().stream()
	                .filter(chambre -> filterByVille(chambre, ville))
	                .filter(chambre -> filterByDate(chambre, dateDeb, dateFin))
	                .filter(chambre -> filterByNbPersonnes(chambre, nbPersonnes2))
	                .filter(chambre -> filterByNbEtoiles(chambre, nbEtoiles2))
	                .collect(Collectors.toList());

	            // Affichage des chambres filtrées
	            if (!chambresFiltrees.isEmpty()) {
	                System.out.println("Liste des chambres disponibles :");
	                chambresFiltrees.forEach(chambre -> System.out.println(chambre));
	            } else {
	                System.out.println("Aucune chambre ne correspond à vos critères.");
	            }
	        } else {
	            System.out.println("Aucune chambre disponible.");
	        }
	    } catch (Exception e) {
	        System.err.println("Erreur : " + e.getMessage());
	    }
	}

	
    public double getreducPrix(Chambre chambre) {
    	Double pourcentage = (double) chambre.getHotel().getPartenaire().getReducPourcentage();
    	double valeurPourcentage = (pourcentage / 100) * chambre.getPrix();
    	double prix_reduc = chambre.getPrix() - valeurPourcentage;
    	return prix_reduc;
    }
    public String toStringForResearch(Chambre chambre) {
        return "Chambre{" +
        		"[Hotel=" + chambre.getHotel().getNom() +
        		" - Partenaire=" + chambre.getHotel().getPartenaire().getNomPartenaire() + 
                "], n°" + chambre.getNumero() +
                " , nom =" + chambre.getNomChambre()+
                ", nb_lit=" + chambre.getNbLit() +
                ", prix=" + getreducPrix(chambre) +
                '}';
    }
    
    private boolean filterByVille(Chambre chambre, String ville) {
        return chambre.getHotel().getAdresse().getVille().equalsIgnoreCase(ville);
    }
    private boolean filterByDate(Chambre chambre, String dateDeb, String dateFin) {
        ReservationList reservationList = reservationServiceClient.getAllReservations(Empty.newBuilder().build());

        try {
            LocalDate dateDebutRecherche = LocalDate.parse(dateDeb, DateTimeFormatter.ISO_DATE);
            LocalDate dateFinRecherche = LocalDate.parse(dateFin, DateTimeFormatter.ISO_DATE);

            if (dateDebutRecherche.isAfter(dateFinRecherche)) {
                throw new IllegalArgumentException("La date de début doit être antérieure ou égale à la date de fin.");
            }

            for (Reservation reservation : reservationList.getReservationsList()) {
                long numeroChambreReservation = reservation.getChambre().getNumero();

                if (numeroChambreReservation == chambre.getNumero()) {
                    LocalDate dateDebutRes = LocalDate.parse(reservation.getDateArrivee(), DateTimeFormatter.ISO_DATE);
                    LocalDate dateFinRes = LocalDate.parse(reservation.getDateDepart(), DateTimeFormatter.ISO_DATE);

                    if (!(dateFinRecherche.isBefore(dateDebutRes) || dateDebutRecherche.isAfter(dateFinRes))) {
                        return false;
                    }
                }
            }
            return true;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Les dates fournies ne sont pas valides : " + e.getMessage());
        }
    }
    private boolean filterByNbPersonnes(Chambre chambre, int nbPersonnes) {
        return chambre.getNbLit() >= nbPersonnes;
    }
    private boolean filterByNbEtoiles(Chambre chambre, int nbEtoiles) {
        return chambre.getHotel().getNombreEtoiles() >= nbEtoiles; 
    }

}

