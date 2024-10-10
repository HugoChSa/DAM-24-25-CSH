package Conversiones;

public class Conversiones {
    public static void main(String[] args) {
        int num = 65;
        char letra = (char) num;
        letra++;
        boolean mayuscula = letra >= 'A' && letra <= 'Z';
        System.out.println(letra + " es mayúscula? " + mayuscula);
        System.out.println("En minúsculas sería: " + (char)(letra + 32));


    }
}
