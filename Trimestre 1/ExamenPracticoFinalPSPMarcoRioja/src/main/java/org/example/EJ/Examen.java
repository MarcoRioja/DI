package org.example.EJ;

class Hilo_1 extends Thread implements Runnable {
    int step = 1;
    public Hilo_1() { }
    public Hilo_1(int nStep) { step = nStep; }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i+=step) {
            System.out.println(getName() + " -> " + i + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("La descarga " + getName() + " se ha completado.");
    }
}

public class Examen {
    public static void main(String[] args) {
        // Creamos los 3 hilos y le ponemos su nombre y prioridad
        Hilo_1 h1 = new Hilo_1();
        h1.setName("Descarga 1");
        h1.setPriority(Thread.NORM_PRIORITY);
        Hilo_1 h2 = new Hilo_1(2);
        h2.setName("Descarga 2");
        h2.setPriority(Thread.MIN_PRIORITY);
        Hilo_1 h3 = new Hilo_1(3);
        h3.setName("Descarga 3");
        h3.setPriority(Thread.MAX_PRIORITY);

        // Iniciamos los 3 hilos
        h1.start();
        h2.start();
        h3.start();

        // Unimos los 3 hilos para que el programa no continue hasta que terminen los 3
        try {
            h1.join();
            h2.join();
            h3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Una vez terminados imprimimos que todas las descargas han finalizado
        System.out.println("- Las descargas han finalizado. -");
    }
}
