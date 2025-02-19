package ud5.clasesejercicios.E0711;

import java.util.Scanner;

public class listas {
    public listas() {
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer numeros;
    int TamañoTabla =0;
    int numeroElementosInsertados = 0;
    System.out.println("Ingrese los números de la lista: (Para terminar inserte un número negativo)");
    do {
        numeros = sc.nextInt();
        TamañoTabla++;
        numeroElementosInsertados++;
    } while (numeros >= 0);
        System.out.println("La tabla resultante es: " + numeros);
        System.out.println("El tamaño de la tabla es de: " + TamañoTabla + " números.");
        System.out.println("El numero de elementos de la lista es: " + numeroElementosInsertados);
        sc.close();

    }

    public class buscarElemento {
        boolean encontrado = false;

    }
}
