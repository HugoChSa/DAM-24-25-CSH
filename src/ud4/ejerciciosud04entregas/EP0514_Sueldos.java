package ud4.ejerciciosud04entregas;



import java.util.Scanner;

/*. El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a
realizar encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. Para
ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el número de
encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor -1.
Una vez terminada la entrada de datos, muestra la siguiente información:
● Todos los sueldos introducidos ordenados de forma decreciente.
● El sueldo máximo y mínimo.
● La media de los sueldos.
● Cuántos sueldos hay por encima de la media.
● Cuántos sueldos hay por debajo de la media. */

public class EP0514_Sueldos {
    public static void main(String[] args) {
        int sueldoMaximo;
        int sueldoMinimo;

        System.out.println("Introduzca el sueldo de la persona encuestada (Para terminar introduzca -1)");
        Scanner sc = new Scanner(System.in);
        int sueldoEncuestado = sc.nextInt();
        if (sueldoEncuestado > 0) {
            
        }else if (sueldoEncuestado < 0) {
            System.out.println("Sueldo no valido");
        } if (sueldoEncuestado == -1) {
            //System.out.println("El sueldo máximo es: " + sueldoMaximo + ". Mientras que el mínimo es: " + sueldoMinimo);
        }


    }
}
