package org.example.PatronesEstructurales.Bridge;

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Dibujando cuadrado. ");
        color.applyColor();
    }
}
