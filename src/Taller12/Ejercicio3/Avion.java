package Taller12.Ejercicio3;

// Error de compilación: La clase Avion no implementa el metodo abstracto volar() de la interfaz Volador
/*
public class Avion implements Volador {

}
*/

public class Avion implements Volador {

    @Override
    public void volar() {
        System.out.println("El avion vuela");
    }
}
