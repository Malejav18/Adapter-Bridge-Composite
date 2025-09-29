/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Devices;

/**
 *
 * @author maleja
 * 
 * Define las operaciones básicas que debe implementar 
 * cualquier dispositivo
 */

public interface Device {
    boolean isEnabled(); //Indica si el dispositivo está encendido o apagado

    void enable(); // Enciende el dispositivo

    void disable(); // Apaga el dispositivo

    int getVolume(); // Devuelve el volumen actual

    void setVolume(int percent); // Establece un nuevo nivel de volumen

    int getChannel(); // Devuelve el canal actual

    void setChannel(int channel); // Cambia el canal

    void printStatus(); // Imprime en consola el estado actual
}
