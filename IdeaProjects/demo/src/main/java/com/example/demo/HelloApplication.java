package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class CalculadoraAreas extends JFrame {

        private JTextField campo1, campo2;
        private JLabel resultado;
        private String figuraActual = "";

        private JPanel panelDibujo;

        public CalculadoraAreas() {
            setTitle("Calculadora de Áreas");
            setSize(400, 400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

            // Botones
            JButton btnCirculo = new JButton("Mostrar Círculo");
            JButton btnRectangulo = new JButton("Mostrar Rectángulo");
            JButton btnCuadrado = new JButton("Mostrar Cuadrado");
            JButton btnCalcular = new JButton("Calcular Área");

            add(btnCirculo);
            add(btnRectangulo);
            add(btnCuadrado);

            // Panel de dibujo
            panelDibujo = new JPanel() {
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.BLUE);

                    if (figuraActual.equals("circulo")) {
                        g.fillOval(50, 20, 100, 100);
                    } else if (figuraActual.equals("rectangulo")) {
                        g.fillRect(30, 20, 150, 100);
                    } else if (figuraActual.equals("cuadrado")) {
                        g.fillRect(50, 20, 100, 100);
                    }
                }
            };

            panelDibujo.setPreferredSize(new Dimension(200,150));
            add(panelDibujo);

            // Campos
            campo1 = new JTextField(10);
            campo2 = new JTextField(10);

            add(new JLabel("Campo 1 (radio/base/lado):"));
            add(campo1);

            add(new JLabel("Campo 2 (altura):"));
            add(campo2);

            // Resultado
            resultado = new JLabel("Resultado: ");
            add(btnCalcular);
            add(resultado);

            // Eventos
            btnCirculo.addActionListener(e -> seleccionarFigura("circulo"));
            btnRectangulo.addActionListener(e -> seleccionarFigura("rectangulo"));
            btnCuadrado.addActionListener(e -> seleccionarFigura("cuadrado"));

            btnCalcular.addActionListener(e -> calcularArea());

            setVisible(true);
        }

        private void seleccionarFigura(String figura) {
            figuraActual = figura;
            limpiar();

            if (figura.equals("rectangulo")) {
                campo2.setEnabled(true);
            } else {
                campo2.setEnabled(false);
            }

            panelDibujo.repaint();
        }

        private boolean validar(String valor) {
            if (valor.isEmpty()) return false;

            try {
                double num = Double.parseDouble(valor);
                return num > 0;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        private void calcularArea() {
            String v1 = campo1.getText();
            String v2 = campo2.getText();

            if (!validar(v1) || (figuraActual.equals("rectangulo") && !validar(v2))) {
                JOptionPane.showMessageDialog(this, "⚠️ Datos inválidos");
                return;
            }

            double n1 = Double.parseDouble(v1);
            double n2 = figuraActual.equals("rectangulo") ? Double.parseDouble(v2) : 0;
            double area = 0;

            switch (figuraActual) {
                case "circulo":
                    area = Math.PI * Math.pow(n1, 2);
                    break;
                case "rectangulo":
                    area = n1 * n2;
                    break;
                case "cuadrado":
                    area = Math.pow(n1, 2);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "⚠️ Selecciona una figura");
                    return;
            }

            resultado.setText("Resultado: " + String.format("%.2f", area));
        }

        private void limpiar() {
            campo1.setText("");
            campo2.setText("");
            resultado.setText("Resultado:");
        }

        public static void main(String[] args) {
            new CalculadoraAreas();
        }
    }
