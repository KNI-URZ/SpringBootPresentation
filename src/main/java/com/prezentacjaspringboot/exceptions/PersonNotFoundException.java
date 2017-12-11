package com.prezentacjaspringboot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // = 404 Not Found
public class PersonNotFoundException extends RuntimeException {
}
