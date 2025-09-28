/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter.square;

/**
 *
 * @author JL
 */
/**
 * Las PiezasCuadradas no son compatibles 
 * con los AgujerosRedondos.
 */
public class PiezaCuadrada {
    private double ancho;
    
    //Constructor de la pieza cuadrada.
    public PiezaCuadrada(double ancho) {
        this.ancho = ancho;
    }
    // Devuelve el ancho del cuadrado.
    public double getAncho() {
        return ancho;
    }
}