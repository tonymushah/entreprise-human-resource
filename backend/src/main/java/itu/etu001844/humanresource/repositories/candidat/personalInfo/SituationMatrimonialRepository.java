package itu.etu001844.humanresource.repositories.candidat.personalInfo;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import itu.etu001844.humanresource.classes.candidat.personalInfo.SituationMatrimonial;

public interface SituationMatrimonialRepository extends CrudRepository<SituationMatrimonial, UUID> {
    
}
