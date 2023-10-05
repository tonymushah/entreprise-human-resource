package itu.etu001844.humanresource.repositories.candidat.diplome;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import itu.etu001844.humanresource.classes.candidat.diplome.DiplomeType;

public interface DiplomeTypeRepository extends CrudRepository<DiplomeType, UUID> {
    
}
