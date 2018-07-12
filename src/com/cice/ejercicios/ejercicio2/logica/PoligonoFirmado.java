package com.cice.ejercicios.ejercicio2.logica;

public abstract class PoligonoFirmado extends PoligonoColoreado {
    boolean firma;

    public PoligonoFirmado() {
        super();
    }

    public PoligonoFirmado(String material, String color,boolean firma) {
        super(material,color);
        this.firma = firma;
        firmarPoligono();
    }

    public boolean getFirma() {
        return firma;
    }

    public void setFirma(boolean firma) {
        this.firma = firma;
        firmarPoligono();
    }

    protected void firmarPoligono() {
        aumentarPrecio(1.2);
    }
}
