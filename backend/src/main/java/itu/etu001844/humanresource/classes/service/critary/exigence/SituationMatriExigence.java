package itu.etu001844.humanresource.classes.service.critary.exigence;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SituationMatriExigence {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID situationMatriID;
    private UUID critaryID;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getSituationMatriID() {
        return situationMatriID;
    }

    public void setSituationMatriID(UUID situationMatriID) {
        this.situationMatriID = situationMatriID;
    }

    public UUID getCritaryID() {
        return critaryID;
    }

    public void setCritaryID(UUID critaryID) {
        this.critaryID = critaryID;
    }

    public SituationMatriExigence() {
    }

    public SituationMatriExigence(UUID situationMatriID, UUID critaryID) {
        this.situationMatriID = situationMatriID;
        this.critaryID = critaryID;
    }

}
