package com.cice.ejercicios.ejercicio4.logica;

import java.util.Scanner;

public class ServicioAlquileres {

    private static final Scanner LEER_CONSOLA = new Scanner(System.in);
    private static final int[] OPCIONES = {1, 2, 3, 0};
    private static final int[] OPCIONES_SUBMENU = {1, 2};
    private int opcion = -1;
    private ParqueMotor vehiculos = new ParqueMotor();

    public void iniciarApp() {
        while (!opcionValida(this.opcion, 1)) {
            abrirMenu();
            this.opcion = leerEntero();
        }
        ejecutarMenu();
    }

    private void ejecutarMenu() {
        switch (this.opcion) {
            case 1:
                anadirVehiculo(false);
                break;
            case 2:
                mostrarPrecioConcreto(false);
                break;
            case 3:
                mostrarTodosAlquileres();
                break;
            case 0:
                break;
            default:
                this.opcion = -1;
                iniciarApp();
                break;
        }
    }

    private void mostrarTodosAlquileres() {
        System.out.println("¿Cuántos días necesitas el vehículo?");
        int dias = leerEntero();
        System.out.println("Aquí está todo el catálogo de precios:");
        System.out.println(this.vehiculos.mostrarPrecios(dias));
        this.opcion = -1;
        iniciarApp();
    }

    private void mostrarPrecioConcreto(boolean control) {
        Matricula matricula = new Matricula();
        do {
            System.out.println("Introduce la matrícula del vehículo cuyo precio deseas saber:\n(Formato: XXXXAAA)");
            String nMatricula = leerString();
            int numeros = Integer.parseInt(nMatricula.substring(0, 4));
            String letras = nMatricula.substring(4, 7);
            if (matricula.matriculaCorrecta(numeros, letras)) {
                control = true;
                matricula.setLetras(letras);
                matricula.setNumeros(numeros);
            }
        } while (!control);
        if(vehiculos.existeMatricula(matricula)) {
            System.out.println("¿Cuántos días se alquilará el coche?");
            int dias = leerEntero();
            System.out.println("Aquí tienes toda la información: ");
            System.out.println(this.vehiculos.mostrarVehiculo(matricula));
            System.out.println(this.vehiculos.alquiler(matricula,dias));
        } else {
            System.out.println("No existe esa matrícula introducida.");
        }
        this.opcion = -1;
        iniciarApp();
    }

    private void anadirVehiculo(boolean control) {
        int opcionElegida = -1;
        while (!control) {
            System.out.println("¿Qué tipo de vehículo quieres introducir?" +
                    "\n\t1. VEHÍCULO DE TRANSPORTE DE PERSONAS" +
                    "\n\t2. VEHÍCULO DE TRANSPORTE DE CARGA");
            opcionElegida = leerEntero();
            control = opcionValida(opcionElegida, 2);
        }
        switch (opcionElegida) {
            case 1:
                anadirTransportePersonas(false);
                break;
            case 2:
                anadirTransporteCarga(false);
                break;
            default:
                break;
        }
    }

    private void anadirTransporteCarga(boolean control) {
        int opcionElegida = -1;
        while (!control) {
            System.out.println("¿Qué tipo de vehículo de transporte de carga quieres añadir" +
                    "\n\t1. CAMIÓN" +
                    "\n\t2. FURGONETA DE TRANSPORTE");
            opcionElegida = leerEntero();
            control = opcionValida(opcionElegida, 2);
        }
        switch (opcionElegida) {
            case 1:
            case 2:
                anadirCamionOFurgoneta(false, opcionElegida);
                break;
            default:
                break;
        }
    }

    private void anadirCamionOFurgoneta(boolean control, int opcion) {
        Matricula matricula = new Matricula();
        do {
            System.out.println("Introduce la matrícula del vehículo de transporte de personas:\n(Formato: XXXXAAA)");
            String nMatricula = leerString();
            int numeros = Integer.parseInt(nMatricula.substring(0, 4));
            String letras = nMatricula.substring(4, 7);
            if (matricula.matriculaCorrecta(numeros, letras)) {
                control = true;
                matricula.setLetras(letras);
                matricula.setNumeros(numeros);
            }
        } while (!control);
        System.out.println("Ahora, introduce el peso máximo admitido:");
        int pma = leerEntero();
        switch (opcion) {
            case 1:
                this.vehiculos.anadirVehiculo(new Camion(matricula, pma));
                break;
            case 2:
                this.vehiculos.anadirVehiculo(new Furgoneta(matricula, pma));
                break;
            default:
                break;
        }
        this.opcion = -1;
        iniciarApp();
    }

    private void anadirTransportePersonas(boolean control) {
        int opcionElegida = -1;
        while (!control) {
            System.out.println("¿Qué tipo de vehículo de transporte de pesonas quieres añadir?" +
                    "\n\t1. COCHE" +
                    "\n\t2. MINIBÚS");
            opcionElegida = leerEntero();
            control = opcionValida(opcionElegida, 2);
        }
        switch (opcionElegida) {
            case 1:
            case 2:
                anadirCocheOMinibus(false, opcionElegida);
                break;
            default:
                break;
        }
    }

    private void anadirCocheOMinibus(boolean control, int opcion) {
        Matricula matricula = new Matricula();
        do {
            System.out.println("Introduce la matrícula del vehículo de transporte de personas:\n(Formato: XXXXAAA)");
            String nMatricula = leerString();
            int numeros = Integer.parseInt(nMatricula.substring(0, 4));
            String letras = nMatricula.substring(4, 7);
            if (matricula.matriculaCorrecta(numeros, letras)) {
                control = true;
                matricula.setLetras(letras);
                matricula.setNumeros(numeros);
            }
        } while (!control);
        System.out.println("Ahora, introduce el número de plazas:");
        int nPlazas = leerEntero();
        switch (opcion) {
            case 1:
                this.vehiculos.anadirVehiculo(new Coche(matricula, nPlazas));
                break;
            case 2:
                this.vehiculos.anadirVehiculo(new Minibus(matricula, nPlazas));
                break;
            default:
                break;
        }
        this.opcion = -1;
        iniciarApp();
    }

    private void abrirMenu() {
        System.out.println("\n\nSelecciona una opción: \n" +
                "\t1. AÑADIR VEHÍCULO\n" +
                "\t2. OBTENER PRECIO DE ALQUILER DE UN VEHÍCULO\n" +
                "\t3. VER TODOS LOS ALQUILERES\n" +
                "\t0. Salir\n");
    }

    private boolean opcionValida(int n, int menu) {
        boolean salida = false;
        int[] opcionesValidas;
        if (menu == 1)
            opcionesValidas = OPCIONES;
        else
            opcionesValidas = OPCIONES_SUBMENU;
        for (int dato : opcionesValidas) {
            if (dato == n)
                salida = true;
        }
        return salida;
    }

    private int leerEntero() {
        return Integer.parseInt(LEER_CONSOLA.nextLine());
    }

    private String leerString() {
        return LEER_CONSOLA.nextLine();
    }


}
