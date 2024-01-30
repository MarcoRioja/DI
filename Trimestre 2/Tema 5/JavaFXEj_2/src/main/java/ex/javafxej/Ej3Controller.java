package ex.javafxej;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Ej3Controller implements Initializable {
    @FXML
    private CheckBox checkBox1;
    @FXML
    private CheckBox checkBox2;
    @FXML
    private CheckBox checkBox3;
    @FXML
    private ComboBox<String> comboBox1;

    @FXML
    private ComboBox<String> comboPago;

    @FXML
    private RadioButton radioButtonParticular;

    @FXML
    private RadioButton radioButtonEmpresa;

    @FXML
    private DatePicker dateSelector;

    @FXML
    private ColorPicker colorSelector;

    ToggleGroup toggleGroup;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (comboBox1 == null) {
            System.out.println("El ComboBox es nulo y vamos a inicializarlo.");
            comboBox1 = new ComboBox<>(); // Inicializar el ComboBox
        }

        if (comboPago == null) {
            System.out.println("El ComboBox es nulo y vamos a inicializarlo.");
            comboPago = new ComboBox<>(); // Inicializar el ComboBox
        }


        // Configurar elementos del ComboBox
        ObservableList<String> items = FXCollections.observableArrayList("Opción 1", "Opción 2", "Opción 3");
        comboBox1.setItems(items);

        ObservableList<String> items1 = FXCollections.observableArrayList("Contado", "Transferencia", "PayPal");
        comboPago.setItems(items1);


        // Establecer el valor predeterminado (puedes cambiar "Opción 1" a la opción que desees)
        if (comboBox1.getValue() == null) {
            System.out.println("Estableciendo el valor predeterminado.");
            comboBox1.setValue("Opción 1");
        }

        // Establecer el valor predeterminado (puedes cambiar "Opción 1" a la opción que desees)
        if (comboPago.getValue() == null) {
            System.out.println("Estableciendo el valor predeterminado.");
            comboPago.setValue("Contado");
        }


        System.out.println("El ComboBox se ha iniciado bien.");

        toggleGroup = new ToggleGroup();
        radioButtonParticular.setToggleGroup(toggleGroup);
        radioButtonEmpresa.setToggleGroup(toggleGroup);

    }

    public void onButtonClick(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ej3_1.fxml")); //cargamos el fichero //Resultado
            Parent root = loader.load();

            Ej3_1Controller resultadoController = loader.getController();

            String combo1Text = comboPago.getValue();

            String radioText = "";
            if (radioButtonParticular.isSelected()) {
                radioText = "Particular";
            } else if (radioButtonEmpresa.isSelected()) {
                radioText = "Empresa";
            }

            String combo2Text = comboBox1.getValue();

            String checkText = "";
            if (checkBox1.isSelected()) {
                checkText += " Television";
            }
            if (checkBox2.isSelected()) {
                checkText += " Telefonia";
            }
            if (checkBox3.isSelected()) {
                checkText += " Wifi";
            }

            String dateText = dateSelector.getValue()!=null?dateSelector.getValue().toString():"";
            String colorText = colorSelector.getValue()!=null?colorSelector.getValue().toString():"";

            resultadoController.setLabelInfo(checkText,combo1Text,combo2Text,radioText,dateText,colorText);

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Resultados");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}






