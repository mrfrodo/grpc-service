package com.example.grpcservice;

import com.example.grpcservice.model.Person;
import com.example.grpcservice.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private final PersonRepository personRepository;

    public TestController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    List<Person> hello() {
        return personRepository.findAll();
    }
}
