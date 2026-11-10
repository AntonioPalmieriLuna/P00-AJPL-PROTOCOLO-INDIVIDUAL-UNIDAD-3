package Taller13.Ejercicio1;

public class InstanciasFiguras {
    void main(){
        Rectangulo rectangulo = new Rectangulo(5, 10);
        rectangulo.mostrarArea();

        Triangulo triangulo = new Triangulo(5, 10);
        triangulo.mostrarArea();
    }
}
