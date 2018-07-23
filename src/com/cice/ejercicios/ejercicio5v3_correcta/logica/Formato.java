package com.cice.ejercicios.ejercicio5v3_correcta.logica;

public enum Formato {

    DVD("DVD"),
    CD("CD"),
    BLURAY("Blu-Ray"),
    VINILO("Vinilo"),
    UMD("UMD");

    private String nombre;

    private Formato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


}
