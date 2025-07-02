package application;

import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as informações do produto: ");
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        Double price = sc.nextDouble();
        System.out.print("quantity em estoque: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Informações do produto: " + product);
        System.out.println();
        System.out.print("Digite o número de unidades para entrar no estoque: ");
        quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Informações atualizas para: " + product);
        System.out.println();
        System.out.print("Digite o número de unidades para sair do estoque: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Informações atualizas para: " + product);

        /*utilização dos métodos set para alterar as informações do produto.
         * Caso eu quisesse utilizar o get seria: System.out.println("Informações atualizas para: " + product.getName());
        */
        
        System.out.println();
        System.out.println("Deseja alterar o produto? (s/n)");
        char nameResponse = sc.next().charAt(0);;
        if (nameResponse == 's'){
            System.out.println();
            System.out.print("Digite o nome do produto: ");
            String newProduct = sc.next();
            product.setName(newProduct);
        } 

        System.out.println();
        System.out.println("Deseja alterar o preço do produto? (s/n)");
        char priceResponse = sc.next().charAt(0);
        if (priceResponse == 's'){
            System.out.println();
            System.out.print("Digite o preço do produto: ");
            Double newPrice = sc.nextDouble();
            product.setPrice(newPrice);
        }

        System.out.println();
        System.out.println("Informações atualizas para: " + product);

        sc.close();
    }

}
