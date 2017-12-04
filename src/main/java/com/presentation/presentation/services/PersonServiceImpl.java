package com.presentation.presentation.services;

import com.presentation.presentation.entity.Person;
import com.presentation.presentation.exceptions.PersonNotFoundException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PersonServiceImpl implements PersonService, CommandLineRunner {

    private Set<Person> personList;

    @Override
    public Set<Person> getPersons() {
        return personList;
    }

    @Override
    public Person getPerson(Long id) {
        Person person = null;

        for (Person p : personList) {
            if (p.getId() == id) {
                person = p;
            }
        }
        if (person == null) {
            throw new PersonNotFoundException();
        }
        return person;
    }

    @Override
    public void addPerson(Person person) {
        personList.add(person);
    }

    @Override
    public void deletePerson(Long id) {
        Person person = null;
        for (Person p : personList) {
            if (p.getId() == id) {
                person = p;
            }
        }
        if (person == null) {
            throw new PersonNotFoundException();
        }

        personList.remove(person);
    }

    @Override
    public void updatePerson(Long id, Person person) {

        for (Person p : personList) {
            if (p.getId() == id) {
                p.setFirstName(person.getFirstName());
                p.setLastName(person.getLastName());
            }
        }
    }

    @Override
    public void run(String... strings) throws Exception {
        injectData();
    }

    private void injectData() {
        this.personList = new HashSet() {
            {
                add(new Person(1L, "Adam", "Kowalski"));
                add(new Person(2L, "Mateusz", "Nowak"));
                add(new Person(3L, "Klaudia", "Strojna"));
            }
        };
    }
}
