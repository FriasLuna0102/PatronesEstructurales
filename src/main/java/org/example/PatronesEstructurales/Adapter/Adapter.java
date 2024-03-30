package org.example.PatronesEstructurales.Adapter;

class Adapter implements Target {
    private Incompatible incompatible;

    public Adapter(Incompatible incompatible) {
        this.incompatible = incompatible;
    }

    public void request() {
        System.out.println("Adapter: Adaptador invocando el método específico del Adaptee");
        incompatible.specificRequest();
    }
}
