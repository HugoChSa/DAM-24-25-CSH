package ud4.ejerciciosud04entregas.ejercicios20250205;

import org.junit.Test;

import java.util.Scanner;
import java.util.Arrays;

public class MontanaRusa {
    public static void main(String[] args) {
        int[] alturas = new int[0];

        final int maxAlturas = 5;
        System.out.println("Introduzca las alturas:");
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();

        while (altura >=0 && alturas.length < maxAlturas) {
            alturas = Arrays.copyOf(alturas, alturas.length + 1);
            alturas[alturas.length - 1] = altura;
            altura = sc.nextInt();
        }

        //?

        /*@Test
        void testContarPicos_CasoBase() {
            int[] alturas = { 1, 2, 3, 2, 1 };
            assertEquals(1, contarPicos(alturas));
        }
        @Test
        void testContarPicos_MultiplesPicos() {
            int[] alturas = { 1, 2, 3, 2, 1, 0, 1, 2, 3, 2, 1 };
            assertEquals(2, contarPicos(alturas));
        }
        @Test
        void testContarPicos_PicoAlFinal() {
            int[] alturas = { 1, 2, 3, 4, 5 };
            assertEquals(1, contarPicos(alturas));
        }
        @Test
        void testContarPicos_PicoEnInicio() {
            int[] alturas = { 5, 4, 3, 2, 3, 4, 4 };
            assertEquals(1, contarPicos(alturas));
        }
        @Test
        void testContarPicos_MontañaCircularSinPicos() {
            int[] alturas = { 3, 2, 1, 2, 3 };
            assertEquals(0, contarPicos(alturas));
        }
        @Test
        void testContarPicos_MontañaCircularConVariosPicos() {
            int[] alturas = { 3, 2, 1, 2, 1, 2, 1, 2, 3 };
            assertEquals(2, contarPicos(alturas));



        /*if (alturas.length < maxAlturas && altura++ < altura && altura-- > altura) {
            pico++;
        }*/

        //System.out.println(altura + " => " + pico + " picos");


        /*Scanner sc = new Scanner(System.in);
        final int maxalturas = 5;
        int[] picos = new int[0];

        System.out.println("Introduzca la altura de las medidas de la montaña rusa");
        int altura;
        do {
            altura =sc.nextInt();
        }while (altura != maxalturas);
*/

    }
}
