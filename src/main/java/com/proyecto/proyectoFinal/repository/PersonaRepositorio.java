package com.proyecto.proyectoFinal.repository;

import com.proyecto.proyectoFinal.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

    public List<Persona> findByEdadGreaterThanEqual(int edad);
}
