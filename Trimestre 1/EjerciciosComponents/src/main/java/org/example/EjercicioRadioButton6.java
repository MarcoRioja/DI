package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioRadioButton6 extends JFrame {
    public EjercicioRadioButton6() {
        setTitle("Ejemplo JRadioButton");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton radioButton1 = new JRadioButton("Pastilla Azul");
        JRadioButton radioButton2 = new JRadioButton("Pastilla Roja");

        // hay que meterlo en un grupo, para que al pulsar una opcion no puedas pulsar la otra opcion
        //si desactivamos esta opcion, podremos usar ambos botones.
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        ButtonGroup group1 = new ButtonGroup();

        JPanel panel = new JPanel();
        panel.add(radioButton1);

        panel.add(radioButton2);


        getContentPane().add(panel);

        pack();
        setLocationRelativeTo(null);

        radioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showMessage("Selection","Has elegido MAL...");
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showMessage("Selection","Has elegido BIEN...");
            }
        });
    }

    void showMessage(String title, String message) {
        JOptionPane.showMessageDialog(this,message,title,JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EjercicioRadioButton6().setVisible(true);
        });
    }
}