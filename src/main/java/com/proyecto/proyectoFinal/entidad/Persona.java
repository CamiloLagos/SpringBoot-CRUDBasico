package com.proyecto.proyectoFinal.entidad;

import lombok.*;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Persona {

    @Id
    @Getter
    private int id;
    private TipoId tipoId;
    private String nombres;
    private String apellidos;
    private int edad;
    private String lugarNacimiento;

}
