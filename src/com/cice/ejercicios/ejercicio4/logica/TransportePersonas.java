package com.cice.ejercicios.ejercicio4.logica;

public class TransportePersonas extends Vehiculo {

    private int plazas;

    public TransportePersonas() {
        super();
    }

    public TransportePersonas(Matricula matricula, int plazas) {
        super(matricula);
        this.plazas=plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public String toString() {
        return super.toString()+
                "\n\tNúmero de plazas: "+getPlazas();
    }

    public double calcularPrecio(int dias) {
        return (50*dias+50*this.plazas);
    }
}
