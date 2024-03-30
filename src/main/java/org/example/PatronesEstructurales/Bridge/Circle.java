package org.example.PatronesEstructurales.Bridge;

// Extensión de la jerarquía Shape
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Dibujando círculo. ");
        color.applyColor();
    }
}