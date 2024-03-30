package org.example.PatronesEstructurales.Facade;

// Cliente
public class Cliente {
    public static void main(String[] args) {
        // Uso de la fachada para procesar una imagen
        Facade facade = new Facade();
        facade.processImage("imagen.jpg", "blanco y negro", 50);
    }
}
