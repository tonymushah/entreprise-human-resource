package itu.etu001844.humanresource.classes.service.critary;

import java.util.Date;
import java.util.UUID;

import itu.etu001844.humanresource.enums.CompStrategy;
import itu.etu001844.humanresource.enums.CompType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AgeCritary {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID critaryID;
    private Date birthday;
    private CompType compType;
    private CompStrategy strategy;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCritaryID() {
        return critaryID;
    }

    public void setCritaryID(UUID critaryID) {
        this.critaryID = critaryID;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public CompType getCompType() {
        return compType;
    }

    public void setCompType(CompType compType) {
        this.compType = compType;
    }

    public CompStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(CompStrategy strategy) {
        this.strategy = strategy;
    }

    public AgeCritary() {
    }

    public AgeCritary(UUID critaryID, Date birthday, CompType compType, CompStrategy strategy) {
        this.critaryID = critaryID;
        this.birthday = birthday;
        this.compType = compType;
        this.strategy = strategy;
    }

}
