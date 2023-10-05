package itu.etu001844.humanresource.classes.candidat.experience;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID originID;
    private UUID genreID;
    @GeneratedValue
    private Date start;
    private Date end;
    private String proof;
    private UUID owner;

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

    public UUID getGenreID() {
        return genreID;
    }

    public void setGenreID(UUID genreID) {
        this.genreID = genreID;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getProof() {
        return proof;
    }

    public void setProof(String proof) {
        this.proof = proof;
    }

    public Experience() {
    }

    public UUID getOwner() {
        return owner;
    }

    public void setOwner(UUID owner) {
        this.owner = owner;
    }

    public Experience(UUID originID, UUID genreID, Date start, Date end, String proof, UUID owner) {
        this.originID = originID;
        this.genreID = genreID;
        this.start = start;
        this.end = end;
        this.proof = proof;
        this.owner = owner;
    }

    public Experience(UUID originID, UUID genreID, Date start, String proof, UUID owner) {
        this.originID = originID;
        this.genreID = genreID;
        this.start = start;
        this.proof = proof;
        this.owner = owner;
    }

}
