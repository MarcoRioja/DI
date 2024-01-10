module com.example.newjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.examen to javafx.fxml;
    exports com.example.examen;
}