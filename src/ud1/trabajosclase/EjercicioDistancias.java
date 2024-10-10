package ud1.trabajosclase;

import java.util.Scanner;

public class EjercicioDistancias {
    public static void main(String[] args) {
        double distanciaMM, distanciaCM, distanciaM;
        
        Scanner sc = new Scanner(System.in);
        //Pedir e insertar distancia en milímetros
        System.out.println("Dime una distancia (en milímetros)");
        distanciaMM = sc.nextDouble();

        //Pedir e insertar distancia en centímetros
        System.out.println("Ahora dime otra en centímetros ");
        distanciaCM = sc.nextDouble();

        //Pedir e insertar distancia en metros
        System.out.println("Ahora dime otra en metros ");
        distanciaM = sc.nextDouble();

        sc.close();

        System.out.println("La suma de las tres distancias es: " + distanciaMM/10 + distanciaCM + distanciaM/100 + " centímetros");

    }
    
}
