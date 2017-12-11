package com.prezentacjaspringboot.services;

import com.prezentacjaspringboot.FakePersons;
import com.prezentacjaspringboot.exceptions.PersonNotFoundException;
import com.prezentacjaspringboot.person.Person;
import com.prezentacjaspringboot.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll(){
        return this.personRepository.findAll();
    }
    public Person getById(Long id) {
        Optional<Person> person = Optional.ofNullable(this.personRepository.findOne(id));
        if(person.isPresent()){
            return person.get();
        } else {
            throw new PersonNotFoundException();
        }
    }

    public void addPeron(Person person) {
        this.personRepository.save(person);
    }

    public void updatePeron(Person person) {
        this.personRepository.save(person);
    }

    public void removePerson(Long id){
        this.personRepository.delete(id);
    }
}
