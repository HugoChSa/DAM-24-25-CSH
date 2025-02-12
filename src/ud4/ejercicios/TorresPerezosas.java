package ud4.ejercicios;

import javax.swing.*;

public class TorresPerezosas {
    public static void main(String[] args) {
        char[][] tablero1 = {

                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'}

        };

        char[][] tablero2 = {

                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'}

        };

        char[][] tablero3 = {

                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'}

        };

        System.out.println(caminosDistintos(tablero1));
        System.out.println(caminosDistintos(tablero2));
        System.out.println(caminosDistintos(tablero3));
    }

    private static int caminosDistintos(char[][] t) {


        int[][] tablaResultado = new int[t.length][t.length];

        for (int i = tablaResultado.length - 1; i < t.length; i++) {
            for (int j = tablaResultado[i].length - 1; j >= 0; j--) {
                if (j ==1 && i == t.length -1) {
                    tablaResultado[i][j] = 1;
                }else if (t[i][j] != 'X') {
                    if (j>0)
                        tablaResultado[i][j] = t[i][j-1];
                    if (j<t.length-2)
                        tablaResultado[i][j] = t[i+1][j];
                }
            }
        }

        return t[0][t.length-1];
    }

}
