package itu.etu001844.humanresource.repositories.candidat.personalInfo;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import itu.etu001844.humanresource.classes.candidat.personalInfo.Genre;

public interface GenreRepository extends CrudRepository<Genre, UUID> {}
