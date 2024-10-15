package ud1.trabajosclase.csh20241004;

import java.util.Scanner;
public class EP0122 {
    public static void main(String[] args) {
        double farenheit;

        Scanner sc = new Scanner(System.in);
        System.out.println("Temperatura en grados farenheit: ");
        farenheit = sc.nextDouble();
        sc.close();

        Double temperaturaCentígrados = (5.000 / 9.000) * (farenheit - 32.000);
        System.out.println("La temperatura en grados centígrados es: " + temperaturaCentígrados);

    }
    
}
