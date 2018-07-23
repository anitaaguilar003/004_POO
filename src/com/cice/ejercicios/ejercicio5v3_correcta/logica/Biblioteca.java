package com.cice.ejercicios.ejercicio5v3_correcta.logica;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Recurso> catalogo;

    public Biblioteca() {
        this.catalogo = new ArrayList<>();
        completarCatalogo();
    }

    private void completarCatalogo() {
        catalogo.add(new Libro(4,2,2018,"Autobiografía","Miguel Negrillo","1023454355",6));
        catalogo.add(new Libro(5,7,1950,"Reglamento del pilla-pilla","Anónimo","2448431364",10));
        Libro libro = new Libro(8,4,2000,"Fantasía","Mickey Mouse","36485432132",1);
        libro.prestar();
        catalogo.add(libro);
        catalogo.add(new Comic(5,11,1995,"Amazing Spider-Man",500,"Spider-Man"));
        catalogo.add(new Revista(4,12,2001,"Caza y pesca",30,Periodicidad.MENSUAL));
        catalogo.add(new Disco("Master of Puppets",0,50,23,Formato.CD));
        catalogo.add(new Disco("Black",1,3,20,Formato.VINILO));
        Disco disco = new Disco("Los Zigarros",0,31,1,Formato.CD);
        disco.prestar();
        catalogo.add(disco);
    }

    public int nPrestados() {
        int cuantos = 0;
        for(Recurso r : catalogo) {
            if(r instanceof IPrestable && ((IPrestable) r).isPrestado())
                cuantos++;
        }
        return cuantos;
    }

    public int nLibrosPrestados() {
        int cuantos = 0;
        for(Recurso r : catalogo) {
            if(r instanceof Libro && ((Libro) r).isPrestado())
                cuantos++;
        }
        return cuantos;
    }

    public int nDiscosPrestados() {
        int cuantos = 0;
        for(Recurso r : catalogo) {
            if(r instanceof Disco && ((Disco) r).isPrestado())
                cuantos++;
        }
        return cuantos;
    }

    public void publicacionesAnterioresA(int anyo){
        boolean control = false;
        if(hayPublicaciones()) {
            for(Recurso r : catalogo) {
                if (r instanceof Publicacion && ((Publicacion) r).getFechaPublicacion().getYear()<anyo) {
                    System.out.println(r.toString());
                    control = true;
                }
            }
        } else if (!control)
            System.out.println("No hay ninguna publicación anterior al año "+anyo);
        else
            System.out.println("No hay publicaciones en el catálogo de la biblioteca.");
    }

    private boolean hayPublicaciones() {
        boolean lasHay = false;
        for(Recurso r : catalogo) {
            if(r instanceof Publicacion) {
                lasHay = true;
                break;
            }
        }
        return lasHay;
    }

    public void imprimirCatalogo() {
        for(Recurso r : catalogo)
            System.out.println(r.toString());
    }

}
