package itu.etu001844.humanresource.repositories.service.critary.question;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import itu.etu001844.humanresource.classes.service.critary.question.Question;

public interface QuestionRepository extends CrudRepository<Question, UUID> {}
