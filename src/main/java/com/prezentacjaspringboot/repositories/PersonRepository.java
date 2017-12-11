package com.prezentacjaspringboot.repositories;

import com.prezentacjaspringboot.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    Person findByAvatarAndId();
}
