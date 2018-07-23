package com.cice.ejercicios.ejercicio5v3_correcta.logica;

import java.time.LocalDate;

public class Revista extends Publicacion {
    private int numero;
    private Periodicidad periodicidad;

    public Revista() {
        super();
    }

    public Revista(int dia, int mes, int anyo, String titulo, int numero, Periodicidad periodicidad) {
        super(dia,mes,anyo,titulo);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public Revista(LocalDate fecha, String titulo, int numero, Periodicidad periodicidad) {
        super(fecha,titulo);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(Periodicidad periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "REVISTA: {\n"+
                "\tTítulo: "+getTitulo()+"\n"+
                "\tNúmero: "+getNumero()+"\n"+
                "\tFecha: "+fechaConFormato()+"\n"+
                "\tPeriodicidad: "+getPeriodicidad().getNombre()+"}";
    }
}
