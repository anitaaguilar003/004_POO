package com.cice.ejercicios.ejercicio5v3_correcta.logica;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Multimedia extends Recurso {

    private String titulo;
    private LocalTime duracion;
    private Formato formato;

    public Multimedia() {
        super();
    }

    public Multimedia(String titulo, int horas, int minutos, int segundos, Formato formato) {
        this.titulo = titulo;
        duracion = LocalTime.of(horas,minutos,segundos);
        this.formato = formato;
    }

    public Multimedia(String titulo, LocalTime duracion, Formato formato) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public void setDuracion(int horas, int minutos, int segundos) {
        duracion = LocalTime.of(horas,minutos,segundos);
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public String duracionConFormato() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("H:mm:ss");
        String duracionString = this.duracion.format(formato);
        return duracionString;
    }
}
