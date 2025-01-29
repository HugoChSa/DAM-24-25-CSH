package ud4.apuntes;
/*E0614. Implementar el juego del anagrama, que consiste en que un jugador escribe una
palabra y la aplicación muestra un anagrama (cambio del orden de los caracteres)
generado al azar.
A continuación, otro jugador tiene que acertar cuál es el texto original. La aplicación no
debe permitir que el texto introducido por el jugador 1 sea la cadena vacía. Por ejemplo,
si el jugador 1 escribe “teclado”, la aplicación muestra como pista un anagrama al azar,
como por ejemplo: “etcloda”.*/

import java.util.Arrays;
import java.util.Scanner;

public class E0614 {
    public static void main(String[] args) {
    System.out.println("Introduce una palabra: ");
        String ContraseñaAnagrama;
        Scanner sc = new Scanner(System.in);
        String PalabraContraseña = sc.nextLine();


        for (int i = 0; i < 50; i++)
            System.out.println();


        private static boolean sonAnagrama(String PalabraContraseña, String ContraseñaAnagrama) {
            char[] t1 = PalabraContraseña.toLowerCase().toCharArray();
            char[] t2 = ContraseñaAnagrama.toLowerCase().toCharArray();

            Arrays.sort(t1);
            Arrays.sort(t2);

            return Arrays.equals(t1, t2);
        }

    }
}
