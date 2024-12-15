package org.anonbnr.web_services.grpc.employees.server.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;


@Entity
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idHotel;
    private String nom;
    //@Embeddable

    private float prix;
    private int nombreEtoiles;
    private Adresse adresse;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "partenaire_id") // Colonne de clé étrangère
    private Partenaire partenaire;
    
    // Constructeur par défaut
    public Hotel() {}
    
	public Hotel(/*long idHotel,*/ String nom, org.anonbnr.web_services.grpc.employees.server.model.Adresse adresse, float prix, int nombreEtoiles, org.anonbnr.web_services.grpc.employees.server.model.Partenaire partenaire) {
		//super();
		//this.idHotel = idHotel;
		this.nom = nom;
		this.adresse = adresse;
		this.prix = prix;
		this.nombreEtoiles = nombreEtoiles;
		this.partenaire = partenaire;
	}
	
	public Hotel(/*long idHotel, */String nom, org.anonbnr.web_services.grpc.employees.server.model.Adresse adresse, float prix, int nombreEtoiles) {
		//super();
		//this.idHotel = idHotel;
		this.nom = nom;
		this.adresse = adresse;
		this.prix = prix;
		this.nombreEtoiles = nombreEtoiles;
	}
	
	public long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(long idHotel) {
		this.idHotel = idHotel;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getNombreEtoiles() {
		return nombreEtoiles;
	}
	public void setNombreEtoiles(int nombreEtoiles) {
		this.nombreEtoiles = nombreEtoiles;
	}

    public Partenaire getPartenaire() {
		if (partenaire == null) {
			return new Partenaire("Aucun partenariat", 0);
		}
		else 
			return partenaire; 
    }
    
    public void setPartenaire(Partenaire partenaire) {
    	this.partenaire = partenaire;
    }

}
