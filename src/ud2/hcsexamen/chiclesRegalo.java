//Examen Hugo Chan Saball

package ud2.hcsexamen;

import java.util.Scanner;

public class chiclesRegalo {
    int numChiclesComprados, numOfertaActual, numChiclesRegalo;

    public static void totalChicles(){
    System.out.println("Introduce el numero de chicles comprados inicialmente: ");
    Scanner sc = new Scanner(System.in);
    int numChiclesComprados = sc.nextInt();
    System.out.println("Ahora se debe introducir el numero de envoltorios necesarios con la oferta actual: ");
    int numOfertaActual = sc.nextInt();
    sc.close();
    System.out.println("Los chicles de regalo serán: " + (numChiclesComprados / numOfertaActual) + " chicles.");
    }

    public static void main(String[] args) {
        //No supe como hacer que funcione ahí
    }
}
