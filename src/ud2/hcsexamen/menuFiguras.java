//Examen Hugo Chan Saball

package ud2.hcsexamen;

import java.util.Scanner;

public class menuFiguras {
    public static void main(String[] args) {
        //int num1, num2;
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("0. SALIR");
        Scanner sc = new Scanner(System.in);
        int opcionUsuario = sc.nextInt();
      

        if (opcionUsuario == 1) {
            System.out.println("Se imprimirá un Triángulo, introduce dos números del 2 al 20 (Uno por uno)");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num1 > 20 || num1 < 2 || num2 > 20 || num2 < 2) {
                System.out.println("Error, uno de los números no es valido.");                
            } else {
                //(?)
            } 



        } if (opcionUsuario == 2) {
            System.out.println("Se imprimirá un rectángulo, introduce dos números del 2 al 20 (Uno por uno)");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num1 > 20 || num1 < 2 || num2 > 20 || num2 < 2) {
                System.out.println("Error, uno de los números no es valido.");                
            } else {
                //(?)
            }


        } if (opcionUsuario == 0) {
            System.out.println("Adiós!");
        } 
        
        if (opcionUsuario != 0 || opcionUsuario != 1 || opcionUsuario != 2) {
            System.out.println("Opción Inválida");
        } 

    
    
        sc.close();
    }
    
    
}
