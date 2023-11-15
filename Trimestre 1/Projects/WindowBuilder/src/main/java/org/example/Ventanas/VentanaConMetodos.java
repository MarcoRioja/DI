package org.example.Ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaConMetodos extends JFrame {
    private static JPanel panel;

    public void InicializarVentana() {
        setSize(1000,500);
        setVisible(true);
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void agregarBoton(String nombreBoton, int x, int y) {
        JButton botonBienvenido = new JButton(nombreBoton);
        botonBienvenido.setBounds(x,y,100,50);
        panel.add(botonBienvenido);
    }

    public void agregarBotonRedimensionar( int x, int y, VentanaConMetodos ventanaConMetodos) {
        JButton botonRedimensionar = new JButton("Redimensionar");
        botonRedimensionar.setBounds(x,y,100,50);
        panel.add(botonRedimensionar);

        botonRedimensionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(500,500);
                JOptionPane.showMessageDialog(ventanaConMetodos,"Se ha redimensoinado la ventana");
            }
        });
    }
}
