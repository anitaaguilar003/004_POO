package com.cice.ejercicios.ejercicio5v2.logica;

public abstract class Publicacion extends Recurso {

    private String fechaPublicacion;

    public Publicacion(){
        super();
    }

    public Publicacion(String fechaPublicacion, String titulo){
        super(titulo);
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setFechaPublicacion (String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String toString() {
        return "Fecha de publicación: "+this.fechaPublicacion+"}\n";
    }

}