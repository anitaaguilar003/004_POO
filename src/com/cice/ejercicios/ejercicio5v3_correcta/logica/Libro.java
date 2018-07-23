package com.cice.ejercicios.ejercicio5v3_correcta.logica;

import java.time.LocalDate;

public class Libro extends Publicacion implements IPrestable {
    private String autor;
    private String isbn; //https://www.isbn-international.org/es/content/¿qué-es-un-isbn
    private int edicion;
    private boolean prestado;

    public Libro() {
        super();
    }

    public Libro(int dia, int mes, int anyo, String titulo, String autor, String isbn, int edicion) {
        super(dia,mes,anyo,titulo);
        this.autor = autor;
        this.isbn = isbn;
        this.edicion = edicion;
        this.prestado = false;
    }

    public Libro(LocalDate fecha, String titulo,String autor, String isbn, int edicion) {
        super(fecha,titulo);
        this.autor = autor;
        this.isbn = isbn;
        this.edicion = edicion;
        this.prestado = false;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public boolean prestar() {
        if(isPrestado())
            return false;
        else {
            this.prestado = true;
            return true;
        }
    }

    @Override
    public boolean devolver() {
        if(!isPrestado())
            return false;
        else {
            this.prestado = false;
            return true;
        }
    }

    @Override
    public boolean isPrestado() {
        if(this.prestado)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "LIBRO: {\n"+
                "\tTítulo: "+getTitulo()+"\n"+
                "\tAutor: "+getAutor()+"\n"+
                "\tEdicion: "+getEdicion()+"\n"+
                "\tFecha: "+fechaConFormato()+"\n"+
                "\tISBN: "+getIsbn()+"\n"+
                "\tPrestado: "+isPrestado()+"}";
    }


}
