package com.presentation.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

    private Long id;

    private String firstName;

    private String lastName;
}
