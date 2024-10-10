package Identificadores;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        double baseTriangulo, alturaTriangulo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Medida de la base del triángulo: ");
        baseTriangulo = sc.nextDouble();

        System.out.println("Medida de la altura del triángulo: ");
        alturaTriangulo = sc.nextInt();
        sc.close();

        double area = (baseTriangulo * alturaTriangulo) / 2.0;
        
        System.out.println(area);


    }
}
