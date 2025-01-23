package ud4.ejercicios;
/*E0603. Diseñar el juego de “Acierta la contraseña”, que funciona así: un primer jugador
introduce una contraseña. A continuación, un segundo jugador debe teclear palabras
hasta que acierte. */

import java.util.Scanner;

public class E0603 {
    public static void main(String[] args) {
        int maxIntentos = 3;
        int intentos= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca contraseña: ");
        String contraseña = sc.nextLine();

        for (int i = 0; i < 50; i++)
            System.out.println();

        String intentoAciertoContraseña;
        System.out.println("¿Cual es la contraseña? ");
        do {
            intentoAciertoContraseña = sc.nextLine();
            intentos++;
         } while (!contraseña.equals(intentoAciertoContraseña) && intentos < maxIntentos);
        if (contraseña.equals(intentoAciertoContraseña)) {
            System.out.println("La contraseña es correcta :)");
        } else System.out.println("Contraseña incorrecta :(");
                
        sc.close(); 
    }    
}
