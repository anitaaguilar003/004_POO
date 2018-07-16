package com.cice.ejercicios.ejercicio5.logica;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Recurso> catalogo;

    public Biblioteca() {
        catalogo = new ArrayList<>();
    }

    public int cuantosPrestamos() {
        int cuenta = 0;
        for(Recurso r : catalogo) {
            if(isPrestable(r)) {
                if(((Disco) r).isPrestado() || ((Libro) r).isPrestado())
                    cuenta++;
            }
        }
        return cuenta;
    }

    private boolean isPrestable(Recurso r) {
        if(r instanceof Libro || r instanceof Disco) {
            return true;
        }
        else
            return false;
    }

}
