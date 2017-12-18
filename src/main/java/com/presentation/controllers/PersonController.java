package com.presentation.controllers;

import com.presentation.entity.Person;
import com.presentation.exceptions.PersonNotFoundException;
import com.presentation.repositories.PersonRepository;
import com.presentation.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(value = "/persons")
public class PersonController {

    private PersonRepository personRepository;


    PersonService personService;

    @Autowired
    public PersonController(PersonService personService, PersonRepository personRepository) {
        this.personService = personService;
        this.personRepository = personRepository;
    }

    @GetMapping
    public Iterable<Person> getPersons() {
        return personService.getPersons();
    }

    @GetMapping(value = "/{id}")
    public Person getPerson(@PathVariable("id") Long id) {
        return personService.getPerson(id);
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }

    @PutMapping
    public void updatePerson(@RequestBody Person person) {
        personService.updatePerson(person);
    }

    @GetMapping(value = "/find")
    public Person getPersonByFirstName(@RequestParam("firstName") String firstName) {
        return Optional.ofNullable(personRepository.findByFirstName(firstName)).orElseThrow(PersonNotFoundException::new);
    }

    @GetMapping(value = "/find/page")
    public Page<Person> getFirstAndLastNamePage(@RequestParam("firstName") String firstName,
                                                @RequestParam("page") int page,
                                                @RequestParam("size") int size) {
        return personRepository.findByFirstName(firstName, new PageRequest(page, size));
    }

    @GetMapping(value = "/find/info/{id}")
    public String getInfoAboutPerson(@PathVariable("id") Long id) {
        return personRepository.getInfo(id);
    }

    @GetMapping(value = "/find/maxage")
    public int getMaxAge() {
        return personRepository.maxAge();
    }

}
