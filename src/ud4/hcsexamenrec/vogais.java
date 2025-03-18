package ud4.hcsexamenrec;
// Hugo Chan Saball - DAM 1 - Examen de recuperación UD4 Programación
// 27/03/2025

import java.util.Scanner;

public class vogais {
    public static void main(String[] args) {
        String vocales = "aeiouáéíóúüAEIOUÁÉÍÓÚÜ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase;
        do {
            frase = sc.nextLine();
        } while (frase.isEmpty());

        char vocalRemplazo;
        System.out.println("Introduce por que vocal quieres reemplazar las vocales de la frase introducida: ");
        Scanner sc2 = new Scanner(System.in);

        vocalRemplazo = sc2.nextLine().charAt(0);


        String fraseCambiada = frase.replaceAll("[aeiouáéíóúüAEIOUÁÉÍÓÚÜ]", String.valueOf(vocalRemplazo));

        System.out.println(fraseCambiada);
    }


}
