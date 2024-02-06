package entities;

public class Product {




    private String name;
    private double price;
    private int quantity;

    public Product() {
        /*contrutor padrão*/
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0; /*Opcional, pois caso não passe valor o java automaticamente definira como 0*/
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ " + String.format("%.2f", price)
                + ", " + quantity + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*public void setQuantity(int quantity) {
        this.quantity = quantity;
    } NÃO é feito o set da quantidade pois já existem 2 métodos para mudar o estoque (addQuantity e removeQuantity) assim
    não criar um set protege a quantidade de ser alterada sem estar usando os métodos apropriados
     */
}
