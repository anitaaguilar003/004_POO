package com.cice.ejercicios.ejercicio2.v3;

import com.cice.ejercicios.ejercicio2.v3.logica.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Poligono> lista = new ArrayList<>();

        lista.add(new Triangulo("Cartón",15));
        lista.add(new Triangulo("Cartón",17,"Azul",false));
        lista.add(new Cuadrado("Madera",20));
        lista.add(new Cuadrado("Cartón",10,"Rojo",true));
        lista.add(new Pentagono("Plástico",20));
        lista.add(new Pentagono("Cartón",9,"Verde",true));

        for(Poligono p : lista) {
            System.out.println(p.toString());
        }
    }

}
