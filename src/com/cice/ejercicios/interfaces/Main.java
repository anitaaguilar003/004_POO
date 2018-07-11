package com.cice.ejercicios.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TestInterfaz test = new TestInterfaz();
        String n = test.nombreCompleto("Osete", "Plastidécor");

        NuevoTestinterfaz test2 = new NuevoTestinterfaz();
        String m = test2.nombreCompleto("Osete", "Plastidécor");

        System.out.println(n);
        System.out.println(m);

        List<Interfaz> lista = new ArrayList<>();

        lista.add(test);
        lista.add(test2);

    }

}
