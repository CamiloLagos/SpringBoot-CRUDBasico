package com.proyecto.proyectoFinal.controlador;

import com.proyecto.proyectoFinal.model.PersonaModelo;
import com.proyecto.proyectoFinal.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaControlador {

    @Autowired
    PersonaService personaService;

    /*
    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(){
        return "The application is up...";
    }
     */

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String crearPersona(@RequestBody PersonaModelo personaModelo){
        return personaService.crearPersona(personaModelo);
    }

    @RequestMapping(value = "buscar", method = RequestMethod.GET)
    public String buscarPersona(@RequestBody int id){
        return personaService.buscarPersona(id);
    }

    @RequestMapping(value = "borrar", method = RequestMethod.DELETE)
    public String borrarPersona(@RequestBody int id){
        return personaService.eliminarPersona(id);
    }

    @RequestMapping(value = "buscarPorEdad", method = RequestMethod.GET)
    public String buscarPorEdad(@RequestBody int edad){
        return personaService.buscarPorEdad(edad);
    }
}
