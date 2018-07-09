package com.cice.ejercicios.ejercicio1;

public class Empleado {
    private String nombre;
    private double salario;
    private String fechaNacimiento;

    public Empleado() {
        super();
    }

    public Empleado(String nombre, double salario, String fechaNacimiento) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Empleado{\n" +
                "nombre=" + nombre + '\n' +
                "salario=" + salario + "\n" +
                "fechaNacimiento=" + fechaNacimiento + '\n' +
                '}';
    }
}
