module org.example.componentesfx_8_1_24 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.componentesfx_8_1_24 to javafx.fxml;
    exports org.example.componentesfx_8_1_24.Ej2;
    opens org.example.componentesfx_8_1_24.Ej2 to javafx.fxml;
    exports org.example.componentesfx_8_1_24.Ej3;
    opens org.example.componentesfx_8_1_24.Ej3 to javafx.fxml;
    exports org.example.componentesfx_8_1_24.Ej4;
    opens org.example.componentesfx_8_1_24.Ej4 to javafx.fxml;
}