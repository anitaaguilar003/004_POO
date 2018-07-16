package com.cice.ejercicios.ejercicio5.logica;

public class Recurso {

    private String fechaPublicacion;
    private String titulo;

    public Recurso(){
        super();
    }

    public Recurso(String fechaPublicacion, String titulo){
        this.fechaPublicacion = fechaPublicacion;
        this.titulo = titulo;
    }

    public void setFechaPublicacion (String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

}
