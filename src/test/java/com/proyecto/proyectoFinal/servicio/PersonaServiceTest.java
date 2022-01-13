package com.proyecto.proyectoFinal.servicio;

import com.proyecto.proyecto_final.document.Imagen;
import com.proyecto.proyecto_final.entidad.Persona;
import com.proyecto.proyecto_final.entidad.TipoId;
import com.proyecto.proyecto_final.model.ImagenDTO;
import com.proyecto.proyecto_final.model.PersonaDTO;
import com.proyecto.proyecto_final.repository.ImagenRepositorio;
import com.proyecto.proyecto_final.repository.PersonaRepositorio;
import com.proyecto.proyecto_final.servicio.PersonaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PersonaServiceTest {

    @Mock private ImagenRepositorio imagenRepositorio;

    @Mock private PersonaRepositorio personaRepositorio;

    @InjectMocks
    private PersonaService personaService = new PersonaService();;

    private Persona persona;
    private Imagen imagen;
    private PersonaDTO personaDTO;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        personaDTO = new PersonaDTO(1113695690, TipoId.CC, "Juan Camilo", "Lagos Cifuentes", 22, "Palmira", new ImagenDTO("C:\\Users\\Juan.Lagos\\IdeaProjects\\proyectoFinal\\src\\main\\resources\\static\\pragma-logo.png"));


        persona = new Persona();
        persona.setId(1113695690);
        persona.setTipoId(TipoId.CC);
        persona.setNombres("Juan Camilo");
        persona.setApellidos("Lagos Cifuentes");
        persona.setEdad(22);
        persona.setLugarNacimiento("Palmira");

        imagen = new Imagen();
        imagen.setId(1113695690);
        imagen.setBase64("C:\\Users\\Juan.Lagos\\IdeaProjects\\proyectoFinal\\src\\main\\resources\\static\\pragma-logo.png");
    }


    @Test
    void crearPersona() {
        when(personaRepositorio.save(any(Persona.class))).thenReturn(persona);
        when(imagenRepositorio.save(any(Imagen.class))).thenReturn(imagen);
        assertNotNull(personaService.crearPersona(personaDTO));
    }

    @Test
    void buscarPersona() {
        when(personaRepositorio.getById(anyInt())).thenReturn(persona);
        when(imagenRepositorio.findById(anyInt())).thenReturn(imagen);
        assertEquals(personaDTO.toString(), personaService.buscarPersona(1113695690).toString());
    }

    @Test
    void eliminarPersona() {
        when(personaRepositorio.getById(anyInt())).thenReturn(persona);
        when(imagenRepositorio.findById(anyInt())).thenReturn(imagen);
        assertEquals("Persona eliminada!", personaService.eliminarPersona(1113695690));
    }
}