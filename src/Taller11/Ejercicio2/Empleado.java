package Taller11.Ejercicio2;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + "\n"+
                "Salario: " + calcularSalario());
    }

    public abstract double calcularSalario();
}
