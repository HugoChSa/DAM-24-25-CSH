package ud2.ejercicios;

import java.time.LocalDate;
import java.util.*;

/*E0212. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que
tener en cuenta que existen meses con 28, 30 y 31 días (no se considerarán los años
bisiestos) */

public class E0212 {
    public static void main(String[] args) {
        int fecha;
       
        Scanner sc = new Scanner(System.in);
        System.out.print("¿En qué día de mes estamos? (Introducir en números) ");
        int dia = sc.nextInt();
        

        System.out.println("¿En qué mes estamos? (Introducir en números) ");
        int mes = sc.nextInt();

        System.out.println("¿Y en qué año estamos? (Introducir en números) ");
        int anho = sc.nextInt();

        

        int diaActual = LocalDate.now().getDayOfMonth();
        int mesActual = LocalDate.now().getMonthValue();
        int anhoActual = LocalDate.now().getYear();
        int formula;

       /*  fecha = (dia + mes + anho);

        switch (fecha) {
            case 1:
                
                break;
        
            default:
                break;
        }
        sc.close(); */
        }
    }
    
