/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temporizador.modelo;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Ermes
 */
public class TemporizadorBackend {
    private long tiempoTranscurrido;
    private Timer temporizador;
    private boolean enEjecucion;

    public TemporizadorBackend() {
        tiempoTranscurrido = 0;
        enEjecucion = false;
    }

    public void iniciar() {
        System.out.print("Has llamado el método iniciar");
        if (!enEjecucion) {
            temporizador = new Timer();
            temporizador.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    tiempoTranscurrido += 10; // Incrementar el tiempo en centésimas de segundo
                    // Notificar a la vista para actualizar la visualización del tiempo
                }
            }, 0, 10); // Actualizar cada 10 milisegundos
            enEjecucion = true;
        }
    }

    public void pausar() {
        if (enEjecucion) {
            temporizador.cancel();
            enEjecucion = false;
        }
    }

    public void reiniciar() {
        pausar();
        tiempoTranscurrido = 0;
        // Notificar a la vista para restablecer la visualización del tiempo
    }

    public long getTiempoTranscurrido() {
        return tiempoTranscurrido;
    }
}
