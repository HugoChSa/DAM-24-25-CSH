/*Hugo Chan Saball - Examen UD6 Programación*/

package ud6.hcsexamen.genericos;

import java.util.*;

public class UtilGenerico {

    public static void main(String[] args) {
        repetidos();


        filtrarMayores();

    }

    public static void repetidos() {

        Random rand = new Random();
        List<Integer> lista1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista1.add(rand.nextInt(0, 10));
        }
        System.out.println("Esta es la lista con números repetidos: " + lista1);

        Set<Integer> sinRepetidos = new LinkedHashSet<>();
        sinRepetidos.addAll(lista1);

        Set<Integer> elementosRepetidos = new TreeSet<>();
        for (Integer numero : lista1) {
            if (lista1.indexOf(numero) != lista1.lastIndexOf(numero)) { // 2 3 4 8
                elementosRepetidos.add(numero);
            }
        }
        Set<Integer> elementosSinRepetir = new TreeSet<>();
        elementosSinRepetir.addAll(sinRepetidos);
        elementosSinRepetir.removeAll(elementosRepetidos);

        System.out.println("Esta es la lista sin los números repetidos: " + elementosSinRepetir);

    }

    public static void filtrarMayores() {
        Random rand = new Random();
        Collection<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista2.add(rand.nextInt(0, 10));
        }

        System.out.println("Esta es la lista 2: " + lista2);
        Integer[] t = lista2.toArray(new Integer[0]);

        Arrays.sort(t);

        Comparator<Integer> MayorAMenor = Comparator.reverseOrder();

        Arrays.sort(t, MayorAMenor);

        //Collection<Integer> MayorMenor = Arrays.asList(t);

        System.out.println("Esta es la lista 2 ordenada de Mayor a Menor" + MayorAMenor);


    }

}
