package com.cice.ejercicios.ejercicio5v2.logica;

public class Comic extends Publicacion {
    //- Cómics -> número, colección

    private int numero;
    private String coleccion;

    public Comic() {
        super();
    }

    public Comic(String fechaPublicacion,String titulo, int numero, String coleccion) {
        super(fechaPublicacion, titulo);
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

    public String toString() {
        return "LIBRO\n"+
                "\t{Número "+this.numero+"\n"+
                "\tColección "+this.coleccion+"\n"+super.toString();
    }
}
