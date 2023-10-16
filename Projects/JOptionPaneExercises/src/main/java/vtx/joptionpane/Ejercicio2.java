package vtx.joptionpane;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Uso del JOptionPane.showInputDialog para abrir una ventana para escribir texto
        String text = JOptionPane.showInputDialog(null,"¿Cual es tu Nombre?","Info",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello " + text + "!","Info",JOptionPane.PLAIN_MESSAGE);
    }

}
