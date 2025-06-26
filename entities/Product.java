package entities;

public class Product {
    
    public String nome;
    public Double preco;
    public int quantidade;

    public Double totalValueStock(){
        return preco * quantidade;
    }

    public void addProduct(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProduct(int quantidade){
        this.quantidade -= quantidade;
    }
    
    public String toString(){
        return nome + ", R$ " + String.format("%.2f", preco) + ", " + quantidade + " Unidades, Total em estoque: R$ " + String.format("%.2f",totalValueStock());
    }
}
