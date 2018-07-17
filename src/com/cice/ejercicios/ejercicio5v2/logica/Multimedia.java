package com.cice.ejercicios.ejercicio5v2.logica;

public abstract class Multimedia extends Recurso {

    private double duracion;
    private String formato;

    public Multimedia() {
        super();
    }

    public Multimedia(String titulo, double duracion, String formato) {
        super(titulo);
        this.duracion = duracion;
        this.formato = formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public String getFormato() { return formato; }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setFormato(String formato) { this.formato = formato; }

    public String toString() {
        return "\t{Título: "+getTitulo()+"\n"+
                "\tDuración: "+getDuracion()+"\n"+
                "\tFormato: "+getFormato()+"}\n";
    }

}
