package com.example.APIRegistro.servicios;

import com.example.APIRegistro.modelos.Personajes;
import com.example.APIRegistro.repositorios.IPersonajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
