package org.anonbnr.web_services.grpc.employees.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;  // Vous devez définir un identifiant unique pour l'entité Client.
    
    private String nom;
    private String prenom;
    private String info_carte_credit;

    // Constructeur par défaut nécessaire pour Hibernate
    //public Client() {}
    
    // Constructeur
    public Client(String nom, String prenom, String info_carte_credit) {
        this.nom = nom;
        this.prenom = prenom;
        this.info_carte_credit = info_carte_credit;
    }
    
    public Client() {
    	
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getInfo_carte_credit() {
        return info_carte_credit;
    }

    public void setInfo_carte_credit(String info_carte_credit) {
        this.info_carte_credit = info_carte_credit;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", info_carte_credit=" + info_carte_credit +
                '}';
    }
}
