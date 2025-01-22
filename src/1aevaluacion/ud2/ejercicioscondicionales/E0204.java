package ud2.ejercicioscondicionales;

/*Implementar un programa que pida por teclado un número decimal e indique si es un
número casi-cero que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1
unidad, aunque curiosamente el 0 no se considera un número casi-cero.  */
import java.util.*;

public class E0204 {
    public static void main(String[] args) {
        double numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        numero = sc.nextDouble();
        sc.close();

        if (numero == 0 ) {
            System.out.println("El número no es un casi-cero");
        }

        else if (numero >= -1) {
            System.out.println("El múmero es un casi-cero");
        }
        
        else if (numero <= 3) {
            System.out.println("El número es un casi-cero");
        }
    
        
        }
    }

