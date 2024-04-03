package org.example.PatronesCreacionales.Builder;

public class Product {
    private String attribute1;

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }

    private int attribute2;
    // Otros atributos...

    public Product() {
        // Constructor vacío
    }

    // Métodos getters y setters para los atributos...
}
