package com.cice.ejercicios.ejercicio2.logica;

public class Triangulo extends PoligonoNormal {

    private int numLados = 3;
    private double lado;
    private double altura;

    public Triangulo() {
        super();
    }

    public Triangulo(String material, double lado) {
        super(material);
        this.lado = lado;
        this.altura = (lado*Math.sqrt(3)/2);
    }

    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setBase(double base) {
        this.lado = base;
        this.altura = (base*Math.sqrt(3)/2);
    }


    @Override
    public double calcularArea() {
        return (this.lado*this.altura)/2;
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
