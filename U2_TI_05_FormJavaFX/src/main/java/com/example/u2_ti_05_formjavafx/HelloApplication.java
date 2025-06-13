package com.example.u2_ti_05_formjavafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label lblNombre = new Label("Nombre:");
        TextField tfNombre = new TextField();
        Label lblApellido = new Label("Apellido:");
        TextField tfApellido = new TextField();
        Label lblEdad = new Label("Edad:");
        TextField tfEdad = new TextField();
        Label lblRol = new Label("Rol:");
        ComboBox<String> cbRol = new ComboBox<>();
        cbRol.getItems().addAll("Estudiante", "Profesor", "Admin");
        Button btnCrear = new Button("Crear");
        Button btnReset = new Button("Reset");
        Label lblResultado = new Label();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(lblNombre, 0, 0);
        grid.add(tfNombre, 1, 0);
        grid.add(lblApellido, 0, 1);
        grid.add(tfApellido, 1, 1);
        grid.add(lblEdad, 0, 2);
        grid.add(tfEdad, 1, 2);
        grid.add(lblRol, 0, 3);
        grid.add(cbRol, 1, 3);
        grid.add(btnCrear, 0, 4);
        grid.add(btnReset, 1, 4);
        grid.add(lblResultado, 0, 5, 2, 1);

        btnCrear.setOnAction(e -> {
            String nombre = tfNombre.getText().trim();
            String apellido = tfApellido.getText().trim();
            String edad = tfEdad.getText().trim();
            String rol = cbRol.getValue();



            if (!nombre.isEmpty() && !apellido.isEmpty() && !edad.isEmpty() && rol != null) {
                grid.setStyle("-fx-background-color: lightgreen; -fx-padding: 20;");
                lblResultado.setStyle("-fx-background-color: lightblue; -fx-padding: 10;");
                lblResultado.setText("Nombre: " + nombre + " Apellido: " + apellido +
                        " Edad: " + edad + " Rol: " + rol);
            } else {
                lblResultado.setText("Por favor, completa todos los campos.");
                lblResultado.setStyle("-fx-background-color: lightcoral; -fx-padding: 10;");
            }
        });

        btnReset.setOnAction(e -> {
            tfNombre.clear();
            tfApellido.clear();
            tfEdad.clear();
            cbRol.getSelectionModel().clearSelection();
            lblResultado.setText("");
            lblResultado.setStyle("");
            grid.setStyle("-fx-padding: 20;");
        });

        Scene scene = new Scene(grid, 500, 400);
        primaryStage.setTitle("FormJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
        Image image = new Image(getClass().getResourceAsStream("/Image/shuttle.png"));
        primaryStage.getIcons().add(image);

    }

    public static void main(String[] args) {
        launch ();
    }
}