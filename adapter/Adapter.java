/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adapter;

import com.mycompany.adapter.adapters.AdaptadorPiezaCuadrada;
import com.mycompany.adapter.round.AgujeroRedondo;
import com.mycompany.adapter.round.PiezaRedonda;
import com.mycompany.adapter.square.PiezaCuadrada;

/**
 *
 * @author JL
 */
public class Adapter {

    public static void main(String[] args) {
        // Caso base: redondo con redondo
        AgujeroRedondo agujero = new AgujeroRedondo(5);
        PiezaRedonda piezaRedonda = new PiezaRedonda(5);
        if (agujero.encaja(piezaRedonda)) {
            System.out.println("La pieza redonda de radio 5 encaja en el agujero redondo de radio 5.");
        }

        // Creamos piezas cuadradas
        PiezaCuadrada piezaCuadradaPequeña = new PiezaCuadrada(2);
        PiezaCuadrada piezaCuadradaGrande = new PiezaCuadrada(20);
        // agujero.encaja(piezaCuadradaPequeña); // ❌ No compila, son incompatibles.

        // Uso del adaptador para hacerlas compatibles
        AdaptadorPiezaCuadrada adaptadorPequeño = new AdaptadorPiezaCuadrada(piezaCuadradaPequeña);
        AdaptadorPiezaCuadrada adaptadorGrande = new AdaptadorPiezaCuadrada(piezaCuadradaGrande);

        if (agujero.encaja(adaptadorPequeño)) {
            System.out.println("La pieza cuadrada de ancho 2 encaja en el agujero redondo.");
        }
        if (!agujero.encaja(adaptadorGrande)) {
            System.out.println("La pieza cuadrada de ancho 20 NO encaja en el agujero redondo.");
        }
    }
}
