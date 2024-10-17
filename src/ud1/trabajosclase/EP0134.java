package ud1.trabajosclase;

/*Escribe un programa que permita convertir unidades de energía entre julios (J), calorías
(cal) y kilovatios-hora (kWh). El usuario deberá ingresar la cantidad de energía, así como la
unidad de origen y destino */
import java.util.Scanner;

public class EP0134 {
    public static void main(String[] args) {
    double cantidadOrigen, cantidadDestino;
    char udmedidaOrigen, udmedidaDestino;
    int JUL ;
    int kWh ;
    int CAL ;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la unidad a convertir: ");
    cantidadOrigen = sc.nextDouble(); sc.nextLine();
    System.out.println("Indica si la unidad original son Julios (J), Calorías (C) o Kilovatios-Hora(W):");
    udmedidaOrigen = sc.nextLine().charAt(0);
    System.out.println("Ahora indica a que se transformará:");
    udmedidaDestino = sc.nextLine().charAt(0);

    sc.close();
            

    }
    



    
}
