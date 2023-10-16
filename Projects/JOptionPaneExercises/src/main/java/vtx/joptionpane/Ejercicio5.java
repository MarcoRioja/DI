package vtx.joptionpane;

import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        UIManager.put("OptionPane.yesButtonText","Claro que si Guapi");
        UIManager.put("OptionPane.noButtonText","No no");

        int opcion = JOptionPane.showConfirmDialog(null,"¿Quieres continuar?","Confirmar",JOptionPane.YES_NO_CANCEL_OPTION);

    }

}
