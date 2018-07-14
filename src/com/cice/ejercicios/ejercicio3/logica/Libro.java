package com.cice.ejercicios.ejercicio3.logica;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado = false;

    public Libro() {
        super();
    }

    public Libro (int codigo, String titulo, int anyo) {
        super(codigo,titulo,anyo);
    }

    @Override
    public String toString () {
        return super.toString()+
                "\n\t "+estaPrestado()+" prestado.";
    }

    private String estaPrestado() {
        String salida = "";
        if (prestado())
            salida = "Sí";
        else
            salida = "No";
        return salida;
    }


    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public boolean prestado() {
        return this.prestado;
    }
}
