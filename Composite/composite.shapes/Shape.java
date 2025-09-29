/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite.shapes;

/**
 *
 * Interfaz Shape que define el contrato para todas las figuras
 * 
 * Cada clase que implemente esta interfaz
 * debe proporcionar comportamiento para los metodos
 * 
 * @author Lopez, Vargas
 */
import java.awt.*;

public interface Shape {
    int getX(); // retorna coordenada de x
    int getY(); // retorna coordenada de y
    int getWidth(); // retorna ancho de la figura
    int getHeight(); // retorna alto de la figura
    void move(int x, int y); // mueve la figura
    boolean isInsideBounds(int x, int y); // verifica que se encuentre dentro de los limites
    void select(); // marca la figura como seleccionada
    void unSelect(); // deselecciona la figura
    boolean isSelected(); // indica si la figura esta seleccionada
    void paint(Graphics graphics); // dibujar la figura
}