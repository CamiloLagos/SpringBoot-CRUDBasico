package com.proyecto.proyecto_final.model;

import com.proyecto.proyecto_final.exception.GenericException;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpStatus;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Base64;


public class ImagenDTO {

    private String base64;

    public void convertir() {
        //Codificando la imagen
        InputStream is = null;
        try {
            is = new FileInputStream(base64);
        } catch (FileNotFoundException e) {
            throw new GenericException("I-101","Error leyendo la imagen...", HttpStatus.BAD_REQUEST);
        }

        byte[] arrayBytes = new byte[0];
        try {
            arrayBytes = IOUtils.toByteArray(is);
        } catch (IOException e) {
            throw new GenericException("I-100", "Error convirtiendo la imagen...", HttpStatus.BAD_REQUEST);
        }

        this.base64 = Base64.getEncoder().encodeToString(arrayBytes);
    }

    public ImagenDTO() {
    }

    public ImagenDTO(String base64) {
        this.base64 = base64;
    }

    public void decode() throws IOException {
        //Decodificar la imagen de base64
        byte[] imageBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(base64);
        BufferedImage img = ImageIO.read(new ByteArrayInputStream(imageBytes));
        ImageIO.write(img, "jpg", new File("C:\\Users\\Juan.Lagos\\IdeaProjects\\Proyect\\src\\main\\resources\\img\\img.jpg"));
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    @Override
    public String toString() {
        return "ImagenDTO{" +
                "base64='" + base64 + '\'' +
                '}';
    }
}
