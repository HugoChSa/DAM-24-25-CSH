package ud1.trabajosclase.csh20241010;
import java.util.Scanner;

public class EP0129 {
    public static void main(String[] args) {
        int n;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número:");
        n = sc.nextInt();
        sc.close();

        System.out.println("¿Es múltiplo de 7? " + (n % 7 == 0));
        System.out.println("¿Resto de n % 7? " + (n % 7));
        System.out.println("Para el siguiente múltiplo sumo: " + (7 - (n % 7)));
        
    }
    
}
