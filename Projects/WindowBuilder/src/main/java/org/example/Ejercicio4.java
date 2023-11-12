package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio4 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Holaa!");

        ventana.setSize(400,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton("Haz click aquí para que te robe");
        boton.setBounds(106,56,109,36);

        ventana.getContentPane().setLayout(null);
        ventana.getContentPane().add(boton);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog(ventana,"Dime tu nombre", "Datos personales",
                        JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(ventana,"Gracias " + nombre + " por tus datos.", "Datos robados",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        });

        ventana.setVisible(true);
    }
}
