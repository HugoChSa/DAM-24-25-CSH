package ud4.hcsexamenrec;
// Hugo Chan Saball - DAM 1 - Examen de recuperación UD4 Programación
// 27/03/2025

import java.util.Scanner;

public class sumas {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce una serie de números : ");
    int n = sc.nextInt();



    int[] numeros = new int[n];
    System.out.println("Escribe " + n + " números enteros");
    leerNumeros(numeros);



        System.out.println("La suma de los números es: " + sumas(numeros));

       //System.out.println("La suma de los números pares es: " + sumasPares(numeros));

       // System.out.println(STR."La suma de los números impares es: \{sumasImpares(numeros)}");
    }




    public static int sumas(int[] t) {
        int suma = 0;
        for (int i : t) {
            suma += i;
        }
        return suma;
    }

    //Estos 2 no me daban el resultado

    public static int sumasPares(int[] t) {
        int sumaPar = 0;
        for (int i : t) {
            while (t[i] % 2 == 0);
            sumaPar += t[i];

        }
        return sumaPar;
    }

    public static int sumasImpares(int[] t) {
        int sumaImpar = 0;
        for (int i : t) {
            while (t[i] % 2 != 0);
            sumaImpar += t[i];

        } return sumaImpar;
    }

    private static void leerNumeros(int[] t) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }



    }
}
