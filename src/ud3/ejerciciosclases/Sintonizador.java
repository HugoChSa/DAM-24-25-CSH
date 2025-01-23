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
public class Sintonizador {
    private double frecuencia;

    private double memoria1;
    private double memoria2;
    private double memoria3;


    public Sintonizador() {
            this.frecuencia = 80;
    }


    public Sintonizador(double frecuencia) {
        setFrecuencia(frecuencia);
    }

    public void up() {
        frecuencia += 0.5;
        if (frecuencia > 108)
            frecuencia = 80;
    }

    public void down() {
        frecuencia -= 0.5;
        if (frecuencia < 80)
            frecuencia = 108;            
    }


    public void upThin() {
        frecuencia += 0.1;
        if (frecuencia > 108)
            frecuencia = 80;
    }

    public void downThin() {
        frecuencia -= 0.1;
        if (frecuencia < 80)
            frecuencia = 108;
    }    




    public void display() {
        System.out.println("Frecuencia sintonizada: " + frecuencia + " MHz");
    }


    public double getFrecuencia() {
        return frecuencia;
    }


    public void setFrecuencia(double frecuencia) throws IllegalArgumentException {
        if (frecuencia < 80)
            // Excepción
            throw new IllegalArgumentException("La frecuencia no puede ser inferior a 80 MHz");
        else if (frecuencia > 108)
            // Excepción 
            throw new IllegalArgumentException("La frecuencia no puede ser superior a 108 MHz");
        else
            this.frecuencia = frecuencia;

        /*
        if (frecuencia < 80)
            this.frecuencia = 80;
        else if (frecuencia > 108)
            this.frecuencia = 108;
        else
            this.frecuencia = frecuencia;
        */
    }

    
    // GESTIÓN DE MEMORIAS >> SETTERS Y GETTERS

    public void fijarMemoria1() {
        this.memoria1 = frecuencia;
    }
    
    public void fijarMemoria2() {
        this.memoria2 = frecuencia;
    }

    public void fijarMemoria3() {
        this.memoria3 = frecuencia;
    }        


    public double sintonizarMemoria1() {
        if (memoria1 != 0)
            frecuencia = memoria1;
        return memoria1;
    }

    public double sintonizarMemoria2() {
        if (memoria2 != 0)
            frecuencia = memoria2;        
        return memoria2;
    }

    public double sintonizarMemoria3() {
        if (memoria3 != 0)
            frecuencia = memoria3;        
        return memoria3;
    }

}
