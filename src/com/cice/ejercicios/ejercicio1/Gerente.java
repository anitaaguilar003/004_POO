package com.cice.ejercicios.ejercicio1;

import java.text.DecimalFormat;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double salario, String fechaNacimiento, String departamento) {
        super(nombre, salario, fechaNacimiento);
        this.departamento = departamento;
        this.incentivo(1.05);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    protected void incentivo(double incentivo) {
        setSalario(getSalario() * incentivo);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Gerente{\n" +
                "nombre=" + getNombre() + '\n' +
                "salario=" + df.format(getSalario()) + "\n" +
                "fechaNacimiento='" + getFechaNacimiento() + '\n' +
                "departamento=" + departamento + '\n' +
                '}';
    }
}
