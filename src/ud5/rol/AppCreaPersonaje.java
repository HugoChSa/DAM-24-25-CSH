package ud5.rol;

import java.util.Scanner;

public class AppCreaPersonaje {
        String Nombre;
        private enum Raza {Humano, Elfo, Enano, Hobbit, Orco, Troll};
        String Raza;
        int nivel = 0;
        double experiencia = 0;
        private enum caracteristicasFisicas {fuerza, agilidad, constitucion, ptosVida};
        int fuerza = 0;
        int agilidad = 0;
        int constitucion = 0;
        int ptosVida = 50 + constitucion;
    
    public class Personaje {
        Raza Raza;
        String nombre;
        caracteristicasFisicas caracteristicasFisicas;
       
        public Personaje(String nombre, caracteristicasFisicas caracteristicasFisicas, Raza Raza) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nombre del personaje: ");
            nombre = sc.nextLine();

            System.out.println("Raza del personaje: ");
            //Raza = sc.nextLine();
            
            System.out.println("Las caracteristicas de tu personaje son: " + caracteristicasFisicas);




            
        }

        public Personaje(ud5.rol.AppCreaPersonaje.Raza raza) {
            this.Raza = raza;
            
        }
    
    
    }
  
}
