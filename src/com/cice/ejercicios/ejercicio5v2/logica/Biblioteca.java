package com.cice.ejercicios.ejercicio5v2.logica;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Recurso> catalogo;

    public Biblioteca() {
        super();
        catalogo = new ArrayList<>();
    }

    public void addRecurso(String fechaPublicacion,String titulo, int numero, String coleccion) {
        catalogo.add(new Comic(fechaPublicacion,titulo,numero,coleccion));
    }

    public void addRecurso(String titulo, double duracion, String formato) {
        catalogo.add(new Disco(titulo,duracion,formato));
    }

    public void addRecurso(String fechaPublicacion, String titulo, int edicion, String isbn, String autor) {
        catalogo.add(new Libro(fechaPublicacion,titulo,edicion,isbn,autor));
    }

    public Recurso obtenerRecurso(int n) {
        return catalogo.get(n);
    }

    /*
    COMENTADO A LA ESPERA DE VER LOS ENUM
    public void addRecurso(String fechaPublicacion, String titulo, int numero, String periodicidad) {
        catalogo.add(new Revista(fechaPublicacion,titulo,numero,periodicidad));
    }
    */

    public boolean isVacia() {
        if(catalogo.size() > 0)
            return false;
        else
            return true;
    }

    public int numPrestados(int opcion) {
        int contador = 0;
        for(int i=0;i<catalogo.size();i++) {
            Recurso r = catalogo.get(i);
            switch(opcion) {
                case 1:
                    if ( r instanceof Libro && r.isPrestado())
                        contador++;
                    break;
                case 2:
                    if (r instanceof Disco && r.isPrestado())
                        contador++;
                    break;
                default:
                    break;
            }
        }
        return contador;
    }

    public void publicacionesAnterioresA(String fecha) {
        //Imprime todas las publicaciones anteriores a la fecha en concreto
    }

    public void imprimirPublicacionesYDiscos() {
        for(Recurso r : catalogo)
            System.out.println(r.toString());
    }

    public void imprimirPrestadosONo() {
        ArrayList<Recurso> sinPrestar = new ArrayList<>();
        System.out.println("Estos son los recursos que ya se han prestado");
        for(Recurso r : catalogo) {
            if (r.isPrestado())
                System.out.println(r.toString());
            else
                sinPrestar.add(r);
        }
        System.out.println("Estos son los recursos sin prestar");
        for(Recurso r : sinPrestar)
                System.out.println(r.toString());
    }

}
