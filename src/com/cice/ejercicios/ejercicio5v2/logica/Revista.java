package com.cice.ejercicios.ejercicio5v2.logica;

public class Revista extends Publicacion {
    //- Revistas -> número, periodicidad

    private int numero;
    private String periodicidad;

    public Revista() {
        super();
    }

    public Revista(String fechaPublicacion, String titulo, int numero, String periodicidad) {
        super(fechaPublicacion, titulo);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
}
