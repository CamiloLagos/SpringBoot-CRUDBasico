package com.proyecto.proyectoFinal.repository;

import com.proyecto.proyectoFinal.document.Imagen;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepositorio extends MongoRepository<Imagen, Integer> {

    public Imagen findById(int id);

}
