package ud6.hcsexamenrec.genericos;
//Hugo Chan Saball - UD06 - Examen Práctico - Recuperación

import java.util.*;
//?

public class UtilGenerico {
    //1 - Contar Coincidencias


    public static void contarCoincidencias() {
        System.out.println("Se van a crear 2 colecciones.");

        Random rand = new Random();
        Collection<Integer> coleccion1 = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                coleccion1.add(rand.nextInt(0, 10));
            }

            Collection<Integer> coleccion2 = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                coleccion2.add(rand.nextInt(0, 10));
            }

            System.out.println("La primera colección es: "+ coleccion1);
            System.out.println("La segunda colección es: " + coleccion2);

        Set<Integer> numeroElementosNoRepetidos = new HashSet<>();
        numeroElementosNoRepetidos.addAll(coleccion1);
        numeroElementosNoRepetidos.addAll(coleccion2);


        System.out.println("El número de elementos únicos es: " + numeroElementosNoRepetidos);


    }



}

