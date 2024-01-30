package ex.javafxej;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Ej2Controller {
    @FXML
    private TextField operador1TextField;


    @FXML
    private Label resultadoLabel;


    @FXML
    private void iva4() {
        // Lógica para sumar los operandos
        double operando1 = Double.parseDouble(operador1TextField.getText());
        double resultado = operando1 * 0.04f;
        resultadoLabel.setText(String.format("Resultado %.2f", resultado));
    }


    @FXML
    private void iva10() {
        // Lógica para restar los operandos
        double operando1 = Double.parseDouble(operador1TextField.getText());
        double resultado = operando1 * 0.1f;
        resultadoLabel.setText(String.format("Resultado %.2f", resultado));
    }


    @FXML
    private void iva21() {
        // Lógica para multiplicar los operandos
        double operando1 = Double.parseDouble(operador1TextField.getText());
        double resultado = operando1 * 0.21f;
        resultadoLabel.setText(String.format("Resultado %.2f", resultado));
    }


    @FXML
    private void limpiar() {
        // Lógica para limpiar los campos
        operador1TextField.clear();
        resultadoLabel.setText("Resultado: ");
    }


    @FXML
    private void salir() {
        // Lógica para cerrar la aplicación
        System.exit(0);
    }
}


