package com.cice.ejercicios.ejercicio1;

import java.text.DecimalFormat;

public class Director extends Gerente{

    private String matriculaCoche;

    public Director(String nombre, double salario, String fechaNacimiento, String departamento, String matriculaCoche) {
        super(nombre,salario,fechaNacimiento,departamento);
        this.matriculaCoche = matriculaCoche;
        this.incentivo(1.10,100);
    }

    public String getMatriculaCoche() {
        return matriculaCoche;
    }

    public void setMatriculaCoche() {
        this.matriculaCoche = matriculaCoche;
    }

    protected void incentivo(double incentivo,double incremento) {
        incentivo(incentivo);
        setSalario(incremento+getSalario());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Director{\n" +
                "nombre=" + getNombre() + '\n' +
                "salario=" + df.format(getSalario()) + "\n" +
                "fechaNacimiento=" + getFechaNacimiento() + '\n' +
                "departamento=" + getDepartamento() + '\n' +
                "matriculaCoche=" + matriculaCoche + '\n' +
                '}';
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy el director de la empresa y me llamo "+getNombre());
    }
}
