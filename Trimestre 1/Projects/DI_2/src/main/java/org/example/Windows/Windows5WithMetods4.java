package org.example.Windows;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Windows5WithMetods4 extends JFrame {
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
        button.setBounds(x, y, 100, 50);
        panel.add(button);
        button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame newWindow=new JFrame("Nueva ventana");
				newWindow.setSize(200, 200);
				newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				newWindow.add(new JLabel("has pulsado el bot�n "+buttonName));
				newWindow.setVisible(true);
				
			}
		});
        
        
    }
    
    public static void main(String[] args) {
    	Windows5WithMetods4 window=new Windows5WithMetods4();
    	window.startWindow();
    	int y=50;
    	for (int i=1; i<4;i++) {
    	  		window.addButton("Boton "+i,50,y);
    		y=y+50;
    	}
    
    }
}
