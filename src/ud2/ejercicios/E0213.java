package ud2.ejercicios;

import java.util.Scanner;


/*E0213. Escribir un programa que pida una hora de la siguiente forma: hora, minutos y
segundos. El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
hora actual (10:41:59) => hora actual + 1 segundo (10:42:00) */

public class E0213 {
    public static void main(String[] args) {
        byte horas;
        byte minutos;
        byte segundos;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora: (0-23)");
        horas = sc.nextByte();
    
        
        System.out.println("Introduce los minutos: ");
        minutos = sc.nextByte();
    
        
        System.out.println("Introduce los segundos: ");
        segundos = sc.nextByte();
        
        sc.close();
        
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
       /*  String textoHora = String.format("La hora más 1 segundo es %02d:%02d:%02d%n" + horas + minutos + segundos);
        System.out.println(textoHora);  */

        }
    
    }