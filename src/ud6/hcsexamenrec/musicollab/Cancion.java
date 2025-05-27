//Hugo Chan Saball - UD06 - Examen Práctico - Recuperación

//?
package ud6.hcsexamenrec.musicollab;

import java.util.List;
import java.util.Arrays;
import  java.util.ArrayList;
import  java.util.Collections;

public class Cancion extends AppMusicCollab{


    private final String nombre;
    private final String autor;
    private final String estiloMusical;
    List<String> InstrumentosRequeridos;

    public Cancion(String nombre, String autor, String estiloMusical, List<String> InstrumentosRequeridos) {
        this.nombre = nombre;
        this.autor = autor;
        this.estiloMusical = estiloMusical;
        this.InstrumentosRequeridos = List.of(String.valueOf(InstrumentosRequeridos));
    }


    public static void main(String[] args) {
        // Canciones de ejemplo
        List<Cancion> canciones = Arrays.asList(
                new Cancion("Bohemian Rhapsody", "Queen", "Rock",
                        List.of("voz", "piano", "guitarra", "batería")),
                new Cancion("Billie Jean", "Michael Jackson", "Pop",
                        List.of("voz", "bajo", "batería")),
                new Cancion("Imagine", "John Lennon", "Balada",
                        List.of("voz", "piano")),
                new Cancion("Smells Like Teen Spirit", "Nirvana", "Grunge",
                        List.of("voz", "guitarra", "bajo", "batería")),
                new Cancion("Yesterday", "The Beatles", "Pop",
                        List.of("voz", "guitarra")),
                new Cancion("Sweet Child O'Mine", "Guns N' Roses", "Rock",
                        List.of("voz", "guitarra", "bajo", "batería")),
                new Cancion("Rolling in the Deep", "Adele", "Pop",
                        List.of("voz", "piano", "batería")),
                new Cancion("Hotel California", "Eagles", "Rock",
                        List.of("voz", "guitarra", "bajo", "batería")));

        // Ordenar canciones por nombre
        Collections.sort(canciones);
        System.out.println("\nCanciones ordenadas por nombre:");
        System.out.println("===============================\n");
        canciones.forEach(System.out::println);

        // Ordenar canciones alfabéticamente por estilo musical, luego por autor y luego por nombre
        System.out.println("\nCanciones ordenadas por estilo musical, luego por autor y luego por nombre:");
        System.out.println("===========================================================================\n");

        // TODO Tu código aquí
        // ...
        // ...

        canciones.forEach(System.out::println);       
        
        // Obtener lista de instrumentos distintos
        System.out.println("\nLista de instrumentos distintos:");
        System.out.println("================================\n");
        System.out.println(instrumentosDistintos(canciones));

        System.out.println("\n");
    }

}


