package Taller13.Ejercicio1;

public abstract class Figura {
    public abstract double calcularArea();

    public void mostrarArea(){
        System.out.println("El area de la figura es: ");
        System.out.println(calcularArea());
    }
}
