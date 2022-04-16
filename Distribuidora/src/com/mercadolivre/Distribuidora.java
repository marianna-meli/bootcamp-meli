package com.mercadolivre;

import java.util.Scanner;

public class Distribuidora {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String nome;
        String tipo;
        double preco;
        double valorTotalPereciveis = 0;
        double valorTotalNaoPereciveis = 0;
        int daysToExpiration;
        int quantidadeDeProdutos;

        Pereciveis pereciveis[] = new Pereciveis[5];
        NaoPereciveis naoPereciveis[] = new NaoPereciveis[5];

        for(int i=0; i<5;i++) {
            System.out.println("Nome produto perecível: ");
            nome = scan.next();
            System.out.println("Preço produto perecível: ");
            preco = scan.nextDouble();
            System.out.println("Dias para vencer produto perecível: ");
            daysToExpiration = scan.nextInt();

            pereciveis[i] = new Pereciveis(nome, preco, daysToExpiration);
            System.out.println("Produto perecível adicionado.");

            System.out.println("Digite a quantidade do produto:");
            quantidadeDeProdutos = scan.nextInt();

            valorTotalPereciveis += pereciveis[i].calcular(quantidadeDeProdutos);

            System.out.println("Nome do produto não perecível: ");
            nome = scan.next();
            System.out.println("Preço do produto não perecível: ");
            preco = scan.nextDouble();
            System.out.println("Tipo do produto não perecível: ");
            tipo = scan.next();

            naoPereciveis[i] = new NaoPereciveis(nome, preco, tipo);
            System.out.println("Produto não perecível adicionado.");

            System.out.println("Digite a quantidade do produto: ");
            quantidadeDeProdutos = scan.nextInt();

            valorTotalNaoPereciveis += naoPereciveis[i].calcular(quantidadeDeProdutos);

        }
        System.out.println("Valor total produtos não perecíveis: R$" + valorTotalNaoPereciveis);
        System.out.println("Valor total produtos perecíveis: R$" + valorTotalPereciveis);
    }
}
