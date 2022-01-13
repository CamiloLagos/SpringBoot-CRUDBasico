package com.proyecto.proyecto_final.servicio;

import com.proyecto.proyecto_final.document.Imagen;
import com.proyecto.proyecto_final.entidad.Persona;
import com.proyecto.proyecto_final.exception.GenericException;
import com.proyecto.proyecto_final.model.ImagenDTO;
import com.proyecto.proyecto_final.model.PersonaDTO;
import com.proyecto.proyecto_final.repository.ImagenRepositorio;
import com.proyecto.proyecto_final.repository.PersonaRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PersonaService {
    @Autowired
    ImagenRepositorio imagenRepositorio;

    @Autowired
    PersonaRepositorio personaRepositorio;

    @Transactional
    public String crearPersona(PersonaDTO personaDTO) {
        Verificacion.crearPersonaV(personaDTO, personaRepositorio.existsById(personaDTO.getId()));
        Persona persona = new Persona();
        BeanUtils.copyProperties(personaDTO, persona);
        personaRepositorio.save(persona);
        Imagen imagen = new Imagen();
        personaDTO.getImagen().convertir();
        BeanUtils.copyProperties(personaDTO.getImagen(), imagen);
        imagen.setId(persona.getId());
        imagenRepositorio.save(imagen);
        return "La persona ha sido agregada";

    }

    @Transactional
    public PersonaDTO buscarPersona(int id) {
        Persona persona = Optional.ofNullable(personaRepositorio.getById(id))
                .orElseThrow(() -> new GenericException("P-1","No se encontro la persona!", HttpStatus.NOT_FOUND));
        Imagen imagen = new Imagen();//imagenRepositorio.findById(id);
        Verificacion.buscarPersonaV(persona,imagen);
        log.info(persona.toString());
        PersonaDTO personaDTO = new PersonaDTO();
        ImagenDTO imagenDTO = new ImagenDTO();
        BeanUtils.copyProperties(persona, personaDTO);
        imagenDTO.setBase64(imagen.getBase64());
        personaDTO.setImagen(imagenDTO);
        return personaDTO;
    }

    @Transactional
    public String eliminarPersona(int id) {
        personaRepositorio.delete(personaRepositorio.getById(id));
        imagenRepositorio.delete(imagenRepositorio.findById(id));
        return "Persona eliminada!";
    }

    @Transactional
    public String buscarPorEdad(int edad) {
        List<Persona> personas = personaRepositorio.findByEdadGreaterThanEqual(edad);
        return personas.toString();
    }
}
