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
 * Los AgujerosRedondos son compatibles con las PiezasRedondas.
 */
public class AgujeroRedondo {
    private double radio;
    //Constructor del agujero redondo
    public AgujeroRedondo(double radio) {
        this.radio = radio;
    }
    //Obtiene el radio del agujero.
    public double getRadio() {
        return radio;
    }
    /**
     * Verifica si una pieza redonda encaja dentro del agujero.
     * @param pieza Pieza redonda a evaluar.
     * @return true si encaja, false en caso contrario.
     */
    public boolean encaja(PiezaRedonda pieza) {
        boolean resultado;
        resultado = (this.getRadio() >= pieza.getRadio());
        return resultado;
    }
}
