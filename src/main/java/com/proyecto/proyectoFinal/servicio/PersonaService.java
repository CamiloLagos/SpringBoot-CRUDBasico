package com.proyecto.proyectoFinal.servicio;

import com.proyecto.proyectoFinal.document.Imagen;
import com.proyecto.proyectoFinal.entidad.Persona;
import com.proyecto.proyectoFinal.model.ImagenDTO;
import com.proyecto.proyectoFinal.model.PersonaDTO;
import com.proyecto.proyectoFinal.repository.ImagenRepositorio;
import com.proyecto.proyectoFinal.repository.PersonaRepositorio;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PersonaService {
    @Autowired
    ImagenRepositorio imagenRepositorio;

    @Autowired
    PersonaRepositorio personaRepositorio;

    @Transactional
    public String crearPersona(PersonaDTO personaDTO) {

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
        Persona persona = personaRepositorio.getById(id);
        PersonaDTO personaDTO = new PersonaDTO();
        BeanUtils.copyProperties(persona, personaDTO);
        Imagen imagen = imagenRepositorio.findById(id);
        ImagenDTO imagenDTO = new ImagenDTO();
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
