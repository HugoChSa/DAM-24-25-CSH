package ud1.identificadores;

import java.time.*;

public class Constantes {
    public static void main(String[] args) {
        // Número de alumnos matriculados en el módulo de Programación.
        final byte NUM_ALUMNADO_PROGRAMACION = 32;
     
        //Número total de sesiones en el módulo de Programación en el curso lectivo.
        final short NUM_SESIONES_PROGRAMACION = 288;

        //Número de sesiones semanales del módulo de Programación.
        final byte NUM_SESIONES_SEMANALES = 9;

        //Número de meses del año.
        final byte NUM_MESES_AÑO = 12;

        System.out.println("Número de alumnos matriculados en el módulo de Programación: " 
        + NUM_ALUMNADO_PROGRAMACION);
        System.out.println("Número total de sesiones del módulo de Programación en el curso lectivo: "
        + NUM_SESIONES_PROGRAMACION);
        System.out.println("Número de sesiones semanales del módulo de Programación: "
        + NUM_SESIONES_SEMANALES);
        System.out.println("Número de meses del año: "
        + NUM_MESES_AÑO);


        
        System.out.println(Math.random());
        double resultado = Math.pow(5,3);
        System.out.println(resultado);
        

        System.out.println("Hoy es el dia " + LocalDate.now().getYear());
        System.out.println("La hora actual es " + LocalTime.now());
        LocalDateTime ahora;
        ahora = LocalDateTime.now();
        System.out.println("El momento presente = " + ahora);


        int dia = ahora.getDayOfMonth();
        int mes = ahora.getMonthValue();
        int anho = ahora.getYear();
        int hora = ahora.getHour();
        int minuto = ahora.getMinute();
        int segundo = ahora.getSecond();

        System.out.println("Hoy es día " + dia + "del mes " + mes + "de" + anho);
        System.out.println("Ahora son las " + hora 
        + " horas y " + minuto 
        + " minutos y " + segundo + " segundos");
    
    }
}