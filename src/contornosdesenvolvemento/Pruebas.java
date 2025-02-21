package contornosdesenvolvemento;

import java.util.Scanner;

public class Pruebas {
    @SuppressWarnings("resource")
    static void contarParesImpares() {
        int contPares = 0;
        int contImpares = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 números: ");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                contPares++;
            }else {
                contImpares++;
            }
        }

        System.out.printf("Pares: %d\nImpares: %d ", contPares, contImpares);
    }

}
