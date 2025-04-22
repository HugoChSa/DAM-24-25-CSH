package ud6;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class E1210 {
    public static void main(String[] args) {
        Random rd = new Random();

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(rd.nextInt(0, 10));
        }

        Set<Integer> sinRepetidos = new TreeSet<>();
        for (int i = 0; i < lista.size(); i++) {
            sinRepetidos.add(lista.get(i));
        }

        Set<Integer> elementosRepetidas = new TreeSet<>();
        for (Integer numero : lista) {
            if (lista.indexOf(numero) != lista.lastIndexOf(numero)) {
                elementosRepetidas.add(numero);
            }
        }

        Set<Integer> elementosSinRepetir = new TreeSet<>();
        for (Integer numero : lista) {
            if (lista.indexOf(numero) == lista.lastIndexOf(numero)) {
                elementosSinRepetir.add(numero);
            }
        }

        System.out.println("Lista:");
        System.out.println(lista);

        System.out.println("\nSin repetidos:");
        System.out.println(sinRepetidos);

        System.out.println("\nElementos repetidos de la lista:");
        System.out.println(elementosRepetidas);

        System.out.println("\nElementos sin repetir de la lista:");
        System.out.println(elementosSinRepetir);
    }


}
