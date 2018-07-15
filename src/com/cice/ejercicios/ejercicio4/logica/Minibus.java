package com.cice.ejercicios.ejercicio4.logica;

public class Minibus extends TransportePersonas {

    public Minibus() {
        super();
    }

    public Minibus(Matricula matricula, int plazas) {
        super(matricula,plazas);
    }

    @Override
    public String toString() {
        return "[MINIBÚS]\n"+super.toString();
    }

    @Override
    public double calcularPrecio(int dias) {
        double precioFinal = super.calcularPrecio(dias)+(3.5*dias+3.5*getPlazas());
        return (Math.round(precioFinal * 100d) / 100d);
    }
}
