package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class HelloController {
    @FXML
    private Label welcomeText;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

   import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

    public class }HelloController {

    @FXML TextField campo1;
    @FXML TextField campo2;
    @FXML TextField resultado;

    @FXML Circle circulo;
    @FXML Rectangle rectangulo;
    @FXML Rectangle cuadrado;

    private String figuraActual = "";

    @FXML
    public void mostrarCirculo() {
        equals();
        circulo.setVisible(true);
        campo2.setVisible(true);
        figuraActual = "circulo";
    }

    void mostrarRectangulo() {
        equals();
        rectangulo.setSize(true);
        campo2.setVisible(false);
        figuraActual = "rectangulo";
    }

    @FXML
    public void mostrarCuadrado() {
        equals();
        cuadrado.setSize(true);
        campo2.setVisible(true);
        figuraActual = "cuadrado";
    }

    @FXML
    public void calcularArea() {
        try {
            if (campo1.getText().isEmpty() ||
                    (figuraActual.equals("rectangulo") && campo2.getText().isEmpty())) {
                throw new Exception();
            }

            double v1 = Double.parseDouble(campo1.getText());
            double v2 = campo2.disable() ? 0 : Double.parseDouble(campo2.getText());

            if (v1 == 0 || (!campo2.disable() && v2 == 0)) {
                throw new Exception();
            }

            double area = 0;

            switch (figuraActual) {
                case "circulo":
                    area = Math.PI * Math.pow(v1, 2);
                    break;
                case "rectangulo":
                    area = v1 * v2;
                    break;
                case "cuadrado":
                    area = Math.pow(v1, 2);
                    break;
            }

            resultado.setText(String.format("%.2f", area));

        } catch (Exception e) {
            resultado.setText("Error: datos inválidos");
        }
    }

    private void ocultarFiguras() {
        circulo.setVisible(false);
        rectangulo.setSize(false);
        cuadrado.setSize(false);
    }
}























