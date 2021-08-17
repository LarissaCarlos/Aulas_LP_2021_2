package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner teclado = new Scanner(System.in);
        double preco;
        double porcentagem;
        double desconto;
        double precoComDesconto;

        System.out.println("Digite o valor do produto");
        preco = teclado.nextDouble();
        System.out.println("Digite a porcentagem do desconto");
        porcentagem = teclado.nextFloat();
        desconto = preco*porcentagem/100;
        precoComDesconto = preco-desconto;

        System.out.println("Valor do Produto: "+ preco);
        System.out.println("Valor do Desconto: "+ desconto);
        System.out.println("Valor do Produto com desconto: "+ precoComDesconto);

    }
}
