package com.proyecto.proyectoFinal.entidad;

import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
public class Persona {

    @Id
    private int id;
    private TipoId tipoId;
    private String nombres;
    private String apellidos;
    private int edad;
    private String lugarNacimiento;

    public Persona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoId getTipoId() {
        return tipoId;
    }

    public void setTipoId(TipoId tipoId) {
        this.tipoId = tipoId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", tipoId=" + tipoId +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", lugarNacimiento='" + lugarNacimiento + '\'' +
                '}';
    }
}
