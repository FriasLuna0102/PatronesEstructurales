package org.example.PatronesEstructurales.Decorator;


// Cliente
public class Cliente {
    public static void main(String[] args) {
        // Crear un empleado base
        Empleado empleado = new EmpleadoBase("juan");

        // Decorar el empleado para convertir la primera letra en mayúscula
        Empleado empleadoDecorado = new MayusculaDecorator(empleado);

        // Mostrar el nombre del empleado decorado
        System.out.println("Nombre del empleado: " + empleadoDecorado.getName());
    }
}