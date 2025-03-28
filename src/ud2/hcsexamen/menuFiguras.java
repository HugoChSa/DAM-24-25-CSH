//Examen Hugo Chan Saball

package ud2.hcsexamen;

import java.util.Scanner;

public class menuFiguras {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    int errores = 0;
    final int MAX_ERRORES = 3;

    do {
        mostrarMenu();
        opcion = leer(sc);            
        switch (opcion) {
            case 1:
                System.out.println(dibujarTriangulo(sc));
                break;
            case 2:
                System.out.println(dibujarRectangulo(sc));
                break;
            case 0:
                System.out.println("Saliendo del programa");
                break;
            default:
                errores++;
                System.out.println("Opción inválida, errores: " + errores + "/3");
                if (errores == MAX_ERRORES) {
                    System.out.println("Número de errores excedido, saliendo del programa");
                    break;
                }
        }
    } while (opcion != 0 && errores < MAX_ERRORES);
}

public static void mostrarMenu() {
    System.out.println("1. Triángulo");
    System.out.println("2. Rectángulo");
    System.out.println("0. SALIR");
}

public static int leer(Scanner sc) {
    if (sc.hasNextInt()) {
        return sc.nextInt();
    } else
        sc.next();
    return -1;
}

public static boolean dibujarTriangulo(Scanner sc) {
    System.out.println("Introduce el número de niveles (2-20)");
    int niveles = leer(sc);
    if (niveles < 2 || niveles > 20) {
        System.out.println("El número de niveles es incorrecto");
        return false;
    }
    for (int i = 1; i <= niveles; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    return true;
}

public static boolean dibujarRectangulo(Scanner sc) {
    System.out.println("Introduce el número de filas (2-20)");
    int filas = leer(sc);
    if (filas < 2 || filas > 20) {
        System.out.println("El número de filas es incorrecto");
        return false;
    }
    System.out.println("Introduce el número de columnas (2-20)");
    int columnas = leer(sc);
    if (columnas < 2 || columnas > 20) {
        System.out.println("El número de columnas es incorrecto");
        return false;
    }
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
    return true;

}
}

/*public class menuFiguras {
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
*/