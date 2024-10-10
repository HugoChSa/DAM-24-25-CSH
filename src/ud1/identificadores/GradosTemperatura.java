package Identificadores;

import java.util.Scanner;

public class GradosTemperatura {
    public static void main(String[] args) {
        double fahrenheit;

        Scanner sc = new Scanner(System.in);
        System.out.println("Temperatura en grados fahrenheit: ");
        fahrenheit = sc.nextDouble();
        sc.close();

        double temperaturaCentigrados = (5.000 / 9.000) * (fahrenheit - 32.000);
        System.out.println("La temperatúra en grados centígrados es " + temperaturaCentigrados);


    }
}
