module ex.javafxej {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ex.javafxej to javafx.fxml;
    exports ex.javafxej;
}