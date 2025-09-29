/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Remotes;
import Devices.Device;

/**
 *
 * @author Lopez, Vargas
 * 
 * Control remoto avanzado
 * Hereda de BasicRemote y agrega funcionalidad extra
 */


public class AdvancedRemote extends BasicRemote {
    // Constructor que inicializa el control remoto avanzado con un dispositivo.
    public AdvancedRemote(Device device) {
        super.device = device; // Asigna el dispositivo a la clase base
    }

    public void mute() { // Silencia el dispositivo
        System.out.println("Remote: mute"); // Primero imprime un mensaje indicando la acción
        device.setVolume(0); // Modifica el volumen
    }
}
