package com.cice.ejercicios.ejercicio2.v3.logica;

import java.text.DecimalFormat;

public class Pentagono implements PoligonoColoreado {

    private int numLados = 5;
    private String material;
    private double lado;
    private double apotema;
    private double precio;
    private String color = null;
    private boolean firmado = false;

    public Pentagono() {
        super();
    }

    public Pentagono(String material,double lado) {
        this.material = material;
        this.precio = darPrecio(material);
        this.lado = lado;
        this.apotema = calcularApotema(lado);
    }

    public Pentagono(String material, double lado, String color, boolean firmado) {
        this.lado = lado;
        this.apotema = calcularApotema(lado);
        this.material = material;
        this.precio = darPrecio(material);
        this.color = color;
        aumentarPrecio(1.15);
        if (firmado)
            firmar();
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void firmar() {
        this.firmado = true;
        aumentarPrecio(1.2);
    }

    @Override
    public void aumentarPrecio(double incremento) {
        this.precio = this.precio*incremento;
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
    public void setLado(double lado) {
        this.lado = lado;
        this.apotema = calcularApotema(lado);
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
        this.precio = darPrecio(material);
        aumentarPrecio(1.15);
        if (this.firmado)
            firmar();
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Polígono tipo: Pentágono"+
                "\n\tMaterial: "+getMaterial()+
                "\n\tMedida lado: "+df.format(getLado())+
                "\n\tÁrea: "+df.format(calcularArea())+
                "\n\tColor: "+getColor()+
                "\n\tFirmado: "+getFirmado()+
                "\n\tPrecio: "+df.format(getPrecio())+"\n\n";
    }

    @Override
    public double calcularArea() {
        return (this.numLados*this.lado*this.apotema)/2;
    }

    private double calcularApotema(double lado) {
        return lado/(2*(Math.tan(Math.toRadians(calcularAngulos())/2)));
    }
}
