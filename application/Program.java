package application;

import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Digite as informações do produto: ");
        System.out.print("Nome: ");
        product.nome = sc.nextLine();
        System.out.print("Preço: ");
        product.preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        product.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Informações do produto" + product);
        System.out.println();
        System.out.println("Digite o número de unidades para entrar no estoque");
        int quantidade = sc.nextInt();
        product.addProduct(quantidade);

        System.out.println();
        System.out.println("Informações atualizas para: " + product);
        System.out.println();
        System.out.println("Digite o número de unidades para sair do estoque");
        quantidade = sc.nextInt();
        product.removeProduct(quantidade);
        System.out.println();
        System.out.println("Informações atualizas para: " + product);

        sc.close();
    }

}
