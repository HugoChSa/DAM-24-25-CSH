//Examen Hugo Chan Saball

package ud2.hcsexamen;


import java.util.Scanner;

public class duracionBombillas {
    int horasTotales, horasEncendida, numEncendidos;

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

}
