package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;


public class Program {



    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*Calculator calc = new Calculator(); essa instaciação não é necessaria para chamar a calculator, pois como as métodos e variaveis
        lá são estaticos não é necessaria instaciar*/

        System.out.println("informe o raio");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius); /* so precisa colocar o nome da classe neste caso de static para chamar o método*/

        double v = Calculator.volume(radius);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor do PI: %.2f%n", Calculator.PI);

        sc.close();
        }

}
