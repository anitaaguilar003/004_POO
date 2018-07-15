package com.cice.ejercicios.ejercicio4.logica;

import java.util.Hashtable;

public class ParqueMotor {

    private Hashtable<Matricula,Vehiculo> vehiculos = new Hashtable<>();

    public ParqueMotor() {
        super();
    }

    public void anadirVehiculo(Vehiculo v) {
        vehiculos.put(v.getMatricula(),v);
    }

    public void borrarVehiculo(Matricula m) {
        vehiculos.remove(m);
    }

    public double alquiler(Matricula m,int dias) {
        return vehiculos.get(m).calcularPrecio(dias);
    }

    public String mostrarPrecios(int dias) {
        String salida = "";
        for(Matricula clave : this.vehiculos.keySet()) {
            salida += this.vehiculos.get(clave).toString()+"\nPrecio: "+this.vehiculos.get(clave).calcularPrecio(dias)+" euros";
        }
        return salida;
    }

    public String mostrarVehiculo(Matricula m) {
        return this.vehiculos.get(m).toString();
    }

    public boolean existeMatricula(Matricula m) {
        return vehiculos.containsKey(m);
    }

}
