package org.example;

import javax.swing.*;
import java.awt.*;

public class EjericioComponentUI extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Boton Personaliado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.getContentPane().add(panel);

        JButton button = new JButton("Boton Personalizado");
        button.setBackground(Color.CYAN);
        button.setForeground(Color.RED);

    }
}
