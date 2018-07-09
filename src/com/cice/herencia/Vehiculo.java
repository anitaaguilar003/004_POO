package com.cice.herencia;

public class Vehiculo {

    //atributos de la clase Vehículo que están encapsulados
    private String color;
    private String bastidor;
    private int numeroRuedas;

    //Se crean los dos constructores. Uno sin parámetros y el otro con los parámetros de los tres atributos.
    public Vehiculo() {

    }

    public Vehiculo(String color, String bastidor, int numeroRuedas) {
        this.color = color;
        this.bastidor = bastidor;
        this.numeroRuedas = numeroRuedas;
    }

    //Métodos funcionales de la clase
    protected void arrancar() {
        System.out.println("Estoy arrancando...");
    }
    protected void apagar() {
        System.out.println("Estoy apagando el motor...");
    }

    /*---------A partir de aquí, son los métodos GETTER Y SETTER-------------*/
    public String getColor() {
        return color;
    }

    public String getBastidor() {
        return bastidor;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
}
