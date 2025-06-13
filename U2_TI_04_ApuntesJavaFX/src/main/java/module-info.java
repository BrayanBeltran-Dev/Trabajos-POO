module com.example.demo3b {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.demo3b to javafx.fxml;
    exports mx.edu.utez.demo3b;
    opens mx.edu.utez.demo3b to javafx.fxml;
}