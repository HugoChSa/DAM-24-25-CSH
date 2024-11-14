package ud2.ejerciciosbucles;

/*E0308. Pedir diez números enteros por teclado y mostrar la media. */
import java.util.Scanner;
public class E0308 {
public static void main(String[] args) {
    int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce 10 numeros enteros y se mostrará la media (Se deben introducir uno por uno): ");
    
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    n3 = sc.nextInt();
    n4 = sc.nextInt();
    n5 = sc.nextInt();
    n6 = sc.nextInt();
    n7 = sc.nextInt();
    n8 = sc.nextInt();
    n9 = sc.nextInt();
    n10 = sc.nextInt();

    sc.close();

    int media = ((n1 + n2 + n3 + n4 + n5 + n6 +  n7 + n8 + n9 + n10)/10);
    System.out.println("La media es: " + media);
}    
}
