package itu.etu001844.humanresource.classes.service.critary;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Critary {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID annonceID;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getAnnonceID() {
        return annonceID;
    }

    public void setAnnonceID(UUID annonceID) {
        this.annonceID = annonceID;
    }

    public Critary(UUID annonceID) {
        this.annonceID = annonceID;
    }

    public Critary() {
    }

}
