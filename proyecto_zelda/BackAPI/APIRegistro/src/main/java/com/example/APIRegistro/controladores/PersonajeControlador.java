package com.example.APIRegistro.controladores;

import com.example.APIRegistro.modelos.Personajes;
import com.example.APIRegistro.servicios.PersonajeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.*;

@RestController
@RequestMapping("/personajes")
public class PersonajeControlador {

    // Llama al servicio
    @Autowired
    PersonajeServicio servicio;

    //Metodo para responder al front
    @PostMapping
    public ResponseEntity<?>responderaAlGuardar(@RequestBody Personajes datosDelFront){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.guardarPersonaje(datosDelFront));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    @GetMapping("/{id}")
    public Personajes obtenerPorId(@PathVariable Integer id) throws Exception {
        return servicio.buscarPorId(id);
    }

    @GetMapping
    public List<Personajes> obtenerTodos() throws Exception {
        return servicio.buscarTodos();
    }

}
