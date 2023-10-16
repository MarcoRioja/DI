package vtx.joptionpane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        String name = null;
        byte confirm = 1;
        while (confirm != 0) {
            confirm = (byte) JOptionPane.showConfirmDialog(null,"Estas deacuerdo con vender todos tus datos por un precio insignificante a este ordenador?");
            if (confirm != 0) {JOptionPane.showMessageDialog(null,"No te vas hasta que aceptes!");}
        }
        while (name == null || name.replace(" ","").equals("")){
            name = JOptionPane.showInputDialog(null,"Introduce tu nombre");
        }
        JOptionPane.showMessageDialog(null,"Muchas Gracias " + name + " por vendernos tus datos!");
    }
}