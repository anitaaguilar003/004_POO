package com.cice.ejercicios.ejercicio3.logica;

public class Publicacion {

    private int codigo;
    private String titulo;
    private int anyo;

    public Publicacion() {
        super();
    }

    public Publicacion (int codigo, String titulo, int anyo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anyo = anyo;
    }

    public int getAnyo() {
        return anyo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Libro:\n"+
                "\tTítulo: "+getTitulo()+
                "\n\tCódigo: "+getCodigo()+
                "\n\tAño: "+getAnyo();
    }

}
