package org.example.PatronesCreacionales.Builder;

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        Product product = new ProductBuilder()
                .setAttribute1("Value1")
                .setAttribute2(42)
                .build();

        // Ahora se tiene un objeto Product configurado según las especificaciones proporcionadas.

        System.out.println(product.getAttribute1());
        System.out.println(product.getAttribute2());

    }
}