package com.proyecto.proyectoFinal.controlador;

import com.proyecto.proyectoFinal.model.PersonaDTO;
import com.proyecto.proyectoFinal.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "crear")
    public String crearPersona(@RequestBody PersonaDTO personaDTO){
        return personaService.crearPersona(personaDTO);
    }

    @RequestMapping(value = "buscar", method = RequestMethod.GET)
    public String buscarPersona(@RequestBody int id){
        return personaService.buscarPersona(id).toString();
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
