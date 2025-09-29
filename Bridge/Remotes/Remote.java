/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Remotes;

/**
 *
 * @author maleja
 * 
 * Interfaz Remote que define las operaciones básicas de un control remoto.
 * 
 * Esta interfaz actúa como la abstracción delegando las 
 * operaciones reales a las implementaciones concretas de dispositivos.
 */

public interface Remote {
    void power(); // Alterna el estado de encendido y apagado

    void volumeDown(); // Disminuye el volumen

    void volumeUp(); // Aumenta el volumen

    void channelDown(); // Cambia al canal anterior

    void channelUp(); // Cambia al canal siguiente
}
