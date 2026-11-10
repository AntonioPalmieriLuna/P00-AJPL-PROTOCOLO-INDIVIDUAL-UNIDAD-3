package Taller12.Ejercicio6;

// Mala práctica: Un carro no tiene comportamiento relevante para volar o nadar
/*
public class Carro implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El carro no vuela");
    }

    @Override
    public void nadar() {
        System.out.println("El carro no nada");
    }
}
*/

public class Carro {

    public void conducir() {
        System.out.println("El carro se conduce");
    }
}
