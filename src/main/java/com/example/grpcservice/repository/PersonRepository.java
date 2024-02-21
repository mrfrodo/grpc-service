package com.example.grpcservice.repository;

import com.example.grpcservice.model.Person;
import org.springframework.data.repository.ListCrudRepository;

public interface PersonRepository extends ListCrudRepository<Person, Integer> {
}
