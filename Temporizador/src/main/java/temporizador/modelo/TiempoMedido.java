/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temporizador.modelo;

/**
 *
 * @author Ermes
 */
public class TiempoMedido {
    private int horas;
    private int minutos;
    private int segundos;
    private int centesimas;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getCentesimas() {
        return centesimas;
    }

    public void setCentesimas(int centesimas) {
        this.centesimas = centesimas;
    }

    public TiempoMedido() {
        horas = 0;
        minutos = 0;
        segundos = 0;
        centesimas = 0;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d.%02d", horas, minutos, segundos, centesimas);
    }
}
