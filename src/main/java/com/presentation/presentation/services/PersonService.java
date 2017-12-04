package com.presentation.presentation.services;

import com.presentation.presentation.entity.Person;

import java.util.Set;

public interface PersonService {

    Set<Person> getPersons();

    Person getPerson(Long id);

    void addPerson(Person person);

    void deletePerson(Long id);

    void updatePerson(Long id, Person person);
}
