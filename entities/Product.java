package entities;

public class Product {
    
    public String name;
    public Double price;
    public int quantity;

    public Product(String name, Double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Double totalValueStock(){
        return price * quantity;
    }

    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }
    
    public String toString(){
        return name + ", R$ " + String.format("%.2f", price) + ", " + quantity + " Unidades, Total em estoque: R$ " + String.format("%.2f",totalValueStock());
    }
}
