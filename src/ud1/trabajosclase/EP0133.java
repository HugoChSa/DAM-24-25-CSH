package ud1.trabajosclase;
import java.util.Scanner;
public class EP0133 {
    public static void main(String[] args) {
        byte unidadBytes;
        int unidadKiloBytes;
        int unidadMegaBytes;
        int unidadGigaBytes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una unidad en bytes: ");
        unidadBytes = sc.nextByte();
        
        
        unidadKiloBytes = unidadBytes * 1204;
        unidadMegaBytes = (unidadBytes * 1204) * 1204;
        unidadGigaBytes = ((unidadBytes * 1204) * 1204) * 1204;

        /*Intenté hacer que se pueda elegir a que pasar, pero no me salió, lo dejé como una nota 
        boolean K = unidadKiloBytes;
        int M = unidadMegaBytes;
        int G = unidadGigaBytes;
       

        System.out.println("Ahora indica a que unidad lo quieres pasar (Poner K para kilobytes , M para megabytes , y G para gigabytes)");
        */
        
        System.out.println(unidadBytes + " es igual a " + unidadKiloBytes + " KB");
        System.out.println(unidadBytes + " es igual a " + unidadMegaBytes + " MB");
        System.out.println(unidadBytes + " es igual a " + unidadMegaBytes + " GB");

    }
    
}
