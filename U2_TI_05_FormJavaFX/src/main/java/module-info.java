module com.example.u2_ti_05_formjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.u2_ti_05_formjavafx to javafx.fxml;
    exports com.example.u2_ti_05_formjavafx;
}