package com.cice.ejercicios.abstraccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Abstracta> lista = Arrays.asList(new Abstracta[]{new Test(), new NuevoTest()});

        for(Abstracta abstracta : lista) {
            abstracta.testAbstracto();
        }

        Abstracta ab1 = new Test();
        Abstracta ab2 = new NuevoTest();

        List<Abstracta> lista2 = new ArrayList<>();

        lista2.add(ab1);
        lista2.add(ab2);

        for(Abstracta abstracta : lista) {
            abstracta.testAbstracto();
        }

    }

}
