package ud1.trabajosclase.csh20241010;
import java.util.Scanner;
public class EP0133 {
    public static void main(String[] args) {
        /* byte unidadBytes;
        int unidadKiloBytes;
        int unidadMegaBytes;
        int unidadGigaBytes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una unidad en bytes: ");
        unidadBytes = sc.nextByte();
        
        
        unidadKiloBytes = unidadBytes * 1204;
        unidadMegaBytes = (unidadBytes * 1204) * 1204;
        unidadGigaBytes = ((unidadBytes * 1204) * 1204) * 1204;

        Intenté hacer que se pueda elegir a que pasar, pero no me salió, lo dejé como una nota 
        boolean K = unidadKiloBytes;
        int M = unidadMegaBytes;
        int G = unidadGigaBytes;
       

        System.out.println("Ahora indica a que unidad lo quieres pasar (Poner K para kilobytes , M para megabytes , y G para gigabytes)");
        
        
        System.out.println(unidadBytes + " es igual a " + unidadKiloBytes + " KB");
        System.out.println(unidadBytes + " es igual a " + unidadMegaBytes + " MB");
        System.out.println(unidadBytes + " es igual a " + unidadMegaBytes + " GB"); */

        //Corrección:    
    
            // Datos
            double cantidadOrigen, cantidadDestino;
            char udMedidaOrigen, udMedidaDestino;
            final int MULTIPLO_KB = 1024;
            final int MULTIPLO_MB = 1024 * 1024;
            final int MULTIPLO_GB = 1024 * 1024 * 1024;
          
            // Entrada
            Scanner sc = new Scanner(System.in);
            System.out.print("Escribe la cantidad de datos a convertir: ");
            cantidadOrigen = sc.nextDouble(); sc.nextLine();
            System.out.print("Unidad de medida de Origen (b=bytes; k=kilobytes; m=megabytes; g=gigabytes):");
            udMedidaOrigen = sc.nextLine().charAt(0);
            System.out.print("Unidad de medida de Destino:");
            udMedidaDestino = sc.nextLine().charAt(0);
            sc.close();
          
            // Proceso
            // Convierto la cantidad de Origen a bytes
            double bytes = udMedidaOrigen == 'b' ? cantidadOrigen : udMedidaOrigen == 'k' ? cantidadOrigen * MULTIPLO_KB : udMedidaOrigen == 'm' ? cantidadOrigen * MULTIPLO_MB : cantidadOrigen * MULTIPLO_GB;
          
            // Convierto los bytes a la cantidad de Destino
            cantidadDestino = udMedidaDestino == 'g' ? bytes / MULTIPLO_GB : udMedidaDestino == 'm' ? bytes / MULTIPLO_MB : udMedidaDestino == 'k' ? bytes / MULTIPLO_KB : bytes;
          
            // Salida
            System.out.printf("La cantidad resultante es de %.2f ", cantidadDestino);
            String medida = udMedidaDestino == 'b' ? "bytes" : udMedidaDestino == 'k' ? "kilobytes" : udMedidaDestino == 'm' ? "megabytes" : "gigabytes";
            System.out.println(medida);
          
              

    }
    
}
