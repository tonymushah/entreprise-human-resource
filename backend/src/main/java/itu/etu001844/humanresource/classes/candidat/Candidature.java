package itu.etu001844.humanresource.classes.candidat;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Candidature {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID candidatID;
    private boolean isValid;
    private UUID annonceID;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCandidatID() {
        return candidatID;
    }

    public void setCandidatID(UUID candidatID) {
        this.candidatID = candidatID;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    public UUID getAnnonceID() {
        return annonceID;
    }

    public void setAnnonceID(UUID annonceID) {
        this.annonceID = annonceID;
    }

    public Candidature(UUID candidatID, boolean isValid, UUID annonceID) {
        this.candidatID = candidatID;
        this.isValid = isValid;
        this.annonceID = annonceID;
    }

    public Candidature() {
    }

}
