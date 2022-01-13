package com.proyecto.proyecto_final.model;

import com.proyecto.proyecto_final.entidad.TipoId;


public class PersonaDTO {
    private int id;
    private TipoId tipoId;
    private String nombres;
    private String apellidos;
    private int edad;
    private String lugarNacimiento;
    private ImagenDTO imagen;

    public PersonaDTO(int id, TipoId tipoId, String nombres, String apellidos, int edad, String lugarNacimiento, ImagenDTO imagen) {
        this.id = id;
        this.tipoId = tipoId;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.lugarNacimiento = lugarNacimiento;
        this.imagen = imagen;
    }

    public PersonaDTO() {
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

    public ImagenDTO getImagen() {
        return imagen;
    }

    public void setImagen(ImagenDTO imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "PersonaDTO{" +
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
