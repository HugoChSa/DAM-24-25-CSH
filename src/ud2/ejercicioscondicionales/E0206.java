package ud2.ejercicioscondicionales;

import java.util.Scanner;

/*
Pedir tres números y mostrarlos ordenados de mayor a menor.
Posibles entradas:
1 2 3
1 3 2
2 3 1
2 1 3
3 1 2
3 2 1
*/

public class E0206 {
    public static void main(String[] args) {
        int numUno;
        int numDos;
        //int numTres;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        numUno = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        numDos = sc.nextInt();
        System.out.println("Introduce el tercer número: ");
        //numTres = sc.nextInt();
        sc.close();

        System.out.println("Ahora el programa mostrara los numeros ordenados de mayor a menor: ");

        if (numUno >= numDos) {
            
        }
    
        /*  if (numUno >= numDos) {
            if (numDos>=numTres) {
                System.out.println(numUno + " es mayor de todos, mientras que " + numDos + " es mayor que " + numTres);
            } 
        }
        System.err.println();
        */

    }
    
}
