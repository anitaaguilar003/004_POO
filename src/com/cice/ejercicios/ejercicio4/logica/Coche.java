package com.cice.ejercicios.ejercicio4.logica;

public class Coche extends TransportePersonas {

    public Coche() {
        super();
    }

    public Coche(Matricula matricula, int plazas) {
        super(matricula,plazas);
    }

    @Override
    public String toString() {
        return "[COCHE]\n"+super.toString();
    }

    @Override
    public double calcularPrecio(int dias) {
        double precioFinal = super.calcularPrecio(dias)+(1.5*dias+1.5*getPlazas());
        return (Math.round(precioFinal * 100d) / 100d);
    }

}
