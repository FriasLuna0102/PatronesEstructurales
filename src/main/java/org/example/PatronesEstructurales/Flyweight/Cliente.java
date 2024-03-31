package org.example.PatronesEstructurales.Flyweight;

// Cliente que utiliza objetos Flyweight para aplicar formato de texto
public class Cliente {
    public static void main(String[] args) {
        TextFormatFactory factory = new TextFormatFactory();

        // Texto con diferentes formatos
        String texto1 = "Este es un texto con fuente Arial de tamaño 12";
        String texto2 = "Este es otro texto con fuente Arial de tamaño 12";
        String texto3 = "Un tercer texto con fuente Times New Roman de tamaño 14";

        // Aplicar formatos usando Flyweight
        TextFormat formato1 = factory.getFormat("Arial", 12);
        formato1.apply(texto1);

        TextFormat formato2 = factory.getFormat("Arial", 12);
        formato2.apply(texto2); // Reutiliza el objeto Flyweight existente

        TextFormat formato3 = factory.getFormat("Times New Roman", 14);
        formato3.apply(texto3);
    }
}
