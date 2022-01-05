package com.proyecto.proyectoFinal.model;

import com.proyecto.proyectoFinal.entidad.TipoId;


public class PersonaModelo {
    private int id;
    private TipoId tipoId;
    private String nombres;
    private String apellidos;
    private int edad;
    private String lugarNacimiento;
    private ImagenModelo imagen;

    public PersonaModelo(int id, TipoId tipoId, String nombres, String apellidos, int edad, String lugarNacimiento, ImagenModelo imagen) {
        this.id = id;
        this.tipoId = tipoId;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.lugarNacimiento = lugarNacimiento;
        this.imagen = imagen;
    }

    public PersonaModelo() {
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

    public ImagenModelo getImagen() {
        return imagen;
    }

    public void setImagen(ImagenModelo imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "PersonaModelo{" +
                "id=" + id +
                ", tipoId=" + tipoId +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", lugarNacimiento='" + lugarNacimiento + '\'' +
                ", imagen=" + imagen +
                '}';
    }
}
