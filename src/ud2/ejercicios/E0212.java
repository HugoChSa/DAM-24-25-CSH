package ud2.ejercicios;


import java.util.*;

/*E0212. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que
tener en cuenta que existen meses con 28, 30 y 31 días (no se considerarán los años
bisiestos) */

public class E0212 {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int dia, mes, anho;
        boolean fechaCorrecta = true;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el día del mes (1-31): ");
        dia = sc.nextInt();
        System.out.println("Introduce el número de mes (1-12): ");
        mes = sc.nextInt();
        System.out.println("Introduce el año: ");
        anho = sc.nextInt();
        sc.close();
   
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                fechaCorrecta = dia >= 1 && dia <= 31;
                break;
            case 4, 6, 9, 11:
                fechaCorrecta = dia >= 1 && dia <= 30;
                break;
            case 2:
                fechaCorrecta = dia >= 1 && dia <= 28;
                break;
            default:
                fechaCorrecta = false;
        }

        if (fechaCorrecta) {
            System.out.printf("La fecha es correcta: %d/%d/%d%n", dia, mes, anho);
        } else {
            System.out.println("La fecha NO es correcta");
        }

    }

    
 /*  
 
    import java.time.LocalDate;

    
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

        fecha = (dia + mes + anho);

        switch (fecha) {
            case 1:
                
                break;
        
            default:
                break;
        } */
                

    }