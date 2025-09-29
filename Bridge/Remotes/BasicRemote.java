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
 * Implementación de un control remoto básico
 * Clase que implementa la interfaz Remote.
 * 
 * Representa un control remoto básico que interactúa con un dispositivo 
 * mediante los métodos definidos en la interfaz Device.
 */

public class BasicRemote implements Remote {
    protected Device device; // Referencia al dispositivo que será controlado

    public BasicRemote() {} // Constructor vacío, útil si se quiere asignar el dispositivo después

    public BasicRemote(Device device) { // Constructor que inicializa el control remoto con un dispositivo específico
        this.device = device;
    }

    @Override
    public void power() { // Alterna el estado del dispositivo
        System.out.println("Remote: power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() { // Baja el volumen en 10 unidades
        System.out.println("Remote: volume down");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() { // Sube el volumen en 10 unidades
        System.out.println("Remote: volume up");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() { // Disminuye el canal actual en 1
        System.out.println("Remote: channel down");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() { // Aumenta el canal actual en 1
        System.out.println("Remote: channel up");
        device.setChannel(device.getChannel() + 1);
    }
}
