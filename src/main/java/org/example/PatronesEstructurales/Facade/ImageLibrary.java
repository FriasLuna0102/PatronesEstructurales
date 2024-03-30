package org.example.PatronesEstructurales.Facade;

// Biblioteca de procesamiento de imágenes
class ImageLibrary {
    public void loadImage(String filename) {
        System.out.println("Cargando imagen: " + filename);
    }

    public void applyFilter(String filterType) {
        System.out.println("Aplicando filtro: " + filterType);
    }

    public void adjustBrightness(int level) {
        System.out.println("Ajustando brillo: " + level);
    }

    // Otros métodos para manipular imágenes
}