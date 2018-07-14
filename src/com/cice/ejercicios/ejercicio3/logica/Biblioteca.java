package com.cice.ejercicios.ejercicio3.logica;

import java.util.ArrayList;

public class Biblioteca {

    public int cuentaPrestados(Object[] lista) {
        int cuantos = 0;
        for(Object o : lista) {
            if(o instanceof Libro && ((Libro) o).prestado())
                ++cuantos;
        }
        return cuantos;
    }

    public int publicacionesAnterioresA(int anyo,Object[] lista) {
        int cuantas = 0;
        for(Object o : lista) {
            if(o instanceof Publicacion && ((Publicacion) o).getAnyo()<anyo)
                ++cuantas;
        }
        return cuantas;
    }

}
