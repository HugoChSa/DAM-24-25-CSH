package ud1.identificadores;

import java.util.Scanner;

/**
 * Este programa solicita al usuario el importe en euros que desea invertir
 * el número de años que durará la inversión y, usando la fórmula del interés
 * compuesto y para un valor fijo de interés (5 %) a pagar una vez al año,
 * calcula el importe ifnal que tendrá el usuario.
 */

public class InteresCompuesto {
    public static void main(String[] args) {
        //Declaración de constantes y variables
        double importeInicial, importeFinal;
        int anhos;
        
        final double INTERES = 0.05;
        final double NUM_PAGOS = 1;

        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Importe a invertir (euros): ");
        importeInicial = sc.nextDouble();

        System.out.println("Duración de la inversión (años): ");
        anhos = sc.nextInt();
        sc.close();
        
        // Proceso
        double base = 1 + INTERES / NUM_PAGOS;
        double exponente = NUM_PAGOS * anhos;
        importeFinal = importeInicial * Math.pow(base, exponente);
        
        // Salida
        System.out.println("El importe final tras " + anhos + " de inversión es de " + importeFinal + " euros");


    }    
}
