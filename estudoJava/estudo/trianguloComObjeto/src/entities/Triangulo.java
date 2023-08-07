package entities;

public class Triangulo {
    public double ladoA;
    public double ladoB;
    public double ladoC;

    public double calcularArea(){
        double perimetro = (ladoA + ladoB + ladoC) / 2.0;
        double result = Math.sqrt(perimetro * (perimetro - ladoA) * (perimetro - ladoB) * (perimetro - ladoC));

        return result;
    }
}
