package com.cice.ejercicios.ejercicio2.logica;

public abstract class PoligonoColoreado extends PoligonoNormal{

    private String color;
    private boolean firmado = false;

    public PoligonoColoreado() {
        super();
    }

    public PoligonoColoreado(String material, String color) {
        super(material);
        this.color = color;
        aumentarPrecio(1.15);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void aumentarPrecio(double incremento) {
        setPrecio(getPrecio()*incremento);
    }

}
