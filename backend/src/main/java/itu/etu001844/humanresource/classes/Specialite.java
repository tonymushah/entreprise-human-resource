package itu.etu001844.humanresource.classes;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Specialite
 */
@Entity
public class Specialite {
    @Id
    private UUID id;
    private String name;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Specialite(String name) {
        this.name = name;
    }
    public Specialite() {
    }
    
}