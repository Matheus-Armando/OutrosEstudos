package Application;

import Entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Informe os dados do produto");
        System.out.println("Informe o nome do produto");
        produto.nome = sc.nextLine();
        System.out.println("Informe o preço do produto");
        produto.preco = sc.nextDouble();
        System.out.println("Informe a quantidade no estoque do produto");
        produto.quantidade = sc.nextInt();
        System.out.println("Informe a unidade no estoque do produto");
        produto.unidade = sc.nextLine();

        System.out.println(produto);
        }
    }
