package com.cice.ejercicios.interfaces;

import java.util.List;

public class TestInterfaz implements Interfaz {
    @Override
    public String nombreCompleto(String nombre, String apellido) {
        return apellido + ", " + nombre;
    }

    @Override
    public double calcularEdadMedia(List<Integer> edades) {
        return 0;
    }

    @Override
    public void test(String palabra) {
        System.out.println("La palabra recibida no vale para nada.");
    }
}
