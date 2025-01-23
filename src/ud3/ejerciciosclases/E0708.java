package ud3.ejerciciosclases;
/*E0708 - Sintonizador. Definir la clase que permita controlar un sintonizador digital de
emisoras FM. El controlador tendrá una interfaz que permitirá subir (up) o bajar(down) la
frecuencia en (en saltos de 0,5 MHz) y mostrar la frecuencia sintonizada en un momento
dado (display).
Supondremos que el rango de frecuencias oscila entre los 80 MHz y los 108 MHz y que,
al inicio, el controlador sintonice la frecuencia indicada en el constructor o 80 MHz por
defecto.
Si durante una operación de subida o bajada se sobrepasa uno de los dos límites, la
frecuencia sintonizada debe pasar a ser la del extremo contrario.
Escribir un pequeño programa (o clase de pruebas) Para probar su funcionamiento.
Ampliar la clase:
1. para que permita guardar las frecuencias de hasta 3 emisoras y recuperarlas
cuando se desee.
2. Establece los atributos como privados y genera el setter y getter del atributo
frecuencia. Ten en cuenta en el setter que la frecuencia no exceda los límites.
Intenta no repetir código.
3. Añade dos métodos que permitan una sintonización más fina subiendo y bajando
la frecuencia en intervalos de 0,1 MHz
4. Prueba a generar una excepción cuando se intente establecer un valor de
frecuencia no válido */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("unused")
public class E0708 {
    public static void main(String[] args) {
        Sintonizador miRadio = new Sintonizador(80.5);
        miRadio.display();
        miRadio.downThin();
        miRadio.down();  
        miRadio.display();
        miRadio.fijarMemoria1();
        miRadio.up();
        miRadio.upThin();
        miRadio.display();
        miRadio.sintonizarMemoria1();
        miRadio.display();

        Sintonizador miRadioError = new Sintonizador(200);
        

    }

    @Test
    public void testSintonizador() {
        //assertEquals(0, 0);
    }
}
