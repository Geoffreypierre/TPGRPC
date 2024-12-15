package org.anonbnr.web_services.grpc.employees.server.model;

import jakarta.persistence.*;


//import java.util.Date;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Reservation{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_chambre", referencedColumnName = "numero")
    @JsonIgnore
    //@JsonBackReference
    private Chambre chambre;

    //@Temporal(TemporalType.DATE)
    private LocalDate date_arrivee;

    //@Temporal(TemporalType.DATE)
    private LocalDate date_depart;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")  // Si vous avez une entité Client
    private Client client;

    // Constructeur par défaut requis par Hibernate
    public Reservation() {
    }
    // Constructeur
    public Reservation(LocalDate date_arrivee, LocalDate date_depart, Client client , Chambre chambre) {
        this.date_arrivee = date_arrivee;
        this.date_depart = date_depart;
        this.client = client;
        this.chambre = chambre;
    }

    // Getters et setters
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate_arrivee() {
        return date_arrivee;
    }

    public void setDate_arrivee(LocalDate date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public LocalDate getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(LocalDate date_depart) {
        this.date_depart = date_depart;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
        //chambre.addReservation(this);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date_arrivee=" + date_arrivee +
                ", date_depart=" + date_depart +
                ", client=" + client +
                ", [chambre=n°" + chambre + "-" + "]" + 
                '}';
    }
}
