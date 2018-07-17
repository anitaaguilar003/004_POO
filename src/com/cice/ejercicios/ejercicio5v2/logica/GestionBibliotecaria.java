package com.cice.ejercicios.ejercicio5v2.logica;

public class GestionBibliotecaria {

    private Biblioteca biblioteca = new Biblioteca();

    public void iniciarApp() {
        if(biblioteca.isVacia())
            rellenarDatos();
        mostrarMenu();
        System.out.println("Vamos a ver cuántos libros están prestados: "+biblioteca.numPrestados(1));
        System.out.println("Vamos a ver cuántos discos están prestados: "+biblioteca.numPrestados(2));
        System.out.println("Vamos a ver todo lo que hay en la biblioteca: ");
        biblioteca.imprimirPublicacionesYDiscos();
        System.out.println("Vamos a diferenciar prestados y no prstados");
        biblioteca.imprimirPrestadosONo();

    }

    private void mostrarMenu() {
        System.out.println("1. Número de libros prestados" +
                "2. Número de discos prestados" +
                "3. Publicaciones anteriores a una fecha" +
                "4. Imprimir listado de publicaciones y discos" +
                "5. Imprimri el listado de publicaciones y discos diferenciando si está prestado o no");
    }

    private void rellenarDatos() {
        biblioteca.addRecurso("Fecha","Spiderman",123,"Colección");
        biblioteca.addRecurso("TítuloDisco",25.4,"Formato");
        biblioteca.addRecurso("Fecha","TítuloLibro",5,"ISBN","Autor");
        biblioteca.addRecurso("Fecha","TítuloLibro2",7,"ISNB","Autor");
        biblioteca.addRecurso("TituloDisco2",30,"Formato");
        biblioteca.obtenerRecurso(3).prestar();
        biblioteca.obtenerRecurso(4).prestar();
    }

}
