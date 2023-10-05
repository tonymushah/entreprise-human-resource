package itu.etu001844.humanresource.repositories.candidat;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import itu.etu001844.humanresource.classes.candidat.Candidature;

public interface CandidatureRepository extends CrudRepository<Candidature, UUID> {
    
}
