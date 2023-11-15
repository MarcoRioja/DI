package org.example.Windows;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Windows5WithMetods3 extends JFrame {
    private JPanel panel;

    public Windows5WithMetods3() {
        startWindow();
        addButton();
    }
    private void startWindow() {
        setSize(300, 300);
        setVisible(true);
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
    }

    private void addButton() {
        JButton welcomeButton = new JButton("Bienvenido");
        welcomeButton.setBounds(50, 50, 100, 50); // Posici�n (x, y) y tama�o (ancho, alto) del bot�n en relaci�n al panel.
        panel.add(welcomeButton);
    }

    public static void main(String[] args) {
    	Windows5WithMetods3 window=new Windows5WithMetods3();
    	
    }
}
