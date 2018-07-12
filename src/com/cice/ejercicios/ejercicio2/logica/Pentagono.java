package com.cice.ejercicios.ejercicio2.logica;

public class Pentagono extends PoligonoFirmado {

    private int numLados = 5;
    private double lado;
    private double apotema;

    public Pentagono() {
        super();
    }

    public Pentagono(String material,String color, boolean firma, double lado) {
        super(material,color,firma);
        this.lado = lado;
        this.apotema = lado/(2*(Math.tan(Math.toRadians(calcularAngulos())/2)));
    }

    public int getNumLados() {
        return numLados;
    }

    public double getLado() {
        return lado;
    }

    public double getApotema() { return apotema;}

    public void setLado(double lado) {
        this.lado = lado;
        this.apotema = lado/(2*(Math.tan(Math.toRadians(calcularAngulos())/2)));
    }

    @Override
    public double calcularArea() {
        return (this.numLados*this.lado*this.apotema)/2;
    }

    @Override
    public double calcularPerimetro() {
        return this.numLados*this.lado;
    }

    @Override
    public double calcularAngulos() {
        return 360/this.numLados;
    }
}
