package org.example.PatronesEstructurales.Decorator;

// Decorador con lógica específica para convertir la primera letra en mayúscula
class MayusculaDecorator extends EmpleadoDecorator {
    public MayusculaDecorator(Empleado empleado) {
        super(empleado);
    }

    @Override
    public String getName() {
        String name = super.getName();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}