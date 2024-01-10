package com.example.examen;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ExamenFinal extends JFrame {

    // - Variables
    private final JTextField textFieldNombre;
    private final JTextField textFieldApellidos;
    private final JSpinner spinnerEdad;
    private final JTextArea textAreaComentarios;
    private final JCheckBox checkBoxJava;
    private final JCheckBox checkBoxPython;
    private final JRadioButton radioButtonBachillerato;
    private final JRadioButton radioButtonCicloMedio;
    private final JRadioButton radioButtonCicloSuperior;

    // Constructor
    public ExamenFinal() {
        // Establecemos el titulo, close operation y otras funciones basicas
        setTitle("Formulario para Alumnos de FP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new GridLayout(9, 1, 8, 5));

        // Creamos el panel y los demas componentes
        JLabel labelNombre = new JLabel("Nombre:");
        textFieldNombre = new JTextField();
        JLabel labelApellidos = new JLabel("Apellidos:");
        textFieldApellidos = new JTextField();
        JLabel labelEdad = new JLabel("Edad:");
        spinnerEdad = new JSpinner();
        JLabel labelComentarios = new JLabel("Comentarios:");
        textAreaComentarios = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textAreaComentarios);
        checkBoxJava = new JCheckBox("Java");
        checkBoxPython = new JCheckBox("Python");
        radioButtonBachillerato = new JRadioButton("Bachillerato");
        radioButtonCicloMedio = new JRadioButton("Ciclo Medio");
        radioButtonCicloSuperior = new JRadioButton("Ciclo Superior");
        ButtonGroup groupNivelEstudios = new ButtonGroup();
        groupNivelEstudios.add(radioButtonBachillerato);
        groupNivelEstudios.add(radioButtonCicloMedio);
        groupNivelEstudios.add(radioButtonCicloSuperior);
        JButton botonCargarCurriculum = new JButton("Cargar Curriculum");

        // Añadimos todos los componentes al panel
        panelFormulario.add(labelNombre);
        panelFormulario.add(textFieldNombre);
        panelFormulario.add(labelApellidos);
        panelFormulario.add(textFieldApellidos);
        panelFormulario.add(labelEdad);
        panelFormulario.add(spinnerEdad);
        panelFormulario.add(labelComentarios);
        panelFormulario.add(scrollPane);
        panelFormulario.add(checkBoxJava);
        panelFormulario.add(checkBoxPython);
        panelFormulario.add(radioButtonBachillerato);
        panelFormulario.add(radioButtonCicloMedio);
        panelFormulario.add(radioButtonCicloSuperior);
        panelFormulario.add(botonCargarCurriculum);

        getContentPane().add(panelFormulario, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        JButton botonCerrar = new JButton("Cerrar");
        JButton botonAceptar = new JButton("Aceptar");
        panelBotones.add(botonCerrar);
        panelBotones.add(botonAceptar);
        getContentPane().add(panelBotones, BorderLayout.SOUTH);

        // Funcion del boton de aceptar
        botonAceptar.addActionListener(e -> {
            // Recopilar la información del formulario
            String nombre = textFieldNombre.getText();
            String apellidos = textFieldApellidos.getText();
            int edad = (int) spinnerEdad.getValue();
            String comentarios = textAreaComentarios.getText();
            boolean javaChecked = checkBoxJava.isSelected();
            boolean pythonChecked = checkBoxPython.isSelected();
            String nivelEstudios = "";
            if (radioButtonBachillerato.isSelected()) {
                nivelEstudios = "Bachillerato";
            } else if (radioButtonCicloMedio.isSelected()) {
                nivelEstudios = "Ciclo Medio";
            } else if (radioButtonCicloSuperior.isSelected()) {
                nivelEstudios = "Ciclo Superior";
            }

            // Mostramos la información con un JOptionPane
            String mensaje =" - Nombre: " + nombre +
                            "\n - Apellidos: " + apellidos +
                            "\n - Edad: " + edad +
                            "\n - Comentarios: " + comentarios +
                            "\n - Java: " + javaChecked +
                            "\n - Python: " + pythonChecked +
                            "\n - Nivel de Estudios: " + nivelEstudios;

            JOptionPane.showMessageDialog(ExamenFinal.this, mensaje, "Información del Formulario",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        // Funcion del boton de cerrar
        botonCerrar.addActionListener(e -> {
            // Abrimos ventana de agradecimiento
            mostrarVentanaAgradecimiento();
        });

        // Funcion del boton de cargar curriculum
        botonCargarCurriculum.addActionListener(e -> {
            // Lógica para cargar el currículum
            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showOpenDialog(ExamenFinal.this);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File archivoSeleccionado = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(ExamenFinal.this,
                        "Curriculum cargado: " + archivoSeleccionado.getName(), "Curriculum Cargado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    // Funcion de mostrar la ventana de agradecimiento
    private void mostrarVentanaAgradecimiento() {
        JDialog dialogoAgradecimiento = new JDialog(ExamenFinal.this, "Agradecimiento", true);
        dialogoAgradecimiento.getContentPane().setLayout(new BorderLayout());

        JLabel labelAgradecimiento = new JLabel("Gracias por usar nuestro programa!.");
        labelAgradecimiento.setHorizontalAlignment(SwingConstants.CENTER);

        JButton botonAceptar = new JButton("Aceptar (Salir)");
        botonAceptar.addActionListener(e -> {
            // Cerrar la ventana de agradecimiento
            dialogoAgradecimiento.dispose();

            // Cerrar la aplicación
            System.exit(0);
        });

        JPanel panelAgradecimiento = new JPanel();
        panelAgradecimiento.add(labelAgradecimiento);

        JPanel panelBoton = new JPanel();
        panelBoton.add(botonAceptar);

        dialogoAgradecimiento.getContentPane().add(panelAgradecimiento, BorderLayout.CENTER);
        dialogoAgradecimiento.getContentPane().add(panelBoton, BorderLayout.SOUTH);

        dialogoAgradecimiento.setSize(300, 150);
        dialogoAgradecimiento.setLocationRelativeTo(ExamenFinal.this);
        dialogoAgradecimiento.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExamenFinal ventana = new ExamenFinal();
            ventana.setVisible(true);
        });
    }
}
