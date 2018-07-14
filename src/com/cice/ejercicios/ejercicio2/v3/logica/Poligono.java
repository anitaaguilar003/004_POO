package com.cice.ejercicios.ejercicio2.v3.logica;

public interface Poligono {

    String getMaterial();

    double getLado();

    int getNumLados();

    double getPrecio();

    void setLado(double lado);

    void setMaterial(String material);

    void setPrecio(double precio);

    double calcularArea();

    default double calcularPerimetro() {
        return getLado()*getNumLados();
    }

    default double calcularAngulos() {
        return 360/getNumLados();
    }

    default boolean esMayor(Poligono a, Poligono b) {
        boolean salida = false;
        if (a.calcularArea() > b.calcularArea())
            salida = true;
        return salida;
    }

    default double darPrecio(String material) {
        double precio;
        switch (material) {
            case "Cartón":
                precio = 100;
                break;
            case "Plástico":
                precio = 300;
                break;
            case "Madera":
                precio = 500;
                break;
            default:
                precio = 0;
                break;
        }
        return precio;
    }

}
