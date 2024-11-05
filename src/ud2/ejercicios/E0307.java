package ud2.ejercicios;

/*Escribir todos los múltiplos de 7 menores que 100. */
public class E0307 {
    public static void main(String[] args) {
        System.out.println("Los múltiplos de 7 menores que 100 son: ");
        for (int i = 1; i <= 100; i++) { 
            if (i % 7 != 0) {
            continue;
            }
            System.out.println(i);
        }
    }
}