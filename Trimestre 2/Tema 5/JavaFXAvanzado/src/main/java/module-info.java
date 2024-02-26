module ajavaxproyect {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;

	opens vtx.mk.Ej1 to javafx.graphics, javafx.fxml;
	opens vtx.mk.Ej2 to javafx.graphics, javafx.fxml;
}
