package com.prezentacjaspringboot.controllers;

import com.prezentacjaspringboot.person.Person;
import com.prezentacjaspringboot.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAll(){
        return this.personService.getAll();
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable Long id){
        return this.personService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addPerson(@RequestBody Person person){
        this.personService.addPeron(person);
    }

    @PutMapping
    public void updatePerson(@RequestBody Person person){
        this.personService.updatePeron(person);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePerson(@PathVariable("id") Long id){
        this.personService.removePerson(id);
    }
}
