package ud2.ejemplos;

import java.util.*;
public class CondicionalSimple1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota");
        int nota = sc.nextInt();
        sc.close();

        if (nota >=5){
        System.out.println("Enhorabuena!");
        System.out.println("Has aprobado");
        }
        System.out.println("Hasta pronto!");

    }
}
