package com.proyecto.proyectoFinal.servicio;

import com.proyecto.proyectoFinal.document.Imagen;
import com.proyecto.proyectoFinal.entidad.Persona;
import com.proyecto.proyectoFinal.model.ImagenModelo;
import com.proyecto.proyectoFinal.model.PersonaModelo;
import com.proyecto.proyectoFinal.repository.ImagenRepositorio;
import com.proyecto.proyectoFinal.repository.PersonaRepositorio;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

@Service
public class PersonaService {
    @Autowired
    ImagenRepositorio imagenRepositorio;

    @Autowired
    PersonaRepositorio personaRepositorio;

    @Transactional
    public String crearPersona(PersonaModelo personaModelo) {
        Persona persona = new Persona();
        BeanUtils.copyProperties(personaModelo, persona);
        System.out.println(persona.toString());
        try {
            personaRepositorio.save(persona);
            Imagen imagen = new Imagen();
            System.out.println(personaModelo.getImagen().toString());
            personaModelo.getImagen().convertir();
            BeanUtils.copyProperties(personaModelo.getImagen(),imagen);
            imagen.setId(persona.getId());
            System.out.println(imagen.toString());
            try{
                imagenRepositorio.save(imagen);

            }catch (Exception ex){
                return ex.getMessage();
            }
        }catch (Exception ex){
            ex.getMessage();
        }
        return "La persona ha sido agregada";
    }

    @Transactional
    public String buscarPersona(int id){
        Persona persona = personaRepositorio.getById(id);
        PersonaModelo personaModelo = new PersonaModelo();
        BeanUtils.copyProperties(persona, personaModelo);
        Imagen imagen = imagenRepositorio.findById(id);
        ImagenModelo imagenModelo = new ImagenModelo();
        imagenModelo.setBase64(imagen.getBase64());
        personaModelo.setImagen(imagenModelo);
        return personaModelo.toString();
    }

    @Transactional
    public String eliminarPersona(int id){
        personaRepositorio.delete(personaRepositorio.getById(id));
        imagenRepositorio.delete(imagenRepositorio.findById(id));
        return "Persona eliminada!";
    }

    @Transactional
    public String buscarPorEdad(int edad){
        List<Persona> personas = personaRepositorio.findByEdadGreaterThanEqual(edad);
        return personas.toString();
    }
}
