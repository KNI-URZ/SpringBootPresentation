package com.prezentacjaspringboot;

import com.prezentacjaspringboot.person.Person;
import com.prezentacjaspringboot.repositories.PersonRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
public class FakePersons implements CommandLineRunner {

    private PersonRepository personRepository;
    private List<Person> list;

    @Autowired
    public FakePersons(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.list = new ArrayList<Person>(){
            {
                add(new Person(0L,"a","a","a"));
                add(new Person(1L,"b","b","b"));
                add(new Person(2L,"c","c","c"));
                add(new Person(3L,"d","d","d"));
            }
        };
        this.personRepository.save(list);
    }
}
