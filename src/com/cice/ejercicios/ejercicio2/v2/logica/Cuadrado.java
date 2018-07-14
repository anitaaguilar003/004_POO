package com.cice.ejercicios.ejercicio2.v2.logica;

import java.text.DecimalFormat;

public class Cuadrado implements Poligono {

    private int numLados = 4;
    private double lado;
    private double precio;
    private String material;

    public Cuadrado() {
        super();
    }

    public Cuadrado(String material, double lado) {
        super();
        this.lado = lado;
        this.material = material;
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
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
        this.precio = darPrecio(material);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Polígono tipo: Cuadrado"+
                "\n\tMaterial: "+getMaterial()+
                "\n\tMedida lado: "+df.format(getLado())+
                "\n\tÁrea: "+df.format(calcularArea())+
                "\n\tPrecio: "+df.format(getPrecio())+"\n\n";
    }
    @Override
    public double calcularArea() {
        return Math.pow(this.lado,2);
    }
}
