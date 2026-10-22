package Taller11.Ejercicio2;

public class Instancias {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Carlos", 3000, 1000);
        gerente.mostrarDetalles();

        Empleado vendedor = new Vendedor("Ana", 1500, 5000, 0.10);
        vendedor.mostrarDetalles();
    }
}
