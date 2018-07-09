package com.cice.herencia;

public class Herencia {
    public static void main(String[] args) {
        Coche coche = new Coche(90,1,2,"Troncomóvil","ACME");
        System.out.println(coche.getMarca());
        System.out.println(coche.getBastidor());
    }

}
