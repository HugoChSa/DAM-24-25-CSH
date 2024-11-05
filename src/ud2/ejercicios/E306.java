package ud2.ejercicios;

/*Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará
todos los números del 1 al n. */
import java.util.Scanner;

public class E306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroN;
        int contador = 1;
        
        System.out.println("Introduce un numero");
        numeroN = sc.nextInt();
        sc.close();
        
        System.out.println("Los numeros anteriores a " + numeroN + " son: ");
        while (contador < numeroN) {
            System.err.println(contador);
            contador++;
            
        }
        
    }
}
