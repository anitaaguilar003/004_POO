package com.cice.ejercicios.ejercicio2.logica;

public class Cuadrilatero extends PoligonoNormal {

    private int numLados = 4;
    private double lado;

    public Cuadrilatero() {
        super();
    }

    public Cuadrilatero(String material, double lado) {
        super(material);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setLados(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado*this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado*this.numLados;
    }

    @Override
    public double calcularAngulos() {
        return 360/this.numLados;
    }


}
