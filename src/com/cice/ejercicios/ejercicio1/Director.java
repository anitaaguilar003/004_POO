package com.cice.ejercicios.ejercicio1;

import java.text.DecimalFormat;

public class Director extends Gerente{

    private String matriculaCoche;

    public Director() {
        super();
    }

    public Director(String nombre, double salario, String fechaNacimiento, String departamento, String matriculaCoche) {
        super(nombre,salario,fechaNacimiento,departamento);
        this.matriculaCoche = matriculaCoche;
        incentivo();
    }

    public String getMatriculaCoche() {
        return matriculaCoche;
    }

    public void setMatriculaCoche() {
        this.matriculaCoche = matriculaCoche;
    }

    @Override
    public void incentivo() {
        setSalario(100+(getSalario()*1.10));
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
}
