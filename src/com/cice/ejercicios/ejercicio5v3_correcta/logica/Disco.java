package com.cice.ejercicios.ejercicio5v3_correcta.logica;

import java.time.LocalTime;

public class Disco extends Multimedia implements IPrestable {

    private boolean prestado;


    public Disco() {
        super();
    }

    public Disco(String titulo, int horas, int minutos, int segundos, Formato formato) {
        super(titulo,horas,minutos,segundos,formato);
        this.prestado = false;
    }

    public Disco(String titulo, LocalTime duracion, Formato formato) {
        super(titulo,duracion,formato);
        this.prestado = false;
    }

    @Override
    public boolean prestar() {
        if(isPrestado())
            return false;
        else {
            this.prestado = true;
            return true;
        }
    }

    @Override
    public boolean devolver() {
        if(!isPrestado())
            return false;
        else {
            this.prestado = false;
            return true;
        }
    }

    @Override
    public boolean isPrestado() {
        if(this.prestado)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "DISCO: {\n"+
                "\tTítulo: "+getTitulo()+"\n"+
                "\tFormato: "+getFormato().getNombre()+"\n"+
                "\tDuración: "+duracionConFormato()+"\n"+
                "\tPrestado: "+isPrestado()+"}";
    }

}
