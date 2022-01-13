package com.proyecto.proyecto_final.exception;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class Error {
    private String code;
    private String mensaje;
    private HttpStatus status;
}
