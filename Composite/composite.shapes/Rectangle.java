/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite.shapes;

/**
 *
 * Extiende de BaseShape, por lo que hereda posición, color,
 * control de selección y comportamiento común de las figuras.
 * 
 * @author Lopez, Vargas
 */
import java.awt.*;

public class Rectangle extends BaseShape {
    public int width;
    public int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        // Llama al constructor de la clase BaseShape para inicializar
        super(x, y, color); // posición y el color
        this.width = width; // Ancho
        this.height = height; // Alto
    }

    @Override
    public int getWidth() { // Retorna el ancho
        return width;
    }

    @Override
    public int getHeight() { // Retorna la altura
        return height;
    }

    @Override
    public void paint(Graphics graphics) { // Dibuja el rectangulo
        super.paint(graphics); // Llama al método paint de BaseShape para aplicar estilo (selección o no)
        graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1); // Dibuja en las coordenadas x,y
    }
}