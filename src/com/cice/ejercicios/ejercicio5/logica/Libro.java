package com.cice.ejercicios.ejercicio5.logica;

public class Libro extends Recurso implements Prestamo {
    //edición, ISBN, autor (es único)
    private int edicion;
    private String isbn;
    private String autor;
    private boolean prestado;

    public Libro() {
        super();
    }

    public Libro(String fechaPublicacion, String titulo, int edicion, String isbn, String autor) {
        super(fechaPublicacion,titulo);
        this.edicion = edicion;
        this.isbn = isbn;
        this.autor = autor;
        this.prestado = false;
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

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    public boolean isPrestado() {
        return this.prestado;
    }
}
