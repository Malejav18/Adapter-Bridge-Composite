/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lopez, Vargas
 * 
 * Editor de imágenes que puede manejar figuras simples 
 * (círculos, rectángulos, puntos) como compuestas 
 * (grupos de figuras).
 * 
 * Permite tratar objetos simples y compuestos de la misma manera.
 * En este caso, las figuras simples se pueden 
 * agrupar en CompoundShape, que también se comporta como una figura.
 * 
 * La clase ImageEditor recibe estas figuras y las carga
 * en un "lienzo" para poder manipularlas de manera uniforme.
 */

import composite.editor.ImageEditor;
import composite.shapes.Circle;
import composite.shapes.CompoundShape;
import composite.shapes.Dot;
import composite.shapes.Rectangle;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor(); // Se crea el editor de imágenes, que actúa como "cliente"
        editor.loadShapes( // Se cargan figuras simples y compuestas dentro del editor
                new Circle(10, 10, 10, Color.BLUE), // Figura simple: círculo azul en la posición (10,10)
                new CompoundShape( // Figura compuesta: círculo rojo y un punto rojo
                    new Circle(110, 110, 50, Color.RED),
                    new Dot(160, 160, Color.RED)
                ),
                new CompoundShape( // Figura compuesta: rectángulo verde con puntos en cada esquina
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
