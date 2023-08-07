package application;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Shift+F10 or click the green arrow button in the gutter to run the code.

// Press Shift+F9 to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Ctrl+F8.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite os lados do triangulo 1");
        x.ladoA = sc.nextDouble();
        x.ladoB = sc.nextDouble();
        x.ladoC = sc.nextDouble();

        System.out.println("Digite os lados do triangulo 2");
        y.ladoA = sc.nextDouble();
        y.ladoB = sc.nextDouble();
        y.ladoC = sc.nextDouble();

        double areaX = x.calcularArea();
        double areaY = y.calcularArea();

        if (areaX > areaY) {
            System.out.println("Triangulo 1 é maior");
        }
        else {
        System.out.println("Triangulo 2 é maior");}
    }
}

