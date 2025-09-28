/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter.round;

/**
 *
 * @author JL
 */
/**
   * Representa una pieza circular que 
   * puede encajar en un AgujeroRedondo.
 */
public class PiezaRedonda {
    private double radio;
    //Constructor vacío
    public PiezaRedonda() {}
    
    //Constructor con el radio definido
    public PiezaRedonda(double radio) {
        this.radio = radio;
    }
    //Obtener el radio de la pieza
    public double getRadio() {
        return radio;
    }
}
