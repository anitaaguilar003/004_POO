package com.cice.ejercicios.ejercicio2.v2.logica;

public interface PoligonoColoreado extends Poligono {

    String getColor();

    boolean getFirmado();

    void setColor(String color);

    void firmar();

    void aumentarPrecio(double incremento);
}
