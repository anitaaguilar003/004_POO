package com.cice.ejercicios.ejercicio5.logica;

public class Disco extends Multimedia implements Prestamo{

    private boolean prestado;
    private int formato;

    public Disco() {
        super();
    }

    public Disco(String fechaPublicacion, String titulo, double duracion, int formato) {
        super(fechaPublicacion, titulo, duracion);
        this.prestado = false;
        this.formato = formato;
    }

    public String getFormato() {
        return FORMATO[formato];
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    public boolean isPrestado() {
        return this.prestado;
    }

}
