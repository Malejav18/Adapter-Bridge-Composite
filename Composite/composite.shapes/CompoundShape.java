/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Plantilla de licencia generada por NetBeans.
 */
package composite.shapes;

/**
 * Permite tratar grupos de figuras de la misma forma que figuras 
 * individuales y facilita operaciones.
 * 
 * @author Lopez, Vargas
 */
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape {
    protected List<Shape> children = new ArrayList<>(); // Lista de figuras hijas que la componen

    public CompoundShape(Shape... components) { // Constructor que permite inicializar el compuesto con una o más figuras
        super(0, 0, Color.BLACK);
        add(components);
    }

    public void add(Shape component) { // Añade una figura
        children.add(component);
    }
    
    public void add(Shape... components) { // Añade múltiples figuras
        children.addAll(Arrays.asList(components));
    }

    public void remove(Shape child) { // Elimina una figura
        children.remove(child);
    }

    public void remove(Shape... components) { // Elimina múltiples figuras
        children.removeAll(Arrays.asList(components));
    }

    public void clear() { // Elimina todas las figuras hijas
        children.clear();
    }

    @Override
    public int getX() { // Devuelve la coordenada X más pequeña entre todas las figuras hijas
        if (children.size() == 0) return 0;
        int x = children.get(0).getX();
        for (Shape child : children) {
            if (child.getX() < x) x = child.getX();
        }
        return x;
    }

    @Override
    public int getY() { // Devuelve la coordenada Y más pequeña entre todas las figuras hijas
        if (children.size() == 0) return 0;
        int y = children.get(0).getY();
        for (Shape child : children) {
            if (child.getY() < y) y = child.getY();
        }
        return y;
    }

    @Override
    public int getWidth() { // Calcula el ancho total del compuesto
        int maxWidth = 0;
        int x = getX();
        for (Shape child : children) {
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();
            if (childWidth > maxWidth) {
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    @Override
    public int getHeight() { // Calcula la altura total del compuesto
        int maxHeight = 0;
        int y = getY();
        for (Shape child : children) {
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    @Override
    public void move(int x, int y) { // Mueve todas las figuras hijas en la misma dirección
        for (Shape child : children) {
            child.move(x, y);
        }
    }

    @Override
    public boolean isInsideBounds(int x, int y) { // Verifica si un punto está dentro de alguna figura hija
        for (Shape child : children) {
            if (child.isInsideBounds(x, y)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void unSelect() { // Deselecciona el compuesto
        super.unSelect();
        for (Shape child : children) {
            child.unSelect();
        }
    }

    public boolean selectChildAt(int x, int y) { // Selecciona la figura hija en la posición (x, y) si existe
        for (Shape child : children) {
            if (child.isInsideBounds(x, y)) {
                child.select();
                return true;
            }
        }
        return false;
    }

    @Override
    public void paint(Graphics graphics) { // Dibuja el compuesto
        if (isSelected()) {
            enableSelectionStyle(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
            disableSelectionStyle(graphics);
        }

        for (Shape child : children) {
            child.paint(graphics);
        }
    }
}