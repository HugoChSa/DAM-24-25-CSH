package ud6.E1216;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;

public class Academico {

    String nombre;
    int anhoIngreso;

    public Academico(String nombre, int anhoIngreso) {
        this.nombre = nombre;
        this.anhoIngreso = anhoIngreso;
    }
    @Override
    public String toString() {
        return nombre + " (" + anhoIngreso + ")";
    }

    public static void main(String[] args) {
        Map<Character, Academico> academia = new TreeMap<>();

    String contenidoFichero = readFileToString("src/ud6/E1216/academico.txt");

        System.out.println(contenidoFichero);
        String[] lineas = contenidoFichero.split("\\n");
        System.out.println(Arrays.toString(lineas));
        for (int i = 0; i < lineas.length; i++) {
            Character letra = lineas[i].charAt(6);
            String nombre = lineas[i].substring(7, lineas[i].length() -6);
            int anho = Integer.parseInt(lineas[i].substring(lineas[i].length() -5, lineas[i].length() -1));
            System.out.println(letra + " - " + nombre + " (" + anho + ")");
        }

        System.out.println(academia);
    }

    static boolean nuevoAcademico (Map<Character, Academico> academia, Academico nuevo, Character letra) {
        if (Character.isLetter(letra)) {
            academia.put(letra, nuevo);
            return true;
        }
        return false;
    }


    public static  String readFileToString(String filePath) {


        return filePath;
    }



}
