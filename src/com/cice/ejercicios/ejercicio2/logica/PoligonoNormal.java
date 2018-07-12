package com.cice.ejercicios.ejercicio2.logica;

public abstract class PoligonoNormal implements Poligono {
    private String material;
    private double precio;

    public PoligonoNormal() {
        super();
    }

    public PoligonoNormal (String material) {
        this.material = material;
        darPrecio(material);
    }

    public double getPrecio() {
        return precio;
    }

    public String getMaterial() {
        return material;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    protected void darPrecio(String material) {
        switch (material) {
            case "Cartón":
                this.precio = 100;
                break;
            case "Plástico":
                this.precio = 300;
                break;
            case "Madera":
                this.precio = 500;
                break;
            default:
                this.precio = 0;
                break;
        }
    }

    public Poligono mayor(Poligono a, Poligono b) {
        if(a.calcularArea() >= b.calcularArea())
            return a;
        else
            return b;
    }

}
