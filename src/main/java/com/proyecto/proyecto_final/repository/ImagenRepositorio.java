package com.proyecto.proyecto_final.repository;

import com.proyecto.proyecto_final.document.Imagen;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepositorio extends MongoRepository<Imagen, Integer> {

    public Imagen findById(int id);

}
