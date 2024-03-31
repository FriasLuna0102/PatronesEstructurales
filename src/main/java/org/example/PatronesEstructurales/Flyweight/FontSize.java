package org.example.PatronesEstructurales.Flyweight;

// Clase concreta Flyweight que representa una fuente y tamaño de texto
class FontSize implements TextFormat {
    private String name;
    private int size;

    public FontSize(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void apply(String text) {
        System.out.println("Aplicando fuente '" + name + "' con tamaño " + size + " al texto: " + text);
    }
}
