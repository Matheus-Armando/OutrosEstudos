
package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vetor = new Product[n];

        System.out.println("Enter product data: ");
        for(int i =0; i<n; i++) {
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity in stock: ");
            int quantity = sc.nextInt();
            vetor[i] = new Product(name, price, quantity);
        }

        /*Product product = new Product(name, price, quantity);

        System.out.println("\nProduct data: " + product);

        System.out.print("\nEnter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);


        System.out.println("\nUpdated data: " + product);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("\nUpdated data: " + product);
        sc.close();*/
    }
}

