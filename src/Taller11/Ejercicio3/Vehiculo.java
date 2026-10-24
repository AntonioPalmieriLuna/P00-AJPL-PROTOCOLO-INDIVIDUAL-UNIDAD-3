package Taller11.Ejercicio3;

public abstract class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método concreto en clase abstracta: las clases hijas no están obligadas a sobrescribirlo
    public void acelerar() {
        System.out.println("El vehiculo acelera");
    }
}
