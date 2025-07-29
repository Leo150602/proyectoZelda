package com.example.APIRegistro.servicios;
import java.util.Optional;

import com.example.APIRegistro.modelos.Personajes;
import com.example.APIRegistro.repositorios.IPersonajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import javax.swing.*;

@Service
public class PersonajeServicio {

    // El servicio  llama al repositorio

    @Autowired // Inyección de dependencia
    IPersonajeRepositorio repositorio;

    //Activo los metodos de guardado
    public boolean guardarPersonaje(Personajes datosDelPersonaje)throws Exception{
        try {
            repositorio.save(datosDelPersonaje);
            return true;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Personajes buscarPorId(Integer id) throws Exception {
        try {
            Optional<Personajes> personaje = repositorio.findById(id);
            if (personaje.isPresent()) {
                return personaje.get();
            } else {
                throw new Exception("Personaje no encontrado con ID: " + id);
            }
        } catch (Exception error) {
            throw new Exception("Error al buscar personaje: " + error.getMessage());
        }
    }

    public List<Personajes> buscarTodos() throws Exception {
        try {
            return repositorio.findAll();
        } catch (Exception error) {
            throw new Exception("No se pudieron obtener los personajes: " + error.getMessage());
        }
    }

}
