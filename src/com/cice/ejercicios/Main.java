package com.cice.ejercicios;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDateTime fecha1 = LocalDateTime.of(1995,6,20,11,30);
        LocalDateTime fecha2 = LocalDateTime.of(2000,3,2,12,23);
        System.out.println(Duration.between(fecha1,fecha2).getSeconds());

        System.out.println(fecha1);

        LocalDate fecha3 = LocalDate.of(2011,2,13);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
        String fechaString = fecha3.format(formatters);
        LocalDate parsedDate = LocalDate.parse(fechaString, formatters);

        System.out.println("date: " + fecha3); // date: 2016-09-25
        System.out.println("Text format " + fechaString); // Text format 25/09/2016
        System.out.println("parsedDate: " + parsedDate); // parsedDate: 2016-09-25

        LocalTime duracion = LocalTime.of(1,20,30);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("H:mm:ss");
        String duracionString = duracion.format(formato);
        System.out.println(duracionString);

        for(int i = 0; i<10; i++) {
            System.out.println(i);
            if(i==2)
                break;
        }
    }

}
