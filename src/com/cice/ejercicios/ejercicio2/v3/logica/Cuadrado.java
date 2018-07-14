package com.cice.ejercicios.ejercicio2.v3.logica;

import java.text.DecimalFormat;

public class Cuadrado implements PoligonoColoreado {

    private int numLados = 4;
    private double lado;
    private double precio;
    private String material;
    private String color = null;
    private boolean firmado = false;

    public Cuadrado() {
        super();
    }

    public Cuadrado(String material, double lado) {
        super();
        this.lado = lado;
        this.material = material;
        this.precio = darPrecio(material);
    }

    public Cuadrado(String material, double lado, String color, boolean firmado) {
        super();
        this.material = material;
        this.precio = darPrecio(material);
        this.lado = lado;
        this.color = color;
        aumentarPrecio(1.15);
        if(firmado)
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
    public void setLado(double lado) {
        this.lado = lado;
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
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Polígono tipo: Cuadrado"+
                "\n\tMaterial: "+getMaterial()+
                "\n\tMedida lado: "+df.format(getLado())+
                "\n\tÁrea: "+df.format(calcularArea())+
                "\n\tColor: "+getColor()+
                "\n\tFirmado: "+getFirmado()+
                "\n\tPrecio: "+df.format(getPrecio())+"\n\n";
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.lado,2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean getFirmado() {
        return firmado;
    }

    @Override
    public void setColor(String color) {
        if(this.color == null)
            aumentarPrecio(1.15);
        this.color = color;
    }

    @Override
    public void firmar() {
        if(!this.firmado) {
            this.firmado = true;
            aumentarPrecio(1.2);
        }
    }
}
