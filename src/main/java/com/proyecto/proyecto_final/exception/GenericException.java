package com.proyecto.proyecto_final.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@Data
@EqualsAndHashCode(callSuper = false)
public class GenericException extends RuntimeException{
    private final String code;
    private final HttpStatus status;

    public GenericException(String code, String message, HttpStatus status) {
        super(message);
        this.code = code;
        this.status = status;
    }
}
