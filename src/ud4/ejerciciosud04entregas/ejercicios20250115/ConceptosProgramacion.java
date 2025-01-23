package ud4.ejerciciosud04entregas.ejercicios20250115;
/*Conceptos de programación
ConceptosProgramacion.java
Los siguientes términos corresponden a conceptos que el alumnado de programación en
Java debe conocer:
"Algoritmo",
"Lenguaje de programación",
"Entorno de desarrollo",
"Compilación",
"Ejecución",
"Código fuente",
"Bytecode",
"Código objeto"
Realiza un programa que almacene los términos anteriores en un array de datos de tipo
String y que muestre uno de ellos por pantalla elegido al azar.
Para ello implementa una función que devuelva uno de los términos del array elegido al
azar, con el siguiente prototipo:
static String fraseAleatoria(String[] t)
 */

public class ConceptosProgramacion {
    /* 
    static String fraseAleatoria(String[] t) {
        t = Arrays.copyOf(t, t.length);
        t[t.length] = fraseAleatoria(t);
        if (t == null) 
            return null;
        //if (t ) {}
        
        System.out.println(Arrays.toString(t));
        }
        
        Integer [] datos = new Integer[0]
    
        Integer[] Algoritmo = {1};
        Integer[] lenguajeProgramacion = {2};
        Integer[] entornoDesarrollo = {3};
        Integer[] Compilación = {4};
        Integer[] Ejecucion = {5};
        Integer[] CodFuente = {6};
        Integer[] Bytecode = {7};
        Integer[] CodObjeto = {8}; 
    

*/

//Corrección:
public static void main(String[] args) {

    String conceptos[] = { "Algoritmo",
            "Lenguaje de programación",
            "Entorno de desarrollo",
            "Compilación",
            "Ejecución",
            "Código fuente",
            "Bytecode",
            "Código objeto"
    };

    for (int i = 0; i < 100; i++) {
        System.out.println(fraseAleatoria(conceptos));
    }
}

static String fraseAleatoria(String[] t) {
    return (t[(int) (Math.random() * t.length)]);
}

    }
    
    


