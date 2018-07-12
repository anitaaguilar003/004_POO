package com.cice.ejercicios.ejercicio2;

/*
- Venta de polígonos
- Los polígonos pueden ser de:
    - Cartón (100 euros)
    - Plástico (300 euros)
    - Madera (500 euros)
- Los polígonos coloreados se diferencian del resto porque llevan color y valen un 15 % más.

Se han sacado pentágonos coloreados con las firmas de los principales diseñadores que valen un 20 % más.

 */

import com.cice.ejercicios.ejercicio2.logica.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Poligono> lista = new ArrayList<>();

        DecimalFormat df = new DecimalFormat("#,##0.00");

        lista.add(new Triangulo("Madera",30));
        lista.add(new Cuadrilatero("Cartón",10));
        lista.add(new Pentagono("Plástico","Azul",true,15));

        for (Poligono p : lista) {
            System.out.println(obtenerClase(p));
            System.out.println("\tPrecio: "+df.format(p.getPrecio())+" euros");
            System.out.println("\tNúmero de lados: "+p.getNumLados());
            System.out.println("\tPerímetro: "+p.calcularPerimetro());
            System.out.println("\tMedida de cada ángulo: "+p.calcularAngulos()+" º");
            System.out.println("\tÁrea: "+df.format(p.calcularArea()));
            System.out.println("=============================");
        }

        calcularMayor(lista);

    }

    public static String obtenerClase (Poligono p) {
        String[] nombreClase = p.getClass().getName().split("\\.");
        return nombreClase[nombreClase.length-1];
    }

    public static void calcularMayor(ArrayList<Poligono> lista) {
        Poligono aux = lista.get(0);
        for(int i=1; i<lista.size(); i++) {
            aux = aux.mayor(aux,lista.get(i));
        }
        System.out.println("El mayor de todos es el "+obtenerClase(aux));
    }

}
