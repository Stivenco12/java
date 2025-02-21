package com.example;
import javax.swing.*;

public class EntradaGrafica {
    public static void main(String[] args) {
  
        JFrame frame = new JFrame("Entrada de Datos");

        JLabel label1 = new JLabel("Ingresa un numero:");

        JTextField numer1 = new JTextField(30);  

        JLabel label2 = new JLabel("Ingresa otro numero:");

        JTextField numer2 = new JTextField(30);  

        JButton button = new JButton("Suma los numeros");

        button.addActionListener(e -> {
             
            double num1 = Integer.parseInt(numer1.getText());
            double num2 = Integer.parseInt(numer2.getText());
            double num3 = num1 / num2;
            JOptionPane.showMessageDialog(frame, "la suma es = " + num3 );
            
            
        });
        JPanel panel = new JPanel();
        panel.add(label1);
        panel.add(numer1);
        panel.add(label2);
        panel.add(numer2);
        panel.add(button);
        
        frame.add(panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
