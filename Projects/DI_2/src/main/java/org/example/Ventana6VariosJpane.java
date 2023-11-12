package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana6VariosJpane extends JFrame{

    private JLabel etiquetaMensaje;

    public Ventana6VariosJpane() {
        setTitle("Ejemplo con Dis Contenedores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelBotones = new JPanel();
        JPanel panelMensaje = new JPanel();

        //creamos las etiquetas
        JLabel etiquetaMensaje = new JLabel("Mensaje: ");

        //creamos un bucle para los botones y el ActionListener asi como que al pulsar cambie el mensaje del boton
        for (int i = 0; i <= 3; i++) {
            JButton boton = new JButton("Boton " + i);
            //le añadimos el listener, para cada boton
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //extraemos el nombre del boton
                    String textoBoton = ((JButton) e.getSource()).getText();
                    etiquetaMensaje.setText("Mensaje: " + textoBoton);
                    //definimos el contenido de la etiqueta label cuando pulsamos en cada boton
                }
            });

            panelBotones.add(boton);
            // añadimos el layout, en este caso, borderLayout en east, west, north, south y
            // center Y AÑADIMOS
            // TANTO LOS BOTONES COMO EL PANELMENSAJE, ASI COMO EL MENSAJE DEL BOTON
            // PULSADO, 1,2,3
            setLayout(new BorderLayout());
            add(panelBotones, BorderLayout.SOUTH);
            add(panelMensaje, BorderLayout.CENTER);
            panelMensaje.add(etiquetaMensaje);

            pack();// ajusta el tamaño de los elementos del jframe
            // setLocationRelativeTo(null);
            setVisible(true);
        }
    }

    public static void main(String[] args) {

        // programa tareas que deben ejecutarse de manera segura, y evita concurrencia
        // que se ejecutan varias acciones al mismo tiempo e interfieran entre si
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ventana6VariosJpane();
            }
        });
    }
}
