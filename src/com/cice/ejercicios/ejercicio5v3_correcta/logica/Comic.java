package com.cice.ejercicios.ejercicio5v3_correcta.logica;

import java.time.LocalDate;

public class Comic extends Publicacion {
    private int numero;
    private String coleccion;

    public Comic() {
        super();
    }

    public Comic(int dia, int mes, int anyo, String titulo, int numero, String coleccion) {
        super(dia,mes,anyo,titulo);
        this.numero = numero;
        this.coleccion = coleccion;
    }

    public Comic(LocalDate fecha, String titulo, int numero, String coleccion) {
        super(fecha,titulo);
        this.numero = numero;
        this.coleccion = coleccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    @Override
    public String toString() {
        return "CÓMIC: {\n"+
                "\tTítulo: "+getTitulo()+"\n"+
                "\tColección: "+getColeccion()+"\n"+
                "\tNúmero: "+getNumero()+"\n"+
                "\tFecha: "+fechaConFormato()+"}";
    }
}
