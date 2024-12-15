package org.anonbnr.web_services.grpc.employees.server.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {

    private String pays, ville, rue, lieuDit;  // Modifié 'lieu_dit' en 'lieuDit' pour respecter les conventions Java

    private int numero, positionGPS;

    // Constructeur par défaut, nécessaire pour JPA
    public Adresse() {
    }

    // Constructeur avec paramètres, selon vos besoins
    public Adresse(String pays, String ville, String rue, String lieuDit, int numero, int positionGPS) {
        this.pays = pays;
        this.ville = ville;
        this.rue = rue;
        this.lieuDit = lieuDit;
        this.numero = numero;
        this.positionGPS = positionGPS;
    }

    // Getters et setters
    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getLieuDit() {
        return lieuDit;
    }

    public void setLieuDit(String lieuDit) {
        this.lieuDit = lieuDit;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPositionGPS() {
        return positionGPS;
    }

    public void setPositionGPS(int positionGPS) {
        this.positionGPS = positionGPS;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "pays='" + pays + '\'' +
                ", ville='" + ville + '\'' +
                ", rue='" + rue + '\'' +
                ", lieuDit='" + lieuDit + '\'' +
                ", numero=" + numero +
                ", positionGPS=" + positionGPS +
                '}';
    }
}
