package Taller12.Ejercicio1;

public class Ave implements Volador, Cantante{
    @Override
    public void volar(){
        System.out.println("El ave vuela");
    }

    @Override
    public void cantar(){
        System.out.println("El ave canta");
    }
}
