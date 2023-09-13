/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temporizador.controlador;
import temporizador.modelo.TemporizadorBackend;
import temporizador.modelo.TiempoMedido;
import temporizador.vista.TemporizadorGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ermes
 */

public class TemporizadorController {
    private TemporizadorBackend backend;
    private TemporizadorGUI gui;

    public TemporizadorController(TemporizadorBackend modelo, TemporizadorGUI vista) {
        this.backend = modelo;
        this.gui = vista;

        // Configurar escuchadores de eventos para los botones de la gui
        gui.getIniciarBtn().addActionListener(new IniciarListener());
        gui.getPausarBtn().addActionListener(new PausarListener());
        gui.getReiniciarBtn().addActionListener(new ReiniciarListener());
        gui.getGuardarBtn().addActionListener(new GuardarListener());
    }

    class IniciarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            backend.iniciar();
        }
    }

    class PausarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            backend.pausar();
        }
    }

    class ReiniciarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            backend.reiniciar();
        }
    }

    class GuardarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Lógica para guardar el tiempo medido con una descripción
        }
    }
}
