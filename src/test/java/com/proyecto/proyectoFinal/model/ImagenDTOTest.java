package com.proyecto.proyectoFinal.model;

import com.proyecto.proyecto_final.model.ImagenDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;


class ImagenDTOTest {

    @Autowired
    static
    ImagenDTO imagenDTO;

    @BeforeAll
    static void before(){
        imagenDTO = new ImagenDTO();
    }

    @Test
    void convertir() {
        imagenDTO.setBase64("C:\\Users\\Juan.Lagos\\IdeaProjects\\proyectoFinal\\src\\main\\resources\\static\\pragma-logo.png");
        imagenDTO.convertir();
        assertEquals("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"
        , imagenDTO.getBase64());
    }
}