package itu.etu001844.humanresource.classes.service.critary;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GenreCritary {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID genreID;
    private UUID critaryID;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getGenreID() {
        return genreID;
    }

    public void setGenreID(UUID genreID) {
        this.genreID = genreID;
    }

    public GenreCritary() {
    }

    public UUID getCritaryID() {
        return critaryID;
    }

    public void setCritaryID(UUID critaryID) {
        this.critaryID = critaryID;
    }

    public GenreCritary(UUID genreID, UUID critaryID) {
        this.genreID = genreID;
        this.critaryID = critaryID;
    }

}
