package itu.etu001844.humanresource.classes;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nom;
    private String prenom;
    private UUID genreID;
    private Date dateNaissance;
    private String email;
    private String telephone;
    private UUID situationID;
    private int enfants;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public UUID getGenreID() {
        return genreID;
    }

    public void setGenreID(UUID genreID) {
        this.genreID = genreID;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public UUID getSituationID() {
        return situationID;
    }

    public void setSituationID(UUID situationID) {
        this.situationID = situationID;
    }

    public int getEnfants() {
        return enfants;
    }

    public void setEnfants(int enfants) {
        this.enfants = enfants;
    }

    public Candidat(String nom, String prenom, UUID genreID, Date dateNaissance, String email, String telephone,
            UUID situationID, int enfants) {
        this.nom = nom;
        this.prenom = prenom;
        this.genreID = genreID;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.situationID = situationID;
        this.enfants = enfants;
    }

    public Candidat() {
    }

}