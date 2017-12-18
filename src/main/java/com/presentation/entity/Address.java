package com.presentation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String city;

    private String street;

    @ManyToMany(mappedBy = "addresses")
    @JsonIgnore
    private Set<Person> persons;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
        persons = new HashSet<>();
    }
}
