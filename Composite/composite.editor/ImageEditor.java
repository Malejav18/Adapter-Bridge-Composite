/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package composite.editor;

/**
 * 
 * @author Lopez, Vargas
 * 
 * Utiliza Swing y AWT para mostrar figuras simples y compuestas,
 * permitiendo su selección y actualización en un lienzo.
 * 
 * ImageEditor actúa como cliente del patrón Composite.
 */

import composite.shapes.CompoundShape;
import composite.shapes.Shape;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImageEditor {
    private EditorCanvas canvas; // Lienzo
    private CompoundShape allShapes = new CompoundShape(); // Composición raíz que contiene todas las figuras cargadas

    public ImageEditor() { // inicializa el lienzo
        canvas = new EditorCanvas();
    }

    public void loadShapes(Shape... shapes) { // Carga una lista de figuras en el editor
        allShapes.clear();       // Se eliminan figuras previas
        allShapes.add(shapes);   // Se agregan las nuevas
        canvas.refresh();        // Se actualiza el lienzo
    }

    private class EditorCanvas extends Canvas { // responsable de renderizar las figuras en pantalla
        JFrame frame;  // Ventana principal del editor

        private static final int PADDING = 10; // Espaciado alrededor del contenido

        EditorCanvas() { // crea la ventana y configura el evento de clic
            createFrame();
            refresh();

            // Evento de clic: deselecciona todas las figuras y selecciona la figura clicada
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    allShapes.unSelect();                       // Deseleccionar todas
                    allShapes.selectChildAt(e.getX(), e.getY()); // Seleccionar figura bajo el clic
                    e.getComponent().repaint();                 // Redibujar
                }
            });
        }

        void createFrame() { //
            frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            // Panel con bordes para dar padding
            JPanel contentPanel = new JPanel();
            Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
            contentPanel.setBorder(padding);
            frame.setContentPane(contentPanel);

            // Se añade el lienzo al frame
            frame.add(this);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        }

        public int getWidth() { // Calcula el ancho del lienzo en función del tamaño de las figuras
            return allShapes.getX() + allShapes.getWidth() + PADDING;
        }

        public int getHeight() { // Calcula la altura del lienzo en función del tamaño de las figuras
            return allShapes.getY() + allShapes.getHeight() + PADDING;
        }

        void refresh() { // Ajusta el tamaño del lienzo y actualiza la ventana
            this.setSize(getWidth(), getHeight());
            frame.pack();
        }

        public void paint(Graphics graphics) { // Dibuja todas las figuras en el lienzo
            allShapes.paint(graphics);
        }
    }
}
