module vtx.mk.javafxhilos {
    requires javafx.controls;
    requires javafx.fxml;


    opens vtx.mk.javafxhilos to javafx.fxml;
    exports vtx.mk.javafxhilos;
}