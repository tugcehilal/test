package com.tugce.test2.controller;
import com.tugce.test2.model.Person;
import com.tugce.test2.service.PersonService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("person")
public class PersonController {

    private final PersonService personService;
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return personService.insertPersonData(person);
    }

    @GetMapping
    public Collection<Person> read() {
        return personService.getAllPersonInformation();
    }


    @GetMapping(path = "/older/{age}")
    public Collection<Person> getOlder(@PathVariable String age) {
        return personService.getAllPersonInformationOlderThan(age);
    }

    @GetMapping(path = "{id}")
    public Optional<Person> readQueryUsingId(@PathVariable("id") String id) {
        return personService.getPersonInformationUsingId(id);
    }

    @PutMapping(path = "/update/{id}")
    public void update(@PathVariable String id, @RequestBody Person person ) {
        personService.updatePersonUsingId(id, person);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable("id") String id){
        personService.deletePersonUsingId(id);
    }

    /*@Scheduled(fixedDelay = 1000, initialDelay = 3000)
    public void createTugce() {
        personService.insertPersonData(new Person(UUID.randomUUID().toString(), "Tugce"));
        System.out.println("Data created");

    }*/
}