

import  c3actividad1*;

 public class Main {

    public  static  void  main ( String [] args ) {

        Libro l1 = new Libro ( 1 , "El Gato Feliz" , 2016 );
        Libro l2 = new Libro  (2 , "Ana Frank" , 2020 );
        Libro l3 = new Libro  (3 , "Cien años de soledad" , 2021 );
        Revista r1 = new Revista ( 17 , "Top 10 mejores juegos actuales" , 2022 , 235 );
        Revista r2 = new Revista ( 25 , "People" , 2015 , 55 );
        Revista r3 = new Revista ( 200 , "La pandemia" , 2019 , 45 );

        l2 . prestar ();

        sistema _ fuera _ println ( l2 . toString ());

        Publicacion [] lista = { l1 , l2, l3 , r1 , r2, r3 };

        Biblioteca  b = nueva  Biblioteca ();

        sistema _ fuera _ println ( b . cuentaPrestados ( lista ));

        sistema _ fuera _ println ( b . publicacionesAnterioresA ( 1990 , lista ));


    }

 /*public static void main(String[] args) {
        ArrayList<Publicacion> lista = new ArrayList<>();
        Libro libro = new Libro(1,"Ojete",1988);
        lista.add(libro);
        lista.add(new Revista(2,"Los patos",2000,3));
        for(Publicacion p : lista) {
            System.out.println(p.toString()); }

        System.out.println(libro.prestado());
        libro.prestar();
        System.out.println(libro.prestado());
        libro.devolver();
        System.out.println(libro.prestado());
    }*/


}
