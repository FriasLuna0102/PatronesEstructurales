package org.example.PatronesEstructurales.Composite;

// Hoja
class Product implements OrderItem {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}