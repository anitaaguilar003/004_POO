package com.cice.ejercicios.ejercicio2.v3.logica;

public interface PoligonoColoreado extends Poligono {

    String getColor();

    boolean getFirmado();

    void setColor(String color);

    void firmar();

    default void aumentarPrecio(double incremento) {
        setPrecio(getPrecio()*incremento);
    }
}
