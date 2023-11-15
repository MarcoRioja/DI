package vtx.joptionpane;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Uso del JOptionPane.showConfirmDialog para abrir una ventana en la que aceptar o rechazar
        String text = null;
        int op = 0;
        while (op == 0) {
            text = null;
            while ( text == null || text.replace(" ","").equals("")) {
                text = JOptionPane.showInputDialog(null,"¿Cual es tu Nombre?","Info",JOptionPane.PLAIN_MESSAGE);
            }
            op = JOptionPane.showConfirmDialog(null,"Nombre: " + text + " ¿Quieres volver a escribir el nombre?");
        }
        JOptionPane.showMessageDialog(null,"Hello " + text + "!","Info",JOptionPane.PLAIN_MESSAGE);
    }

}
