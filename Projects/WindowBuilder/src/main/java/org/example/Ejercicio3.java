package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3 extends JFrame{

    public static void main(String[] args) {
        JFrame ventana = new JFrame();

        ventana.setSize(400,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton("Haz click aquí");
        ventana.add(boton);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog(ventana,"Dime tu nombre", "Datos personales",
                        JOptionPane.QUESTION_MESSAGE);
            }
        });

        ventana.setVisible(true);
    }
}
