package com.cice.ejercicios.ejercicio3.logica;

public class Revista extends Publicacion {

    private int numero;

    public Revista() {
        super();
    }

    public Revista(int codigo, String titulo, int anyo, int numero) {
        super(codigo,titulo,anyo);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString () {
        return super.toString()+
                "\n\tNúmero: "+getNumero();
    }

}
