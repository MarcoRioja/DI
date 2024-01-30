package ex.javafxej;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;


public class Ej3_1Controller implements Initializable {
    @FXML
    private Label text;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void setLabelInfo(String checkBox, String combo1, String combo2, String radioBtn, String date, String color) {
        text.setText(String.format(" - CheckBox: %s - \n - Combo1: %s - \n - Combo2: %s - \n - RadioBtn: %s - \n " +
                "- Date: %s - \n - Color: %s -",checkBox,combo1,combo2,radioBtn,date,color));
    }
}



