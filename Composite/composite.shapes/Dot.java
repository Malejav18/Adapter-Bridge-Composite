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

public class Dot extends BaseShape {
    private final int DOT_SIZE = 3; // Tamaño del punto

    public Dot(int x, int y, Color color) {
        // Llama al constructor de la clase BaseShape para inicializar
        super(x, y, color); // posición y el color
    }

    @Override
    public int getWidth() { // Retorna el ancho
        return DOT_SIZE;
    }

    @Override
    public int getHeight() { // Retorna la altura
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics) { // Dibuja el punto
        super.paint(graphics); // Llama al método paint de BaseShape para aplicar estilo (selección o no)
        graphics.fillRect(x - 1, y - 1, getWidth(), getHeight()); // Dibuja en las coordenadas x,y
    }
}