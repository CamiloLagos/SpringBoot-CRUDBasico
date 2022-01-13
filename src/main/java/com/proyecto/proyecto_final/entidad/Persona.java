package com.proyecto.proyecto_final.entidad;

import lombok.*;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Persona {

    @Id
    private int id;
    @Column(nullable = false)
    private TipoId tipoId;
    private String nombres;
    private String apellidos;
    private int edad;
    @Column(nullable = false)
    private String lugarNacimiento;

}
