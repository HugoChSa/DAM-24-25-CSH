//Examen Hugo Chan Saball

package ud2.hcsexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

//import java.util.Scanner;

public class duracionBombillas {

    //  Corrección:

    public static String causaFinBombilla(int horas, int encendidos, int horasPorEncendido) {
        
        if (horas <= 0 || encendidos <= 0 || horasPorEncendido <= 0 || horasPorEncendido > 10)
            return "ERROR";

        int horasMaxEstimadasUso = encendidos * horasPorEncendido;
        if (horasMaxEstimadasUso > horas) 
            return "HORAS";
        else if (horasMaxEstimadasUso < horas) 
            return "ENCENDIDOS";
        else 
            return "ENCENDIDOS + HORAS";
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
    
}

/*  int horasTotales, horasEncendida, numEncendidos;

    public static void main(String[] args) {

        //No supe como hacer que funcione ahí
        }
    
    
    public static void causaFinBombilla(int n){
    System.out.println("Introduce la cantidad de horas totales que se puede encender," +
    "el numero de veces que se puede encender y cuantas horas diarias se pasa la bombilla encendida (En ese orden)");
    Scanner sc = new Scanner(System.in);
    int horasTotales = sc.nextInt();
    int numEncendidos = sc.nextInt();
    int numhorasEncendida = sc.nextInt();
    sc.close();
    System.out.println("El motivo de fallo de la bombilla es:");
    if ((numEncendidos * numhorasEncendida) > horasTotales) {
        System.out.println("Horas");
    } if ((numEncendidos * numhorasEncendida) < horasTotales) {
        System.out.println("Encendidos");
    } if ((numEncendidos*numhorasEncendida) == horasTotales) {
        System.out.println("Horas y encendidos");
    }
    }

    */