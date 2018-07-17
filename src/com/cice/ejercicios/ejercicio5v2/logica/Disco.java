package com.cice.ejercicios.ejercicio5v2.logica;

public class Disco extends Multimedia {

    public Disco() {
        super();
    }

    public Disco(String titulo, double duracion, String formato) {
        super(titulo, duracion, formato);
    }

    public String toString() {
        return "DISCO:\n"+super.toString();
    }


}
