package com.proyecto.proyecto_final.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.EntityNotFoundException;
import java.io.IOException;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(value = GenericException.class)
    public ResponseEntity<Error> runtimeExceptionHandler(GenericException e){
        Error error = Error.builder().code(e.getCode()).mensaje(e.getMessage()).status(e.getStatus()).build();
        return new ResponseEntity<>(error, e.getStatus());
    }

    @ExceptionHandler(value = IOException.class)
    public ResponseEntity<Error> iOExceptionHandler(IOException e){
        Error error = Error.builder().code("I-1").mensaje(e.getMessage()).build();
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
