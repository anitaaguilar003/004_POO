package com.cice.ejercicios.ejercicio4.logica;

public class Camion extends VehiculoCarga {

    public Camion() {
        super();
    }

    public Camion(Matricula matricula, int pma) {
        super(matricula,pma);
    }

    @Override
    public String toString() {
        return "[CAMIÓN]\n"+super.toString();
    }

    @Override
    public double calcularPrecio(int dias) {
        double precioFinal = super.calcularPrecio(dias)+40;
        return Math.round(precioFinal * 100d) / 100d;
    }

}
