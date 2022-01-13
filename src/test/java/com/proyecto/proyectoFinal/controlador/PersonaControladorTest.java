package com.proyecto.proyectoFinal.controlador;

import com.proyecto.proyecto_final.controlador.PersonaControlador;
import com.proyecto.proyecto_final.document.Imagen;
import com.proyecto.proyecto_final.entidad.Persona;
import com.proyecto.proyecto_final.model.ImagenDTO;
import com.proyecto.proyecto_final.model.PersonaDTO;
import com.proyecto.proyecto_final.repository.ImagenRepositorio;
import com.proyecto.proyecto_final.repository.PersonaRepositorio;
import com.proyecto.proyecto_final.servicio.PersonaService;
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