package entities;

public class Product {
    
    private String name;
    private Double price;
    private int quantity;

    public Product(String name, Double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(Double price){
        this.price = price;
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
