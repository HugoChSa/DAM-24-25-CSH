package ud3.ejerciciosclases;

import java.util.Scanner;

/*
E0706: Escribir un programa que lea por teclado una hora cualquiera y un número n que
representa una cantidad en segundos. El programa mostrará la hora introducida y las n
siguientes, que se diferencian en un segundo. Para ello hemos de diseñar previamente la
clase Hora que dispone de los atributos hora, minuto y segundo. Los valores de los
atributos se controlaran mediante métodos set/get. 
*/

public class E0706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una hora: (Horas, minutos y segundos)");
        Hora hora = new Hora();
        hora.setHora(sc.nextInt());
        hora.setMinuto(sc.nextInt());
        hora.setSegundo(sc.nextInt());

        hora.mostrar();
        // Hora hora = new Hora(hora, minuto, segundo);
        //System.out.println(hora.getHora() + ":" + hora.getMinuto() + ":" + hora.getSegundo());

        System.out.println("Numero de incrementos de 1 segundo (n): ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            hora.incrementar1Segundo();
            hora.mostrar();

        }

        sc.close();
    }
        
}
