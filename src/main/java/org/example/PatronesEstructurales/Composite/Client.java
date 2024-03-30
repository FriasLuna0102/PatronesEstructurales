package org.example.PatronesEstructurales.Composite;

// Cliente
public class Client {
    public static void main(String[] args) {
        // Crear productos
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Mouse", 20);
        Product product3 = new Product("Keyboard", 50);

        // Crear cajas y añadir productos a ellas
        Box box1 = new Box();
        box1.addOrderItem(product1);
        box1.addOrderItem(product2);

        Box box2 = new Box();
        box2.addOrderItem(product3);
        box2.addOrderItem(product2);

        // Crear caja grande y añadir cajas a ella
        Box bigBox = new Box();
        bigBox.addOrderItem(box1);
        bigBox.addOrderItem(box2);

        // Calcular precio total del pedido
        double totalPrice = bigBox.getPrice();
        System.out.println("Precio total del pedido: $" + totalPrice);
    }
}