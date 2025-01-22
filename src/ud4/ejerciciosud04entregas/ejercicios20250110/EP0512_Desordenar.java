package ud4.ejerciciosud04entregas.ejercicios20250110;

import java.util.Arrays;
import java.util.Random;

//No me dio tiempo a mucho por que hubo que configurar lo de java, además de que lo llevaba mal preparado


/*Escribe la función void desordenar(int t[]), que cambia de forma
aleatoria los elementos contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo. */
public class EP0512_Desordenar {
    
    /*
    public static void main(String[] args) {
        


        
        long[] enteros = {1, 2, 3, 4, 5};
        double[] reales = new double[5];
        boolean[] logicos = new boolean[5];
        Boolean[] logicosEnvolvente = new Boolean[5];

        System.out.println(enteros);
        System.out.println(reales);
        System.out.println(logicos);
        System.out.println(logicosEnvolvente);

        System.out.println("Fin Programa"); 

    }
    */

    //Corrección:
    static void desordenar(int t[]) {
        Random rnd = new Random();
        for (int i = 0; i < t.length; i++) {
            int nuevaPosicion = rnd.nextInt(t.length);
            if (i != nuevaPosicion) {
                int aux = t[i];
                t[i] = t[nuevaPosicion];
                t[nuevaPosicion] = aux;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = arrayAleatorio(6, 1, 10);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        desordenar(array);
        System.out.println(Arrays.toString(array));
    }


    public static int[] arrayAleatorio(int n, int rndIncio, int rndFin) {
        int[] t = new int[n];
        Random rnd = new Random();
        System.out.println(rnd.nextInt(21));
        for (int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(rndFin - rndIncio + 1) + rndIncio;
        }

        return t;
    }

}
