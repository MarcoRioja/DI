package org.example.Windows;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Windows5WithMetdos2 extends JFrame {
    private JPanel panel;

    private void startWindow() {
        setSize(300, 300);
        setVisible(true);
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
    }

    private void addButton(String buttonName, int x, int y) {
        JButton button = new JButton(buttonName);
        button.setBounds(x, y, 100, 50); // Posici�n (x, y) y tama�o (ancho, alto) del bot�n en relaci�n al panel.
        panel.add(button);
        button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame newWindow=new JFrame("Nueva ventana");
				if (buttonName.equals("Redimensionar")) {
					newWindow.setSize(400, 500);
					newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					newWindow.add(new JLabel("has pulsado el boton otra dimension "));
					newWindow.setVisible(true);
                } else {	
				newWindow.setSize(200, 200);
				newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				newWindow.add(new JLabel("has pulsado el boton "+buttonName));
				newWindow.setVisible(true);
                }
			}
		});
        
        
    }
//a�adimos botones usando un bucle
    
    public static void main(String[] args) {
    	Windows5WithMetdos2 ventana=new Windows5WithMetdos2();
    	ventana.startWindow();
    	int y=50;
    	for (int i=1; i<4;i++) {
    	  		ventana.addButton("Boton "+i,50,y);
    		y=y+50;
    	}
    	ventana.addButton("Redimensionar",50,200);
    	
    	
    	
    
    
    }
}
