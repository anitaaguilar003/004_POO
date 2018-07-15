package com.cice.ejercicios.ejercicio4.logica;

public abstract class Vehiculo {

    private Matricula matricula;

    public Vehiculo() {
        super();
    }

    public Vehiculo(Matricula matricula) {
        this.matricula = matricula;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Vehiculo && ((Vehiculo) obj).getMatricula().equals(this.matricula));
    }

    @Override
    public String toString() {
        return "\tMatrícula: "+getMatricula().toString();
    }

    public abstract double calcularPrecio(int dias);
}
