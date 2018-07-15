package com.cice.ejercicios.ejercicio4.logica;

public class Furgoneta extends VehiculoCarga {

    public Furgoneta() {
        super();
    }

    public Furgoneta(Matricula matricula, int pma) {
        super(matricula,pma);
    }

    @Override
    public String toString() {
        return "[FURGONETA]\n"+super.toString();
    }

    @Override
    public double calcularPrecio(int dias) {
        double precioFinal = super.calcularPrecio(dias);
        return Math.round(precioFinal * 100d) / 100d;
    }

}
