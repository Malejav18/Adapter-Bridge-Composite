/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite.shapes;

/**
 * 
 * @author Lopez, Vargas
 * 
 * Define atributos y comportamientos comunes para todas las figuras gráficas
 *
 * Actúa como la clase base dentro del patrón Composite.
 */
import java.awt.*;

abstract class BaseShape implements Shape {
    public int x; // Posición en X de la figura
    public int y; // Posición en Y de la figura
    public Color color; // Color
    private boolean selected = false; // Indica si la figura está seleccionada
    
    BaseShape(int x, int y, Color color) { // inicializar una figura con posición y color
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Métodos de la interfaz Shape
    @Override
    public int getX() { // Obtener la posicion en X
        return x;
    }

    @Override
    public int getY() { // Obtener la posicion en Y
        return y;
    }

    @Override
    public int getWidth() { // ancho por defecto de una figura es 0
        return 0;
    }

    @Override
    public int getHeight() { // altura por defecto de una figura es 0
        return 0;
    }

    @Override
    public void move(int x, int y) { // Mueve la figura
        this.x += x;
        this.y += y;
    }

    @Override
    public boolean isInsideBounds(int x, int y) { // Verifica si un punto se encuentra dentro de los límites
        return x > getX() && x < (getX() + getWidth()) &&
               y > getY() && y < (getY() + getHeight());
    }

    @Override
    public void select() { // Marca la figura como seleccionada
        selected = true;
    }

    @Override
    public void unSelect() { // Desmarca la figura como seleccionada
        selected = false;
    }

    @Override
    public boolean isSelected() { // true si la figura está seleccionada
        return selected;
    }

    // Métodos auxiliares de renderizado
    void enableSelectionStyle(Graphics graphics) { // Activa el estilo visual de selección
        graphics.setColor(Color.LIGHT_GRAY);

        Graphics2D g2 = (Graphics2D) graphics;
        float[] dash1 = {2.0f};
        g2.setStroke(new BasicStroke(
                1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                2.0f, dash1, 0.0f
        ));
    }

    void disableSelectionStyle(Graphics graphics) { // Restaura el estilo visual normal de la figura
        graphics.setColor(color);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke());
    }

    @Override
    public void paint(Graphics graphics) { // Pinta la figura en el lienzo
        if (isSelected()) {
            enableSelectionStyle(graphics);
        } else {
            disableSelectionStyle(graphics);
        }
    }
}
