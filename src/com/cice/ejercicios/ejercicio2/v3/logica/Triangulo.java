package com.cice.ejercicios.ejercicio2.v3.logica;

import java.text.DecimalFormat;

public class Triangulo implements PoligonoColoreado {

    private int numLados = 3;
    private double lado;
    private double altura;
    private String material;
    private double precio;
    private boolean firmado = false;
    private String color = null;

    public Triangulo() {
        super();
    }

    public Triangulo(String material, double lado) {
        this.material = material;
        this.lado = lado;
        this.altura = calcularAltura(lado);
        this.precio = darPrecio(material);
    }

    public Triangulo(String material,double lado, String color, boolean firmado) {
        this.material = material;
        this.precio = darPrecio(material);
        this.lado = lado;
        this.altura = calcularAltura(lado);
        this.color = color;
        aumentarPrecio(1.15);
        if (firmado)
            firmar();
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
    public boolean getFirmado() {
        return firmado;
    }

    @Override
    public String getColor() {
        return color;
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
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setColor(String color) {
        if (this.color == null)
            aumentarPrecio(1.15);
        this.color = color;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Polígono tipo: Triánculo"+
                "\n\tMaterial: "+getMaterial()+
                "\n\tMedida lado: "+df.format(getLado())+
                "\n\tÁrea: "+df.format(calcularArea())+
                "\n\tColor: "+getColor()+
                "\n\tFirmado: "+getFirmado()+
                "\n\tPrecio: "+df.format(getPrecio())+"\n\n";
    }

    @Override
    public double calcularArea() {
        return (this.lado*this.altura)/2;
    }

    private double calcularAltura(double lado) {
        return (lado*Math.sqrt(3)/2);
    }

    @Override
    public void firmar() {
        if(!this.firmado) {
            this.firmado = true;
            aumentarPrecio(1.2);
        }
    }


}
