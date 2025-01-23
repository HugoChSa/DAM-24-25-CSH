package ud4.apuntes;
/*ClaseCharacter. Crea un programa que lea un caracter de teclado y, utilizando los
métodos anteriores de la clase Character, imprima:
● Si es un dígito
● Si es una letra
● Si es un dígito o una letra
● etc.
● Si es mayúscula y en caso afirmativo mostrar la letra minúscula equivalente.
● Si es minúscula y en caso afirmativo mostrar la letra mayúscula equivalente. */

import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un caracter, y el programa lo analizará: ");
        String linea;
        do {
            linea = sc.nextLine();
        } while (linea.equals(""));
        char caracter = linea.charAt(0); 
        sc.close();

            System.out.println("Análisis del carácter: " + caracter);
            System.out.println("¿Es un dígito? " + Character.isDigit(caracter));
            System.out.println("¿Es una letra? " + Character.isLetter(caracter));
            System.out.println("¿Es un dígito o una letra? " + Character.isLetterOrDigit(caracter));
            System.out.println("¿Es un minúscula? " + Character.isLowerCase(caracter));
            if (Character.isLowerCase(caracter)) 
                System.out.println("- - En mayúsculas sería " + Character.toUpperCase((caracter)));
                System.out.println("¿Es mayúscula? " + Character.isUpperCase(caracter));
            if (Character.isUpperCase(caracter)) 
                System.out.println("- - En minúsculas sería " + Character.toLowerCase(caracter));
                System.out.println("- ¿Es un caracter de espacio \'\'? " + Character.isSpaceChar(caracter));
                System.out.println("- ¿Es un espacio en blanco? " + Character.isWhitespace(caracter));
            if (Character.getName(caracter) != null)
                System.out.println("Este caracter tiene como nombre: " + Character.getName(caracter)); 
    
            

}
}
