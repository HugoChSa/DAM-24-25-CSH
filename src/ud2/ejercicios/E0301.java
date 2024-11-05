package ud2.ejercicios;

import java.util.Scanner;

/* Diseñar un programa que muestre, para cada número introducido por teclado, si
es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número
introducido sea 0. */

public class E0301 {
    public static void main(String[] args) {
       int num;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    num = sc.nextInt();
    sc.close();
      
    while (num != 0);{
        if(num % 2 == 0)
        System.out.println("Es par");
        if (num > 0) 
        System.out.println("Es positivo");
        System.out.println("El cuadrado es " + Math.pow(num, num));            


        System.out.println("Introduce un número: ");
        num = sc.nextInt();
       }
    
      

    }
}
