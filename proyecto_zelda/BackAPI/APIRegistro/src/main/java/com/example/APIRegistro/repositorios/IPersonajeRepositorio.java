package com.example.APIRegistro.repositorios;

import com.example.APIRegistro.modelos.Personajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonajeRepositorio extends JpaRepository<Personajes, Integer> {
}
