package ud4.ejerciciosud04entregas.ejercicios20250115;
/*Buscando letras
BuscandoLetras.java
La siguiente función (método de la clase String) permite convertir un String en un array de
caracteres (elementos de tipo char):
public char[] toCharArray()
Ejemplo de uso:
String cadena = "Hola Mundo";
char[] tablaChar = cadena.toCharArray();
Crea una función que reciba una cadena de caracteres y una letra como parámetros de
entrada y que devuelva un array con las posiciones en que aparece dicha letra en la
cadena. La numeración de posiciones comenzará en el 0, y si no se encuentra la letra la
función devolverá un array vacío. Utiliza el siguiente prototipo:
static int[] buscarLetra(String cadena, char letra)
Amplía el programa “Conceptos de programación” para solicitar repetidamente una letra por
teclado al usuario e indicar si existe o no en el término elegido al azar, cuantas veces
aparece y en que posiciones.
La clase Scanner de Java no dispone de un método nextChar() para leer caracteres. En su
lugar, para leer una letra de teclado puedes usar el método next() de la clase Scanner para
leer un String y acceder al carácter de la primera posición de la siguiente forma:
char letra = sc.next().charAt(0);
El bucle de entrada de letras terminará al introducir una letra que no se encuentre. */

import java.util.Arrays;
import java.util.Scanner;

public class BuscandoLetras {
/*    public static void main(String[] args) {
        
    }
    //public char[] toCharArray()
   */
  
   //Corrección:
    public static void main(String[] args) {

        String conceptos[] = { "Algoritmo",
                "Lenguaje de programación",
                "Entorno de desarrollo",
                "Compilación",
                "Ejecución",
                "Código fuente",
                "Bytecode",
                "Código objeto"
        };

        String fraseAleatoria = fraseAleatoria(conceptos);

        System.out.println(fraseAleatoria);

        Scanner sc = new Scanner(System.in);
        int[] posiciones;
        System.out.println("Escribe letras para comprobar su posición en la frase aleatoria:");
        do {
            char letra = sc.next().charAt(0);
            posiciones = buscarLetra(fraseAleatoria, letra);
            System.out.println("Se encuentra en las posiciones: " + Arrays.toString(posiciones));
        } while (posiciones.length != 0);

        System.out.println("La última letra no aparecía en la frase. FIN.");
    }

    static int[] buscarLetra(String cadena, char letra) {
        char[] t = cadena.toCharArray();

        int[] posiciones = new int[0];

        for (int i = 0; i < t.length; i++) {
            if (t[i] == letra) {
                posiciones = Arrays.copyOf(posiciones, posiciones.length + 1);
                posiciones[posiciones.length - 1] = i;
            }
        }

        return posiciones;
    }

    static String fraseAleatoria(String[] t) {
        return (t[(int) (Math.random() * t.length)]);
    }
}
