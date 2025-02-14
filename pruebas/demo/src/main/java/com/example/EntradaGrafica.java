package com.example;
import javax.swing.*;

public class EntradaGrafica {
    public static void main(String[] args) {
        // Crear una ventana
        JFrame frame = new JFrame("Entrada de Datos");

        // Crear una etiqueta
        JLabel label = new JLabel("Ingresa tu nombre:");

        // Crear un campo de texto (JTextField) para que el usuario ingrese su nombre
        JTextField textField = new JTextField(20);  // 20 es el tamaño del campo

        // Crear un botón para procesar la entrada
        JButton button = new JButton("Mostrar Saludo");

        // Acción del botón
        button.addActionListener(e -> {
            // Obtener el texto ingresado por el usuario en el JTextField
            String nombre = textField.getText();
            // Mostrar un saludo en un mensaje emergente
            JOptionPane.showMessageDialog(frame, "¡Hola, " + nombre + "!");
        });

        // Crear un panel para agregar los componentes
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // Configurar la ventana
        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
