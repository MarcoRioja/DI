package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Holaa!");

        ventana.setSize(400,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hola guapo!");
        ventana.add(label);

        ventana.setVisible(true);
    }
}
