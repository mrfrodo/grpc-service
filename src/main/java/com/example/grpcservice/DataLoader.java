package com.example.grpcservice;

import com.example.grpcservice.model.Person;
import com.example.grpcservice.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final PersonRepository personRepository;

    public DataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Person frodo = new Person(null, "frodo");
        personRepository.save(frodo);

        Person gandalf = new Person(null, "gandalf");
        personRepository.save(gandalf);

        List<Person> all = personRepository.findAll();
        System.out.println("** Loaded some data");
        for (Person p : all) {
            System.out.printf("  ");  System.out.println(p.id() + " " + p.name());
        }
    }
}
