package ud4.ejerciciosud04entregas.ejercicios20250130;

//(?)

import java.util.Scanner;

public class Matriculas {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        System.out.println("Ingrese la matricula: ");
        Scanner sc = new Scanner(System.in);
        String matricula = sc.nextLine();
        char[] letrasMatricula = matricula.toCharArray();
        sc.close();
        do {
            if (matricula.length() == 7) {
                boolean esMatriculaValida = true;
                System.out.println("Matrícula: " + matricula);
                System.out.println("Es valida? " + esMatriculaValida);
            } else {
                boolean esMatriculaValida = false;
                System.out.println("Matricula: " + matricula);
                System.out.println("Es valida? " + esMatriculaValida);
            }

        } while (matricula.length() == 7);



        //Character.isDigit(matricula.charAt(4));

       /* System.out.println("Ingrese el numero de matricula: ");
        numMatricula = entrada.nextDouble();
        System.out.println("Ingrese las letras de la matricula: ");
        letrasMatricula = entrada.next().charAt(0);*/

        /*boolean esMatriculaValida(String matricula);
        if (matricula.equals()) {}
        System.out.println("Matrícula: " + matricula);
        System.out.println("Es una matrícula valida?: " + esMatriculaValida);*/
    }
}
