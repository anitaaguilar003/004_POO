package com.cice.ejercicios.ejercicio2.logica;

public interface Poligono {

    double calcularArea();

    double calcularPerimetro();

    double calcularAngulos();

    double getLado();

    int getNumLados();

    double getPrecio();

    Poligono mayor(Poligono a, Poligono b);

}
