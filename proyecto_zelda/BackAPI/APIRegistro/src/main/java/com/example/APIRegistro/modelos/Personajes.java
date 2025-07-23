package com.example.APIRegistro.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "personajes")
public class Personajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String Nombre;
    private Integer cantidadVida;
    private Integer cantidadAtaque;
    private  Integer cantidadDefensa;
    private String fotografia;
    private LocalDate fechaCreacion;

    public Personajes() {
    }

    public Personajes(Integer id, String nombre, Integer cantidadVida, Integer cantidadAtaque, Integer cantidadDefensa, String fotografia, LocalDate fechaCreacion) {
        this.id = id;
        Nombre = nombre;
        this.cantidadVida = cantidadVida;
        this.cantidadAtaque = cantidadAtaque;
        this.cantidadDefensa = cantidadDefensa;
        this.fotografia = fotografia;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(Integer cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    public Integer getCantidadAtaque() {
        return cantidadAtaque;
    }

    public void setCantidadAtaque(Integer cantidadAtaque) {
        this.cantidadAtaque = cantidadAtaque;
    }

    public Integer getCantidadDefensa() {
        return cantidadDefensa;
    }

    public void setCantidadDefensa(Integer cantidadDefensa) {
        this.cantidadDefensa = cantidadDefensa;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}

