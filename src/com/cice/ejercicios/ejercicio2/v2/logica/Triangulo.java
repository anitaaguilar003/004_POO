package com.cice.ejercicios.ejercicio2.v2.logica;

import java.text.DecimalFormat;

public class Triangulo implements Poligono {

    private int numLados = 3;
    private double lado;
    private double altura;
    private String material;
    private double precio;

    public Triangulo() {
        super();
    }

    public Triangulo(String material, double lado) {
        this.material = material;
        this.lado = lado;
        this.altura = (lado*Math.sqrt(3)/2);
        this.precio = darPrecio(material);
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public double getLado() {
        return lado;
    }

    @Override
    public int getNumLados() {
        return numLados;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setLado(double lado) {
        this.lado = lado;
        this.altura = (lado*Math.sqrt(3)/2);
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
        this.precio = darPrecio(material);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Polígono tipo: Triánculo"+
                "\n\tMaterial: "+getMaterial()+
                "\n\tMedida lado: "+df.format(getLado())+
                "\n\tÁrea: "+df.format(calcularArea())+
                "\n\tPrecio: "+df.format(getPrecio())+"\n\n";
    }

    @Override
    public double calcularArea() {
        return (this.lado*this.altura)/2;
    }
}
