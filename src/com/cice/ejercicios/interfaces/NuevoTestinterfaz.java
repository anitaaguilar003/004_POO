package com.cice.ejercicios.interfaces;

import java.util.List;

public class NuevoTestinterfaz implements Interfaz{
    @Override
    public String nombreCompleto(String nombre, String apellido) {
        return nombre + " " + apellido;
    }

    @Override
    public double calcularEdadMedia(List<Integer> edades) {
        return 0;
    }

    @Override
    public void test(String palabra) {
        System.out.println(palabra);
    }
}
