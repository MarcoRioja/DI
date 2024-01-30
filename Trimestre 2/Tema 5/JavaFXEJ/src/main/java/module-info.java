module ex.javafxej {
    requires javafx.controls;
    requires javafx.fxml;


    opens ex.javafxej.Ej2 to javafx.fxml;
    exports ex.javafxej.Ej2;

    opens ex.javafxej.Ej3 to javafx.fxml;
    exports ex.javafxej.Ej3;

    opens ex.javafxej.Ej4 to javafx.fxml;
    exports ex.javafxej.Ej4;

    opens ex.javafxej.Ej6 to javafx.fxml;
    exports ex.javafxej.Ej6;

    opens ex.javafxej.Ej7 to javafx.fxml;
    exports ex.javafxej.Ej7;

    opens ex.javafxej.Ej8 to javafx.fxml;
    exports ex.javafxej.Ej8;

    opens ex.javafxej.Ej9 to javafx.fxml;
    exports ex.javafxej.Ej9;

    opens ex.javafxej.Ej10 to javafx.fxml;
    exports ex.javafxej.Ej10;
}