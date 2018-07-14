package com.cice.ejercicios.ejercicio3;

/*
Escribe un programa para una biblioteca que contenga libros y revistas.

Las características comunes que se almacenan tanto para las revistas como para los libros son el código, el título, y el año de publicación. Estas tres características se pasan por parámetro en el momento de crear los objetos.
Los libros tienen además un atributo prestado. Los libros, cuando se crean, no están prestados.
Las revistas tienen un número. En el momento de crear. En el momento de crear las revistas se pasa el número por parámetro.
Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString() que devuelve el valor de todos los atributos en una cadena de caracteres. También tienen un método que devuelve el año de publicación, y otro el código.
Para prevenir posibles cambios en el programa se tiene que implementar una interfaz Prestable con los métodos prestar(), devolver() y prestado. La clase Libro implementa esta interfaz
 */


import com.cice.ejercicios.ejercicio3.logica.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Libro l1 = new Libro(2,"Michu",1988);
        Libro l2 = new Libro(3,"Ojete",2001);
        Revista r1 = new Revista(17,"Los patos",1990,235);
        Revista r2 = new Revista(200,"Hobby Consolas",2005,1598);

        l2.prestar();

        System.out.println(l2.toString());

        Publicacion[] lista = {l1,l2,r1,r2};

        Biblioteca b = new Biblioteca();

        System.out.println(b.cuentaPrestados(lista));

        System.out.println(b.publicacionesAnterioresA(1990,lista));


    }


    /*public static void main(String[] args) {
        ArrayList<Publicacion> lista = new ArrayList<>();

        Libro libro = new Libro(1,"Ojete",1988);

        lista.add(libro);
        lista.add(new Revista(2,"Los patos",2000,3));

        for(Publicacion p : lista) {
            System.out.println(p.toString());
        }

        System.out.println(libro.prestado());
        libro.prestar();
        System.out.println(libro.prestado());
        libro.devolver();
        System.out.println(libro.prestado());

    }*/

}
