package com.proyecto.proyectoFinal.controlador;

import com.proyecto.proyectoFinal.document.Imagen;
import com.proyecto.proyectoFinal.entidad.Persona;
import com.proyecto.proyectoFinal.model.ImagenDTO;
import com.proyecto.proyectoFinal.model.PersonaDTO;
import com.proyecto.proyectoFinal.repository.ImagenRepositorio;
import com.proyecto.proyectoFinal.repository.PersonaRepositorio;
import com.proyecto.proyectoFinal.servicio.PersonaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

class PersonaControladorTest {

    @Autowired
    PersonaService personaService;
    @Autowired
    PersonaDTO personaDTO;
    @Autowired
    Optional<Persona> persona;
    @Autowired
    ImagenDTO imagenDTO;
    @Autowired
    Optional<Imagen> imagen;

    ImagenRepositorio imagenRepositorio = Mockito.mock(ImagenRepositorio.class);
    PersonaRepositorio personaRepositorio = Mockito.mock(PersonaRepositorio.class);

    PersonaControlador personaControlador = new PersonaControlador();

    @BeforeEach
    void setUp(){

    }

    @Test
    void crearPersona() {
    }

    @Test
    void buscarPersona() {
    }

    @Test
    void borrarPersona() {
    }

    @Test
    void buscarPorEdad() {
    }
}