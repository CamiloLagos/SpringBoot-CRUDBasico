package com.proyecto.proyectoFinal.document;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Document(collection = "imagen")
public class Imagen {

    @Id
    private int id;

    private String base64;

    public Imagen() {
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "id=" + id +
                ", base64='" + base64 + '\'' +
                '}';
    }
}
