package vtx.joptionpane;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        UIManager.put("OptionPane.yesButtonText","Claro que si Guapi");
        UIManager.put("OptionPane.noButtonText","No no");
        UIManager.put("OptionPane.cancelButtonText","Cancer");
        UIManager.put("OptionPane.okButtonText","Chachi");

        int opcion = 123;
        String name = null;

        while (name == null || name.replace(" ","").equals("")) {
            name = JOptionPane.showInputDialog(null,"Pon tu nombre pesao");
        }
        JOptionPane.showMessageDialog(null,"Voy a Hackearte " + name + "!","Hack",JOptionPane.ERROR_MESSAGE);
        while (opcion != 0) {
            opcion = JOptionPane.showConfirmDialog(null,"¿Quieres continuar?","Confirmar",JOptionPane.YES_NO_CANCEL_OPTION);
            if (opcion != 0) {
                JOptionPane.showMessageDialog(null,"Te fastidias, ahora aceptas");
            }
        }

        JOptionPane.showMessageDialog(null,"Carpeta System32 eliminada.\n Reiniciando Sistema.","Explorador de Archivos",JOptionPane.ERROR_MESSAGE);


    }

}
