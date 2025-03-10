package ud4.apuntes;
/*E0614. Implementar el juego del anagrama, que consiste en que un jugador escribe una
palabra y la aplicación muestra un anagrama (cambio del orden de los caracteres)
generado al azar.
A continuación, otro jugador tiene que acertar cuál es el texto original. La aplicación no
debe permitir que el texto introducido por el jugador 1 sea la cadena vacía. Por ejemplo,
si el jugador 1 escribe “teclado”, la aplicación muestra como pista un anagrama al azar,
como por ejemplo: “etcloda”.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("unused")
public class E0614 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        System.out.println("Introduce una palabra: ");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        do {
            palabra = sc.nextLine();
        } while (palabra.isEmpty());
        char[] letras = palabra.toCharArray();
        for (int i = 0; i < letras.length; i++){
            Random rnd = new Random();
            int nuevaPosicion = rnd.nextInt(letras.length);
            char letra = letras[nuevaPosicion];
            letras[nuevaPosicion] = letras[i];
            letras[i] = letra;
        }

        String anagrama = String.valueOf(letras);
        System.out.println("Anagrama: " + anagrama);

        final int MAX_INTENTOS = 3;
        int intentos = 0;
        String palabraJ2;
        do {
            System.out.println("Ahora el segundo jugador debe acertar la palabra: ");
            palabraJ2 = sc.nextLine();
            intentos++;
        } while (palabraJ2.equals(palabra) && intentos <= MAX_INTENTOS);

        if (palabraJ2.equalsIgnoreCase(palabra)) {
            System.out.println("Enhorabuena has acertado en " + intentos + " intentos");
        } else {
            System.out.println("No has acertado. Has fallado los " + intentos + " intentos");

        }

    }

    }

