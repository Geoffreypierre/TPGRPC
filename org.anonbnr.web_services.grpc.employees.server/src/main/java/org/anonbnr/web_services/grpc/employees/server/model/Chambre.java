package org.anonbnr.web_services.grpc.employees.server.model;

import jakarta.persistence.*;
import javax.imageio.ImageIO;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "numero")
public class Chambre {

    /* Attributes */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numero;
    private String nomChambre;
    private int nb_lit;
    private double prix;
    
    @ManyToOne
    @JoinColumn(name = "id_hotel", referencedColumnName = "idHotel")
    private Hotel hotel;


    @Lob
    private byte[] pic_bytes;

    /* Constructors */
    public Chambre() {
        // Constructeur par défaut
    }

    public Chambre(/*long numero, */String nomChambre, int nb_lit, double prix, Hotel hotel2, String imagePath) throws IOException {
        //this.numero = numero;
        this.nomChambre = nomChambre;
        this.nb_lit = nb_lit;
        this.prix = prix;
        this.hotel = hotel2;
        this.pic_bytes = loadImageAsBytes(imagePath);
    }

    /* Methods */
    private byte[] loadImageAsBytes(String imagePath) throws IOException {
        File imageFile = new File(imagePath);
        if (imageFile.exists()) {
            BufferedImage image = ImageIO.read(imageFile);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "jpg", baos); // Assurez-vous que le format correspond
            return baos.toByteArray();
        } else {
            throw new IOException("Le fichier image n'existe pas : " + imagePath);
        }
    }

    /**
     * Vérifie si une chambre peut être réservée pour une période donnée.
     *
     * @param a Date d'arrivée
     * @param b Date de départ
     * @return true si disponible, false sinon
     */
 
  /*  public boolean can_res(LocalDate a, LocalDate b) {
        for (Reservation r : list_res) {
            LocalDate arrivee = r.getDate_arrivee();
            LocalDate depart = r.getDate_depart();

            // Vérifie si les intervalles se chevauchent
            if ((a.isBefore(depart) && b.isAfter(arrivee)) || // Chevauchement complet
                arrivee.isEqual(a) || arrivee.isEqual(b) ||   // Exactement sur une date existante
                depart.isEqual(a) || depart.isEqual(b)) {     // Exactement sur une autre date
                return false; // La réservation ne peut pas être faite
            }
        }
        return true; // Aucun chevauchement détecté
    }
*/
    /**
     * Ajoute une réservation si la chambre est disponible.
     *
     * @param r La réservation à ajouter
     * @throws IllegalArgumentException Si les dates sont conflictuelles
     */
  /*  public void new_reservation(Reservation r) throws IllegalArgumentException {
        if (can_res(r.getDate_arrivee(), r.getDate_depart())) {
            this.list_res.add(r);
        } else {
            throw new IllegalArgumentException("La chambre est déjà réservée pour cette période.");
        }
    }
*/
    /* Getters and Setters */
    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
    
    public String getnomChambre() {
    	return nomChambre;
    }
    
    public void setnomChambre(String nomChambre) {
    	this.nomChambre = nomChambre;
    }
    public double getPrixParNuit() {
        return prix;
    }
    
    public void setPrixParNuit(double prix) {
        this.prix = prix;
    }
    
    public Hotel getHotelId() {
        return hotel;
    }

    public void setHotelId(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getNb_lit() {
        return nb_lit;
    }

    public void setNb_lit(int nb_lit) {
        this.nb_lit = nb_lit;
    }

    public byte[] getPic_bytes() {
        return pic_bytes;
    }

    public void setPic_bytes(byte[] pic_bytes) {
        this.pic_bytes = pic_bytes;
    }


    @Override
    public String toString() {
        return "Chambre{" +
                "numero=" + numero +
                ", nomChambre=" + nomChambre +
                ", nb_lit=" + nb_lit +
                ", prix=" + prix +
                '}';
    }
    

}
