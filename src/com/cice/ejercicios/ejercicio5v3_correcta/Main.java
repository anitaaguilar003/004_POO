package com.cice.ejercicios.ejercicio5v3_correcta;

import com.cice.ejercicios.ejercicio5v3_correcta.logica.*;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Cuántos prestados, en general: "+biblioteca.nPrestados());
        System.out.println("Cuántos libros prestados: "+biblioteca.nLibrosPrestados());
        System.out.println("Cuántos discos prestados: "+biblioteca.nDiscosPrestados());
        System.out.println("==========================================");
        System.out.println("Publicaciones anteriores a 2000: ");
        biblioteca.publicacionesAnterioresA(2000);
        System.out.println("===========================================");
        System.out.println("Catálogo completo: ");
        biblioteca.imprimirCatalogo();


    }

}
