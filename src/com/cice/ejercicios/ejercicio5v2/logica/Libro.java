package com.cice.ejercicios.ejercicio5v2.logica;

public class Libro extends Publicacion {
    //edición, ISBN, autor (es único)
    private int edicion;
    private String isbn;
    private String autor;

    public Libro() {
        super();
    }

    public Libro(String fechaPublicacion, String titulo, int edicion, String isbn, String autor) {
        super(fechaPublicacion,titulo);
        this.edicion = edicion;
        this.isbn = isbn;
        this.autor = autor;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicion() {
        return edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String toString() {
        return "LIBRO\n"+
                "\t{Edición "+this.edicion+"\n"+
                "\tISBN "+this.isbn+"\n"+
                "\tAutor "+this.autor+"\n"+super.toString();
    }

}
