package ud2.ejercicios;

import java.util.Scanner;
import java.time.*;

/*E0213. Escribir un programa que pida una hora de la siguiente forma: hora, minutos y
segundos. El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
hora actual (10:41:59) => hora actual + 1 segundo (10:42:00) */

public class E0213 {
    public static void main(String[] args) {
        int hora;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora: (En formato PM)");
        hora = sc.nextInt();
    
        int minut;
        System.out.println("Introduce los minutos: ");
        minut = sc.nextInt();
    
        int seg;
        System.out.println("Introduce los segundos: ");
        seg = sc.nextInt();

        /* 
        switch (hora) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24:
                System.err.println("Son las " + hora + " horas,");
                break;
        
            default: System.out.println("Hora no valida");
                break;
        }
        */
        
        System.out.println("Son las " + hora + "horas, " + minut + " minutos y " + (seg + 1) + " segundos.");
        
        }
    }
    

