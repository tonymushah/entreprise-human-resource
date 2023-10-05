package itu.etu001844.humanresource.classes.service.critary.question;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String question;
    private UUID critaryID;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Question() {
    }

    public UUID getCritaryID() {
        return critaryID;
    }

    public void setCritaryID(UUID critaryID) {
        this.critaryID = critaryID;
    }

    public Question(String question, UUID critaryID) {
        this.question = question;
        this.critaryID = critaryID;
    }

    

}
