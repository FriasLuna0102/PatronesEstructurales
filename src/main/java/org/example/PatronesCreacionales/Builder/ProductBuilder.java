package org.example.PatronesCreacionales.Builder;

// Clase Builder
public class ProductBuilder {
    private Product product;

    public ProductBuilder() {
        this.product = new Product();
    }

    public ProductBuilder setAttribute1(String value) {
        this.product.setAttribute1(value);
        return this;
    }

    public ProductBuilder setAttribute2(int value) {
        this.product.setAttribute2(value);
        return this;
    }

    // Otros métodos para configurar los atributos...

    public Product build() {
        return this.product;
    }
}