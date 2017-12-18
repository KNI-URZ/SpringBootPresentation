package com.presentation.services;

import com.presentation.exceptions.PersonIllegalArgumentException;
import com.presentation.exceptions.PersonNotFoundException;
import com.presentation.entity.Person;
import com.presentation.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Iterable<Person> getPersons() {
        return personRepository.findAll();
    }

    @Override
    public Person getPerson(Long id) {
        return Optional.ofNullable(personRepository.findOne(id)).orElseThrow(PersonNotFoundException::new);
    }

    @Override
    public void addPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public void deletePerson(Long id) {
        if (Optional.ofNullable(personRepository.findOne(id)).isPresent()) {
            personRepository.delete(id);
        } else {
            throw new PersonNotFoundException();
        }
    }

    @Override
    public void updatePerson(Person person) {
        if (!Optional.ofNullable(person.getId()).isPresent()) {
            throw new PersonIllegalArgumentException();
        }
        if (personRepository.exists(person.getId())) {
            personRepository.save(person);
        } else {
            throw new PersonNotFoundException();
        }
    }

}
