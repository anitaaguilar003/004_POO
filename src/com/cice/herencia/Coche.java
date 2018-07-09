package com.cice.herencia;

//Esta es una sublcase de Vehiculo que se llama Coche. Aquí tenemos acceso a todo menos a lo que es PRIVATE

public class Coche extends Vehiculo {
    //Tiene sus propis atributos aparte de los del padre
    private int potencia;
    private int numeroPuertas;
    private int numeroPlazas;
    private String modelo;
    private String marca;

    //Se crea a un constructor
    public Coche() {
        super();
    }

    public Coche(int potencia, int numeroPuertas, int numeroPlazas, String modelo, String marca) {
        super(); //Se deja constancia de que se usa el constructor sin parámetros de la superclase.
        this.potencia = potencia;
        this.numeroPuertas = numeroPuertas;
        this.numeroPlazas = numeroPlazas;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Coche(String color, String bastidor, int numeroRuedas, int potencia, int numeroPuertas, int numeroPlazas, String modelo, String marca) {
        super(color, bastidor, numeroRuedas);
        this.potencia = potencia;
        this.numeroPuertas = numeroPuertas;
        this.numeroPlazas = numeroPlazas;
        this.modelo = modelo;
        this.marca = marca;
    }

    //Como todos los atributos son privados, hay que generar sus métodos GET y SET para poder acceder a ellos. Esto sigue lo de JavaBean.
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}