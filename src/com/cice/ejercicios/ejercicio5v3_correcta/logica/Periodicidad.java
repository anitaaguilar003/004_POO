package com.cice.ejercicios.ejercicio5v3_correcta.logica;

    public enum Periodicidad{
        SEMANAL("Semanal",52),
        QUINCENAL("Quincenal",26),
        MENSUAL("Mensual",12),
        BIMESTRAL("Bimestral",6),
        ANUAL("Anual",1);

        private String nombre;
        private int numerosAlAnyo;

        private Periodicidad(String nombre,int numerosAlAnyo) {
            this.nombre = nombre;
            this.numerosAlAnyo = numerosAlAnyo;
        }

        public String getNombre() {
            return nombre;
        }

        public int getNumerosAlAnyo() {
            return numerosAlAnyo;
        }

        @Override
        public String toString() {
            return nombre;
        }
    }

