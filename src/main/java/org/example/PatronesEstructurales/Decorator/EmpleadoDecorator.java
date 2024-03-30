package org.example.PatronesEstructurales.Decorator;

// Decorador EmpleadoDecorator
class EmpleadoDecorator implements Empleado {
    private Empleado empleado;

    public EmpleadoDecorator(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getName() {
        return empleado.getName();
    }
}