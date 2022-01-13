package com.proyecto.proyecto_final.servicio;


import com.proyecto.proyecto_final.document.Imagen;
import com.proyecto.proyecto_final.entidad.Persona;
import com.proyecto.proyecto_final.exception.GenericException;
import com.proyecto.proyecto_final.model.PersonaDTO;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpStatus;

@UtilityClass
public class Verificacion {

    public void crearPersonaV(PersonaDTO persona, boolean exist){
        if (exist)
            throw new GenericException("P-200", "La persona ya esta registrada" , HttpStatus.CONFLICT);
        if(persona == null)
            throw new GenericException("P-100","Persona no existe", HttpStatus.NOT_FOUND);
        else if(persona.getId() < 123)
            throw new GenericException("P-101-0","Numero de cedula invalido", HttpStatus.BAD_REQUEST);
        else if(persona.getEdad() < 1)
            throw new GenericException("P-101-1", "ingrese un valor de edad valido",HttpStatus.BAD_REQUEST);
        else if(persona.getNombres() == null)
            throw new GenericException("P-101-2", "Los nombres son requeridos",HttpStatus.BAD_REQUEST);
        else if(persona.getNombres().isBlank())
            throw new GenericException("P-101-3", "Los nombres son obligatorios!",HttpStatus.BAD_REQUEST);
        else if(persona.getApellidos() == null)
            throw new GenericException("P-101-5", "Los apellidos son requeridos",HttpStatus.BAD_REQUEST);
        else if(persona.getApellidos().isBlank())
            throw new GenericException("P-101-4", "Los apellidos son obligatorios!",HttpStatus.BAD_REQUEST);
        else if(persona.getLugarNacimiento().isBlank())
            throw new GenericException("P-101-6", "El lugar de nacimiento es obligatorio!",HttpStatus.BAD_REQUEST);
        else if(persona.getImagen() == null)
            throw new GenericException("I-200", "Imagen is null",HttpStatus.BAD_REQUEST);
        else if(persona.getImagen().getBase64().isBlank())
            throw new GenericException("I-200-0", "Por favor ingrese el link de la imagen",HttpStatus.BAD_REQUEST);
    }

    public void verificarImagen(Imagen imagen){

    }

    public void buscarPersonaV(Persona persona, Imagen imagen){
        if (persona == null)
            throw new GenericException("P-1", "La persona no fue encontrada" , HttpStatus.NOT_FOUND);
    }
}
