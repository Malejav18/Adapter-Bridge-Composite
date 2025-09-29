/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lopez, Vargas
 * 
 * Método main para ejecutar y probar la implementación 
 * del patrón Bridge usando diferentes dispositivos (Tv, Radio) y diferentes 
 * controles remotos (BasicRemote, AdvancedRemote).
 */

import Devices.Device;
import Devices.Radio;
import Devices.Tv;
import Remotes.AdvancedRemote;
import Remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv()); // Pruebas con un televisor
        testDevice(new Radio()); // Pruebas con un radio
    }

    /**
     * Recibe cualquier dispositivo que implemente la interfaz device
     * Primero prueba el control remoto básico y luego el avanzado
     * muestra el estado del dispositivo.
     *
     * @param device instancia de un dispositivo concreto (Tv o Radio)
     */
    public static void testDevice(Device device) {
        // Prueba del control remoto básico
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device); // Se crea un control remoto básico para el dispositivo
        basicRemote.power(); // Enciende o apaga el dispositivo
        device.printStatus(); // Muestra en consola el estado actual del dispositivo

        // Prueba del control remoto avanzado
        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device); // Se crea un control remoto avanzado para el mismo dispositivo
        advancedRemote.power(); // Enciende o apaga el dispositivo
        advancedRemote.mute();  // Silencia el dispositivo
        device.printStatus();   // Muestra en consola el estado actual del dispositivo
    }
}
