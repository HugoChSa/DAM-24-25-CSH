import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Conversor extends Application {
    TextField txtNum1 = new TextField("Introduce una unidad");
    TextField txtNum2 = new TextField("Otra unidad");
    Button btnEuroDolar = new Button("Pasar de Euros a Dólares");
    Button btnLibrasKilos = new Button("Pasar de Kilos a Libras");
    Button btnMillasKm = new Button("Pasar de Millas a Kilómetros");
    Label lblResultado = new Label();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //txtNum1.setOnKeyTyped(e -> sumar());
        //txtNum2.setOnKeyTyped(e -> sumar());

        btnEuroDolar.setOnAction(e -> EuroDolar());
        btnLibrasKilos.setOnAction(e -> LibrasKilos());
        btnMillasKm.setOnAction(e -> MillasKm());

    VBox vbox = new VBox(txtNum1, txtNum2, btnEuroDolar, btnLibrasKilos, btnMillasKm, lblResultado);

    Scene scene = new Scene(vbox, 300, 150);

    primaryStage.setScene(scene);
    primaryStage.setTitle("Conversor");
    primaryStage.setResizable(true);
    primaryStage.centerOnScreen();
    primaryStage.show();

    }

    private void EuroDolar(){
        double resultado;
        int n1=0, n2=0;
        double Euro = 1.00;
        double Dolar = 1.13;
        try {
            n1 = Integer.parseInt(txtNum1.getText());
            n2 = Integer.parseInt(txtNum2.getText());
            resultado = n1 * (n2*Euro)/Dolar;
            lblResultado.setText(String.valueOf(resultado + " €"));
        } catch (Exception ex) {
            lblResultado.setText("ERROR: Algún operando no es nu número");
        }

    }
    
    private void LibrasKilos(){
        double resultado;
        int n1=0, n2=0;
        double Libra = 1;
        double Kilos = 0.4535924;
        try {
            n1 = Integer.parseInt(txtNum1.getText());
            n2 = Integer.parseInt(txtNum2.getText());
            resultado = n1 * (n2*Kilos)/Libra;
            lblResultado.setText(String.valueOf(resultado + " Kg"));
        } catch (Exception ex) {
            lblResultado.setText("ERROR: Algún operando no es nu número");
        }

    }

    private void MillasKm(){
        double resultado;
        int n1=0, n2=0;
        double Milla = 1;
        double Kilometro = 1.609344;
        try {
            n1 = Integer.parseInt(txtNum1.getText());
            n2 = Integer.parseInt(txtNum2.getText());
            resultado = n1 * (n2*Kilometro)/Milla;
            lblResultado.setText(String.valueOf(resultado + " Km"));
        } catch (Exception ex) {
            lblResultado.setText("ERROR: Algún operando no es nu número");
        }

    }
}
