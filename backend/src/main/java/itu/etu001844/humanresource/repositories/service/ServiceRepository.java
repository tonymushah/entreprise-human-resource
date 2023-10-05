package itu.etu001844.humanresource.repositories.service;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import itu.etu001844.humanresource.classes.service.Service;

public interface ServiceRepository extends CrudRepository<Service, UUID> {}
