package itu.etu001844.humanresource.classes.candidat.diplome;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Diplome {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID originID;
    private UUID diplomeTypeID;
    private UUID speciliteID;
    private String file;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getOriginID() {
        return originID;
    }

    public void setOriginID(UUID originID) {
        this.originID = originID;
    }

    public UUID getDiplomeTypeID() {
        return diplomeTypeID;
    }

    public void setDiplomeTypeID(UUID diplomeTypeID) {
        this.diplomeTypeID = diplomeTypeID;
    }

    public UUID getSpeciliteID() {
        return speciliteID;
    }

    public void setSpeciliteID(UUID speciliteID) {
        this.speciliteID = speciliteID;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Diplome() {
    }

    public Diplome(UUID originID, UUID diplomeTypeID, UUID speciliteID, String file) {
        this.originID = originID;
        this.diplomeTypeID = diplomeTypeID;
        this.speciliteID = speciliteID;
        this.file = file;
    }

}
