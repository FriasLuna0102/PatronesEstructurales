package org.example.PatronesEstructurales.Composite;

import java.util.ArrayList;
import java.util.List;

// Nodo compuesto
class Box implements OrderItem {
    private List<OrderItem> items = new ArrayList<>();

    public void addOrderItem(OrderItem item) {
        items.add(item);
    }

    public void removeOrderItem(OrderItem item) {
        items.remove(item);
    }

    public double getPrice() {
        double totalPrice = 0;
        for (OrderItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}