package itu.etu001844.humanresource.classes.service;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AnnonceService {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private Date limitDate;
    private Date addDate;
    private UUID serviceID;
    private UUID critaryID;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public UUID getServiceID() {
        return serviceID;
    }

    public void setServiceID(UUID serviceID) {
        this.serviceID = serviceID;
    }

    public UUID getCritaryID() {
        return critaryID;
    }

    public void setCritaryID(UUID critaryID) {
        this.critaryID = critaryID;
    }

    public AnnonceService() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AnnonceService(String title, Date limitDate, Date addDate, UUID serviceID, UUID critaryID) {
        this.title = title;
        this.limitDate = limitDate;
        this.addDate = addDate;
        this.serviceID = serviceID;
        this.critaryID = critaryID;
    }

    public AnnonceService(Date limitDate, Date addDate, UUID serviceID, UUID critaryID) {
        this.limitDate = limitDate;
        this.addDate = addDate;
        this.serviceID = serviceID;
        this.critaryID = critaryID;
    }

}
