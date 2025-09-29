/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite.shapes;

/**
 * Extiende de BaseShape, por lo que hereda posición, color,
 * control de selección y comportamiento común de las figuras.
 *
 * @author Lopez, Vargas
 */
import java.awt.*;

public class Circle extends BaseShape {
    public int radius; // Radio del círculo
    
    public Circle(int x, int y, int radius, Color color) { 
    // Llama al constructor de la clase BaseShape para inicializar
        super(x, y, color); // posición y el color
        this.radius = radius;
    }

    @Override
    public int getWidth() { // Retorna el ancho
        return radius * 2;
    }

    @Override
    public int getHeight() { // Retorna la altura
        return radius * 2;
    }

    @Override
    public void paint(Graphics graphics) { // Dibuja el círculo
        super.paint(graphics); // Llama al método paint de BaseShape para aplicar estilo (selección o no)
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1); // Dibuja un óvalo en las coordenadas x,y
    }
}
