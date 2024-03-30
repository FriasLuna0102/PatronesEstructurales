package org.example.PatronesEstructurales.Adapter;

public class Cliente {
    public static void main(String[] args) {
        Incompatible incompatible = new Incompatible();
        Target adapter = new Adapter(incompatible);

        System.out.println("Cliente: Ejecutando petición a través del Adapter");
        adapter.request();
    }
}