package org.example.PatronesEstructurales.Facade;

// Fachada para simplificar la interacción con la biblioteca de imágenes
class Facade {
    private ImageLibrary imageLibrary;

    public Facade() {
        this.imageLibrary = new ImageLibrary();
    }

    public void processImage(String filename, String filterType, int brightnessLevel) {
        imageLibrary.loadImage(filename);
        imageLibrary.applyFilter(filterType);
        imageLibrary.adjustBrightness(brightnessLevel);
    }
}