package Taller11.Ejercicio3;

public class Instancias {
    public static void main(String[] args) {
        // Intento de instanciación directa (Error de compilación: Vehiculo is abstract; cannot be instantiated):
        // Vehiculo vehiculoInvalido = new Vehiculo("Generico");

        Vehiculo vehiculo = new Bicicleta("BMX");
        vehiculo.acelerar();
    }
}
