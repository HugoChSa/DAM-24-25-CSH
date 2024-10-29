package ud2.ejercicios;

import java.util.Scanner;

/* Diseñar un programa que muestre, para cada número introducido por teclado, si
es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número
introducido sea 0. */

public class E0301 {
    public static void main(String[] args) {
       int num;

       Scanner sc = new Scanner(System.in);

      
       do { System.out.println("Introduce un número: ");
       num = sc.nextInt();
        sc.close();
       }
       while (num > 0 || num < 0);{
        System.out.println(num%2 == 0 ? "El número es par" : "El número es impar");
        System.out.println("Su cuadrado es: " + num*num);
       }
    
      

    }
}
