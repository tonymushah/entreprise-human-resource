package itu.etu001844.humanresource.classes.service.critary.exigence;

import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RequiredExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int duration;
    private UUID typeID;
    private Optional<UUID> entrepriseID;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public UUID getTypeID() {
        return typeID;
    }

    public void setTypeID(UUID typeID) {
        this.typeID = typeID;
    }

    public Optional<UUID> getEntrepriseID() {
        return entrepriseID;
    }

    public void setEntrepriseID(Optional<UUID> entrepriseID) {
        this.entrepriseID = entrepriseID;
    }

    public RequiredExperience() {
    }

    public RequiredExperience(int duration, UUID typeID, Optional<UUID> entrepriseID) {
        this.duration = duration;
        this.typeID = typeID;
        this.entrepriseID = entrepriseID;
    }

}
