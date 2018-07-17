package com.cice.ejercicios.ejercicio5v2.logica;

public class Recurso implements Prestamo {

    private boolean prestado;
    private String titulo;

    public Recurso() {
        this.prestado = false;
    }

    public Recurso(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public boolean isPrestado() {
        return prestado;
    }
}
