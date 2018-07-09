package com.cice.ejercicios.ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> plantilla = new ArrayList<>();
        plantilla.add(new Empleado("Randy Orton",750,"10/10/1990"));
        plantilla.add(new Empleado("Batista",800,"15/07/1988"));
        plantilla.add(new Empleado("Ric Flair",975,"01/01/1950"));
        plantilla.add(new Gerente("Triple H",995,"06/08/1981","Evolution"));
        plantilla.add(new Director("Vince McMahon",1200,"04/02/1965","Evolution","9841DIY"));

        for(Empleado persona : plantilla) {
            System.out.println(persona.toString());
        }


    }
}
