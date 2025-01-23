package ud4.ejercicios;

import java.util.Scanner;

/*E0602. Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la
que contiene menos caracteres */
public class E0602 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera frase");
        String cad1 = sc.nextLine();

        System.out.println("Introduzca la segunda frase");
        String cad2 = sc.nextLine();
        sc.close();
        
        if (cad1.length() > cad2.length()) {
            System.out.println(cad2 + " es la frase con menos caracteres.");
        } if (cad1.length() < cad2.length()) {
            System.out.println(cad1 + " es la frase con menos caracteres.");
        } if (cad1.length() == cad2.length()) {
            System.out.println(cad1 + " y " + cad2 + " tienen el mismo número de caracteres.");
        }
    }
}
