package ex.javafxej;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;


public class Ej4Controller {
    @FXML
    private void handleMenuAction(ActionEvent event) {
        MenuItem sourceMenuItem = (MenuItem) event.getSource();
        System.out.println("Ha pulsado la opción: " + sourceMenuItem.getText());
    }

}


