package Taller12.Ejercicio2;

public class Pez implements Nadador, Respirador{

    @Override
    public void nadar(){
        System.out.println("El pez nada");
    }

    @Override
    public void respirar(){
        System.out.println("El pez respira");
    }
}
