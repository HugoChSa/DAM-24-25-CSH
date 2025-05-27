package ud7.apuntesjavafx;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Crea un programa que represente el mapa en una interfaz gráfica JavaFX y que permita mover un robot desde la casilla A hasta la Z con las teclas
 * de los cursores o AWSD. 
 * Si se pisa una mina deberá mostrar un cuadro de diálogo de error
 * Si se llega a la meta un cuadro de diálogo de éxito.
 */

public class Mapa extends Application {
    
    String[] mapa = {
        "  Z       ",
        " *        ",
        "  *  *    ",
        "          ",
        " A        "
    };

    public static void main(String[] args) {
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    for (int i = 0; i < mapa.length; i++) {
        for (int j=0; j< mapa[i].length(); j++) {

            Label lbl = new Label(String.valueOf(mapa[i].charAt(j)));
        }
    }    
    }

}
