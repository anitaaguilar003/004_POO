package com.cice.ejercicios.ejercicio5.logica;

public class Multimedia extends Recurso {

    private double duracion;
    protected final String[] FORMATO = {"DVD", "Cassette","CD","Vinilo","Blu-ray"};

    public Multimedia() {
        super();
    }

    public Multimedia(String fechaPublicacion, String titulo, double duracion) {
        super(fechaPublicacion, titulo);
        this.duracion = duracion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

}
