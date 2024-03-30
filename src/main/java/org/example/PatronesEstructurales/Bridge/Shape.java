package org.example.PatronesEstructurales.Bridge;

// Abstracción
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}
