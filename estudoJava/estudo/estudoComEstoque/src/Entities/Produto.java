package Entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;
    public String unidade;

    public double valorTotalEstoque(){
        double valorEstoque = preco * quantidade;
        
        return valorEstoque;
    }
    public void adicionaEstoque(int quantidade) {
        this.quantidade += quantidade;

    //this.quantidade serve para acessar a variavel declarada la em cima e nao parametro recebido no parenteses desta nova classe
    }
    public void removeEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return "Nome: " + nome +
                "\nPreço: R$" + String.format("%.2f", preco) +
                "\nQuantidade: "+ quantidade + " " + unidade +
                "\nValor do Estoque: " + String.format("%.2f",valorTotalEstoque());
    }
}
