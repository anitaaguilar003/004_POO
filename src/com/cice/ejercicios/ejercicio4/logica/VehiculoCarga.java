package com.cice.ejercicios.ejercicio4.logica;

public class VehiculoCarga extends Vehiculo {

    private int pma;

    public VehiculoCarga() {
        super();
    }

    public VehiculoCarga(Matricula matricula,int pma) {
        super(matricula);
        this.pma = pma;
    }

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n\tPeso máximo autorizado: "+this.pma;
    }

    @Override
    public double calcularPrecio(int dias) {
        return (20+this.pma);
    }
}
