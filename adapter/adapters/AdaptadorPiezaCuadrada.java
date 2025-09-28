/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter.adapters;

import com.mycompany.adapter.round.PiezaRedonda;
import com.mycompany.adapter.square.PiezaCuadrada;


/**
 *
 * @author JL
 */
/**
 * Actúa como un adaptador que permite que una PiezaCuadrada
 * se comporte como una PiezaRedonda y pueda ser evaluada
 * por un AgujeroRedondo mediante la herencia.
 */
public class AdaptadorPiezaCuadrada extends PiezaRedonda {
    private PiezaCuadrada pieza;
    /**
     * Constructor del adaptador.
     * @param pieza Pieza cuadrada a adaptar.
     */
    public AdaptadorPiezaCuadrada(PiezaCuadrada pieza) {
        this.pieza = pieza;
    }
    /**
     * Calcula el radio equivalente de la pieza cuadrada.
     * Se obtiene el radio del círculo mínimo que puede contener el cuadrado.
     * @return radio equivalente.
     */
    @Override
    public double getRadio() {
        double resultado;
        resultado = (Math.sqrt(Math.pow((pieza.getAncho() / 2), 2) * 2));
        return resultado;
    }
}
