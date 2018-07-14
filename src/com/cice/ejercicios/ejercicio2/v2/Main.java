package com.cice.ejercicios.ejercicio2.v2;

import com.cice.ejercicios.ejercicio2.v2.logica.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Poligono triangulo = new Triangulo("Cartón",20);
        Poligono cuadrado = new Cuadrado("Madera",15);
        Poligono pentagonoFirmado = new Pentagono("Plástico",10,"Verde",true);

        ArrayList<Poligono> lista = new ArrayList<>();

        lista.add(triangulo);
        lista.add(cuadrado);
        lista.add(pentagonoFirmado);

        for(Poligono p : lista) {
            System.out.println(p.toString());
        }
    }

}
