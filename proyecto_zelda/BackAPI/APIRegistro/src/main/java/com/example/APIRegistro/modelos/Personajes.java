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
    private Integer cantidadDefensa;
    private String fotografia;
    private LocalDate fechaCreacion;
    private String categoria;
    private Boolean continuaVivo;

    public Personajes() {
    }

    public Personajes(Integer id, String nombre, Integer cantidadVida, Integer cantidadAtaque, Integer cantidadDefensa, String fotografia, LocalDate fechaCreacion, String categoria, Boolean continuaVivo) {
        this.id = id;
        Nombre = nombre;
        this.cantidadVida = cantidadVida;
        this.cantidadAtaque = cantidadAtaque;
        this.cantidadDefensa = cantidadDefensa;
        this.fotografia = fotografia;
        this.fechaCreacion = fechaCreacion;
        this.categoria = categoria;
        this.continuaVivo = continuaVivo;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public Integer getCantidadVida() {
        return cantidadVida;
    }

    public Integer getCantidadAtaque() {
        return cantidadAtaque;
    }

    public Integer getCantidadDefensa() {
        return cantidadDefensa;
    }

    public String getFotografia() {
        return fotografia;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public Boolean getContinuaVivo() {
        return continuaVivo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setCantidadVida(Integer cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    public void setCantidadAtaque(Integer cantidadAtaque) {
        this.cantidadAtaque = cantidadAtaque;
    }

    public void setCantidadDefensa(Integer cantidadDefensa) {
        this.cantidadDefensa = cantidadDefensa;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setContinuaVivo(Boolean continuaVivo) {
        this.continuaVivo = continuaVivo;
    }
}

