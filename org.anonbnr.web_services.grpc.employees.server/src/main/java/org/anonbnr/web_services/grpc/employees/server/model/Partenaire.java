package org.anonbnr.web_services.grpc.employees.server.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Partenaire {
	/*Attributes*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_partenaire;
	private String Nom_partenaire;
	private int reduc_pourcentage;
	
	public Partenaire(/*long id_part,*/ String nom_partenaire, int reduc_pourcentage) {
		//this.id_partenaire = id_part;
		this.Nom_partenaire = nom_partenaire;
		this.reduc_pourcentage = reduc_pourcentage;
		
	}
	
	public Partenaire() {
	}
	
	public long getIdPartenaire() {
		return id_partenaire;
	}
	
	public void setIdPartenaire(long id_partenaire) {
		this.id_partenaire = id_partenaire;
	}
	
	public String getNom_partenaire() {
		return Nom_partenaire;
	}
	public void setNom_partenaire(String nom_partenaire) {
		Nom_partenaire = nom_partenaire;
	}
	public long getId_partenaire() {
		return id_partenaire;
	}
	public void setId_partenaire(long id_part) {
		this.id_partenaire = id_part;
	}
	
	
	public int getReduc_pourcentage() {
		return reduc_pourcentage;
	}
	
	public void setReduc_pourcentage(int reduc_pourcentage) {
		this.reduc_pourcentage = reduc_pourcentage;
	}
	
	
	

}
