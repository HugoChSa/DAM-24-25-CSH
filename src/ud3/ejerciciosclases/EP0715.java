package ud3.ejerciciosclases;

public class EP0715 {
    public static void main(String[] args) {
        Calendario fecha = new Calendario(2024, 12, 31);
        fecha.incrementarDia();
        fecha.incrementarAño(-2025);
        fecha.mostrar();
        fecha.incrementarAño(1);
        fecha.mostrar();
        System.out.println("FIN");
    }
}
