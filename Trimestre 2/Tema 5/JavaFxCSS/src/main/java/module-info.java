module vtx.mk.javafxcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens vtx.mk.javafxcss to javafx.fxml;
    exports vtx.mk.javafxcss;
}