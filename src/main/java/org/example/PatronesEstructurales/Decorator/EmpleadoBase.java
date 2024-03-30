package org.example.PatronesEstructurales.Decorator;

// Implementación básica de Empleado
class EmpleadoBase implements Empleado {
    private String name;

    public EmpleadoBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}