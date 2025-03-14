package ud3.ejerciciosclases;
/*E0709. Bombilla. Modelar una casa con muchas bombillas, de forma que cada bombilla
se pueda encender o apagar individualmente. Para ello, implementar una clase
Bombilla con una variable privada que indique si está encendida o apagada, así como
un método que nos diga el estado de una bombilla concreta. Además, queremos poner un
interruptor general, de forma que si éste se apaga, todas las bombillas quedan apagadas.
Cuando el interruptor general se activa, las bombillas vuelven a estar encendidas o
apagadas, según estuvieran antes. Cada bombilla se enciende y se apaga
individualmente, pero solo responde que está encendida si su interruptor particular está
activado y además hay luz general */

public class Bombilla {
    private boolean interruptor;

    private static boolean interruptorGeneral;

    public void encender() {
        interruptor = true;
    }

    public void apagar() {
        interruptor = false;
    }

    public static void encenderInterruptorGeneral() {
        interruptorGeneral = true;
    }

    public static void apagarInterruptorGeneral() {
        interruptorGeneral = false;
    }

    public boolean estado() {
        return interruptor && interruptorGeneral;
    }

    public static boolean estado(Bombilla b2) {
        return b2.interruptor && interruptorGeneral;
    }

}
