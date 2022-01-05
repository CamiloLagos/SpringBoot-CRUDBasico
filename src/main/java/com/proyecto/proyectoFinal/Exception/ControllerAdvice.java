package com.proyecto.proyectoFinal.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(value = RequestException.class)
    public ResponseEntity<Error> runtimeExceptionHandler(RequestException ex){
        Error error = Error.builder().code(ex.getMessage()).message(ex.getMessage()).build();
        return new ResponseEntity<>(error, ex.getStatus());
    };

}
