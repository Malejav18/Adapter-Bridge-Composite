/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Devices;

/**
 *
 * @author Lopez, Vargas
 * 
 * Representa un dispositivo concreto que puede ser 
 * controlado por un control remoto (abstracción).

 * Define el comportamiento específico de la radio.
 */
    
public class Radio implements Device {
    // Atributos internos del dispositivo
    private boolean on = false; // Estado de encendido/apagado
    private int volume = 30;    // Volumen inicial (0 a 100)
    private int channel = 1;    // Canal inicial

    // Métodos de la interfaz Device implementados
    @Override
    public boolean isEnabled() { // Indica si la radio está encendida
        return on;
    }

    @Override
    public void enable() { //Enciende la radio
        on = true;
    }

    @Override
    public void disable() { // Apaga la radio
        on = false;
    }

    @Override
    public int getVolume() { // Devuelve el volumen actual
        return volume;
    }

    @Override
    public void setVolume(int volume) { // Cambia el volumen de la radio
        if (volume > 100) {
            this.volume = 100;   // No puede superar 100
        } else if (volume < 0) {
            this.volume = 0;     // No puede ser negativo
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() { // Devuelve el canal actual
        return channel;
    }

    @Override
    public void setChannel(int channel) { // Cambia el canal
        this.channel = channel;
    }

    @Override
    public void printStatus() { // Muestra en consola el estado actual
        System.out.println("------------------------------------");
        System.out.println("| I'm radio.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
