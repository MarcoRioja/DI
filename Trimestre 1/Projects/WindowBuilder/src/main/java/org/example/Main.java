package org.example;

import org.example.Ventanas.VentanaConMetodos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VentanaConMetodos ventana = new VentanaConMetodos();
        ventana.InicializarVentana();

        ArrayList<String> nombre = new ArrayList<String>();
        nombre.add("Aceptar");
        nombre.add("Cancelar");
        nombre.add("Volver");

        int posX = 50;
        for (int i = 0; i < 3; i++) {
            ventana.agregarBoton(nombre.get(i), posX, 50);
            posX += 100;
        }

        ventana.agregarBotonRedimensionar(200,200,ventana);
    }
}
