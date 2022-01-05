package com.proyecto.proyectoFinal.servicio;

import com.proyecto.proyectoFinal.document.Imagen;
import com.proyecto.proyectoFinal.entidad.Persona;
import com.proyecto.proyectoFinal.entidad.TipoId;
import com.proyecto.proyectoFinal.model.ImagenModelo;
import com.proyecto.proyectoFinal.model.PersonaModelo;
import com.proyecto.proyectoFinal.repository.ImagenRepositorio;
import com.proyecto.proyectoFinal.repository.PersonaRepositorio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PersonaServiceTest {

    @Mock private ImagenRepositorio imagenRepositorio;

    @Mock private PersonaRepositorio personaRepositorio;

    @InjectMocks
    private PersonaService personaService;

    private Persona persona;
    private Imagen imagen;

    @BeforeEach
    void setUp() {

        personaService = new PersonaService();

        persona = new Persona();
        persona.setId(1113695690);
        persona.setTipoId(TipoId.CC);
        persona.setNombres("Juan Camilo");
        persona.setApellidos("Lagos Cifuentes");
        persona.setEdad(22);
        persona.setLugarNacimiento("Palmira");

        imagen = new Imagen();
        imagen.setId(1113695690);
        imagen.setBase64("textoprueba");
    }

    @Test
    void crearPersona() {
        //??
    }

    @Test
    void buscarPersona() {
        PersonaModelo personaModelo;
        personaModelo = new PersonaModelo(1113695690, TipoId.CC, "Juan Camilo", "Lagos Cifuentes", 22, "Palmira", new ImagenModelo("textoprueba"));
        when(personaService.buscarPersona(1113695690)).thenReturn(personaModelo.toString());
        assertNotNull(personaService);
    }

    @Test
    void eliminarPersona() {
    }
}