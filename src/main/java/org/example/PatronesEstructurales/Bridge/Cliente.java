package org.example.PatronesEstructurales.Bridge;

// Cliente
public class Cliente {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        Shape blueSquare = new Square(new Blue());

        redCircle.draw();
        blueSquare.draw();
    }
}