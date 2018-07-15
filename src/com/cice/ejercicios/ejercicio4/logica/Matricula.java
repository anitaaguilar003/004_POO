package com.cice.ejercicios.ejercicio4.logica;

public class Matricula {

    private static final char[] LETRAS_ACEPTADAS = {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
    private int numeros;
    private String letras;

    public Matricula() {
        super();
    }

    public Matricula(int numeros,String letras) {
        if(matriculaCorrecta(numeros,letras)) {
            this.numeros = numeros;
            this.letras = letras.toUpperCase();
        }
    }

    public int getNumeros() {
        return numeros;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        if(letrasCorrectas(letras))
            this.letras = letras.toUpperCase();
    }

    public void setNumeros(int numeros) {
        if(numerosCorrectos(numeros))
            this.numeros = numeros;
    }

    @Override
    public String toString() {
        return numeros+letras;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Matricula && this.numeros == ((Matricula) obj).getNumeros() && this.letras.equals(((Matricula) obj).getLetras()))
            return true;
        else
            return false;
    }

    public boolean matriculaCorrecta(int numeros, String letras) {
        if(numerosCorrectos(numeros) && letrasCorrectas(letras))
            return true;
        else
            return false;
    }

    private boolean numerosCorrectos(int numeros) {
        String n = Integer.toString(numeros);
        if(n.length() == 4)
            return true;
        else
            return false;
    }

    private boolean letrasCorrectas(String letras) {
        String letras1 = letras.toUpperCase();
        boolean[] control = {false,false,false};
        for(int i=0; i<letras1.length() && !arrayTrue(control);i++) {
            for(int j=0; j<LETRAS_ACEPTADAS.length && !control[i]; j++) {
                if(letras1.charAt(i) == LETRAS_ACEPTADAS[j]) {
                    control[i] = true;
                }
            }

        }
        return arrayTrue(control);
    }

    private boolean arrayTrue(boolean[] b) {
        int aux = 0;
        for(boolean booleano : b) {
            if(booleano)
                aux++;
        }
        if(aux == b.length)
            return true;
        else
            return false;
    }

}
