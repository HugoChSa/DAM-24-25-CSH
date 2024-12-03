//Examen Hugo Chan Saball

package ud2.hcsexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

//import java.util.Scanner;

public class chiclesRegalo {

    //  Corrección:
    public static int totalChicles(int chiclesComprados, int envoltorios, int chiclesRegalo) {
        int totalChicles = -1;



        return totalChicles;
    }

    @Test
    public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1 ));
        assertEquals(111, totalChicles(100, 10, 1));        
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
    }



}
/*
    int numChiclesComprados, numOfertaActual, numChiclesRegalo;

    public static void totalChicles() {
        System.out.println("Introduce el numero de chicles comprados inicialmente: ");
        
        Scanner sc = new Scanner(System.in);
        int numChiclesComprados = sc.nextInt();
        System.out.println("Ahora se debe introducir el numero de envoltorios necesarios con la oferta actual: ");
        int numOfertaActual = sc.nextInt();
        sc.close();
        System.out.println("Los chicles de regalo serán: " + (numChiclesComprados / numOfertaActual) + " chicles."); 

    }


    public static void main(String[] args) {
        // No supe como hacer que funcione ahí
    }


    @Test
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(0, 10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }
*/