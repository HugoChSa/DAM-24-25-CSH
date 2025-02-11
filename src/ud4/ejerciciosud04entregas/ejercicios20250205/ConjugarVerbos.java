package ud4.ejerciciosud04entregas.ejercicios20250205;

import java.util.Scanner;

public class ConjugarVerbos {
    public static void main(String[] args) {
        System.out.println("Introduce un verbo y el programa lo conjugará:");
        Scanner sc = new Scanner(System.in);
        String verbo = sc.nextLine();

        sc.close();

        String conjugacionAR = "ar";
        String conjugacionER = "er";
        String conjugacionIR = "er";


        //String[] conjugarPresente(String verbo);
        if (verbo.endsWith(conjugacionAR) || verbo.endsWith(conjugacionER) || verbo.endsWith(conjugacionIR)) {

            System.out.println("Yo " + verbo.substring(0, verbo.length() - conjugacionAR.length()).strip() + "o");
            System.out.println("Tú " + verbo.substring(0, verbo.length() - conjugacionAR.length()).strip() + "as");
            System.out.println("El/Ella/Usted " + verbo.substring(0, verbo.length() - conjugacionAR.length()).strip() + "a");
            System.out.println("Nosotros/Nosotras " + verbo.substring(0, verbo.length() - conjugacionAR.length()).strip() + "amos");
            System.out.println("Vosotros/Vosotras " + verbo.substring(0, verbo.length() - conjugacionAR.length()).strip() + "áis");
            System.out.println("Ellos/Ellas/Ustedes " + verbo.substring(0, verbo.length() - conjugacionAR.length()).strip() + "an");

        }
        if (verbo.endsWith(conjugacionER)) {

            System.out.println("Yo " + verbo.substring(0, verbo.length() - conjugacionER.length()).strip() + "o");
            System.out.println("Tú " + verbo.substring(0, verbo.length() - conjugacionER.length()).strip() + "es");
            System.out.println("El/Ella/Usted " + verbo.substring(0, verbo.length() - conjugacionER.length()).strip() + "e");
            System.out.println("Nosotros/Nosotras " + verbo.substring(0, verbo.length() - conjugacionER.length()).strip() + "emos");
            System.out.println("Vosotros/Vosotras " + verbo.substring(0, verbo.length() - conjugacionER.length()).strip() + "éis");
            System.out.println("Ellos/Ellas/Ustedes " + verbo.substring(0, verbo.length() - conjugacionER.length()).strip() + "en");

        }
        if (verbo.endsWith(conjugacionIR)) {
            ;
            System.out.println("Yo " + verbo.substring(0, verbo.length() - conjugacionIR.length()).strip() + "o");
            System.out.println("Tú " + verbo.substring(0, verbo.length() - conjugacionIR.length()).strip() + "es");
            System.out.println("El/Ella/Usted " + verbo.substring(0, verbo.length() - conjugacionIR.length()).strip() + "e");
            System.out.println("Nosotros/Nosotras " + verbo.substring(0, verbo.length() - conjugacionIR.length()).strip() + "imos");
            System.out.println("Vosotros/Vosotras " + verbo.substring(0, verbo.length() - conjugacionIR.length()).strip() + "ís");
            System.out.println("Ellos/Ellas/Ustedes " + verbo.substring(0, verbo.length() - conjugacionIR.length()).strip() + "en");

        }
    }}
