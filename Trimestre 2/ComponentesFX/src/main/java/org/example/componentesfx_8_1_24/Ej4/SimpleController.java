package org.example.componentesfx_8_1_24.Ej4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SimpleController {
    @FXML
    private void handleButtonClick(ActionEvent event) {
        System.out.println("Pushed button " + ((Button) event.getSource()).getId());
    }
}
