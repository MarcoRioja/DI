package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio4_1 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Holaa!");

        ventana.setSize(400,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton1 = new JButton("Boton 1");
        boton1.setBounds(0,100,100,20);
        JButton boton2 = new JButton("Boton 2");
        boton2.setBounds(100,100,100,20);
        JButton boton3 = new JButton("Boton 3");
        boton3.setBounds(200,100,100,20);

        ventana.getContentPane().setLayout(null);
        ventana.getContentPane().add(boton1);
        ventana.getContentPane().add(boton2);
        ventana.getContentPane().add(boton3);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventana,"Boton 1");
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventana,"Boton 2");
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventana,"Boton 3");
            }
        });

        ventana.setVisible(true);
    }
}
