package com.cice.ejercicios.ejercicio5v3_correcta.logica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Publicacion extends Recurso {
    private LocalDate fechaPublicacion;
    private String titulo;


    public Publicacion() {
        super();
    }

    public Publicacion(int dia, int mes, int anyo, String titulo) {
        this.fechaPublicacion = LocalDate.of(anyo,mes,dia);
        this.titulo = titulo;
    }

    public Publicacion (LocalDate fechaPublicacion, String titulo) {
        this.fechaPublicacion = fechaPublicacion;
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setFechaPublicacion(int dia, int mes, int anyo) {
        this.fechaPublicacion = LocalDate.of(anyo,mes,dia);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String fechaConFormato() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/uuuu");
        String fechaString = this.fechaPublicacion.format(formato);
        return fechaString;
    }

}
