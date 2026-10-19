package Taller11.Ejercicio1;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        this.radio=radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public String getNombre(){
        return "Circulo";
    }
}
