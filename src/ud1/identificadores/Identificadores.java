package ud1.identificadores;

public class Identificadores {
    public static void main(String[] args) {

        final int NUMERO_ALUMNOS = 33;


        String numeroDeTelefono = "666666666";
        double totalVentas = 576.55;
        byte edad;
        edad = -0x10;
        float monedero = 3.4E38f - 567.34f; 
        edad = (byte) (edad + 1);
        long numEnorme = 9223372036854775807L;

        boolean estaLloviendo;

        String miNombre = "Óscar";

        char letraPreferida = 'A';
        /* A continuación pongo las sentenciass de impresion por consola
         * muchos println
         */

        
        System.out.print("Número de Teléfono: ");
        System.out.println(numeroDeTelefono);

        System.out.println("Total ventas: " + totalVentas);

        System.out.println("Me llamo " + miNombre);

        estaLloviendo = false;
        System.out.println("Está lloviendo? " + estaLloviendo);

        System.out.println("Letra preferida " + letraPreferida);
        
    }
}