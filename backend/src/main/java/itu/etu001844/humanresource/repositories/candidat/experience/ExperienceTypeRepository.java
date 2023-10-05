package itu.etu001844.humanresource.repositories.candidat.experience;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import itu.etu001844.humanresource.classes.candidat.experience.ExperienceType;

public interface ExperienceTypeRepository extends CrudRepository<ExperienceType, UUID> {}
