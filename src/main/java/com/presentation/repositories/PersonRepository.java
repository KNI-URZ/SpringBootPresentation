package com.presentation.repositories;

import com.presentation.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

    Person findByFirstName(String firstName);

    @Query("SELECT p.firstName, p.lastName, p.age FROM Person p WHERE p.id = :id")
    String getInfo(@Param("id") Long id);

    @Query(value = "SELECT MAX(age) FROM PERSON", nativeQuery = true)
    int maxAge();

    Page<Person> findByFirstName(String fistName,  Pageable pageable);
}
