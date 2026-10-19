package Taller11.Ejercicio1;

public abstract class Figura {

    public void mostrarArea(){
        System.out.println("El area del "+getNombre()+" es: "+calcularArea());
    }

    public abstract String getNombre();
    public abstract double calcularArea();
}
