package ud5.bingo;

/*
Realiza un programa que simule un Bingo.
El bombo contendrá números entre 1 y 99.
Podrán jugar un número indeterminado de jugadores.
Cada jugador, se identificará por su nombre, que no se podrá repetir, y podrá jugar hasta 5 cartones.
Cada cartón, en su versión simplificada, está compuesto por 3 filas por 5 columnas de números aleatorios no repetidos.

Al inicio del programa se solicitará al usuario el número de jugadores. Para cada uno se solicitará el nombre y el número de cartones que jugará, que se mostrarán a continuación.

Una vez creados los jugadores y los cartones comenzará el juego del bingo y el programa podrá seguir ejecutándose de una de las dos maneras siguientes:
Turno a turno:
El programa saca un bola aleatoria, no repetida
Se revisan los cartones de los jugadores
Se canta línea o bingo si es necesario.
Se muestra una clasificación de los jugadores por el número de aciertos que tengan el sus cartones.
Se espera la pulsación de una tecla para continuar con el siguiente turno hasta que algún jugador obtenga bingo.
Automático:
El programa saca números sucesivamente sin interrupción del usuario. Informa del primer jugador en obtener Línea y termina cuando se obtiene Bingo.


Implementa todo en un único fichero de nombre Bingo.java
Considera usar clases internas.
*/

import java.util.Random;
import java.util.Scanner;

public class Bingo {
   static final int MAX_NUM = 99;
    static Jugador[] jugadores;


    public static void main(String[] args) {
        System.out.println("\nBINGO");
        System.out.println("-----\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de jugadores: ");
        int numJugadores = sc.nextInt();
        jugadores = new Jugador[numJugadores];

        System.out.printf("\n Introduce los datos de los jugadores: ");

        for (int i = 1; i < numJugadores; i++) {
            System.out.println("Nombre del jugador " + i + ": ");
            String nombre = sc.next();
            System.out.println("Numero de cartones: ");
            int numCartones = sc.nextInt();
            System.out.println();

            Jugador j = new Jugador(nombre, numCartones);
            jugadores[i-1] = new Jugador(nombre, numCartones);
            
            Jugador jugador = new Jugador(nombre, numCartones);
            jugadores[i-1] = jugador;
            System.out.println(jugador);
        }

        //Empieza el juego, 2 modalidades
        System.out.println("Comienza el juego");
        System.out.println("-----------------");
        System.out.println("Seleccione una modalidad: (N - Número a número)  (A - Automática");
        int opcion = sc.nextLine().toUpperCase().charAt(0);
        switch (opcion) {
            case 'N': 
                modoNumeroANumero(); 
                break;
            
            case 'A': 
                modoAutomatico(); 
                break;
                
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }

    private static void modoNumeroANumero() {
    }

    private static void modoAutomatico() {
        
    }
}

class  Jugador {
    String nombre;
    Carton[] cartones;

    public Jugador(String nombre, int numCartones) {
        this.nombre = nombre;
        //Instanciar cartones
        cartones = new Carton[numCartones];
    }
    @Override
    public String toString() {
        return "Jugador: " + nombre + " (" + cartones.length + " cartones)";
    }

}


class Carton {
    static final int MAX_FILAS = 3;
    static final int MAX_COLUMNAS = 5;

    int [][] numeros;

    public Carton() {
        this.numeros = new int[3][5];
        //Rellenar con Nº distintos

        for (int i = 0; i < MAX_FILAS; i++) {
            for (int j = 0; j < MAX_COLUMNAS; j++) {
                //Generar Nº aleatorio
                Random rnd = new Random();
                //TODO COMPROBAR QUE EL Nº NO SE REPITE
                numeros[i][j] = rnd.nextInt(Bingo.MAX_NUM) + 1;
            }
        }


    }
}
