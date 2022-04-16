package com.mercadolivre;

public class Banco {

    public static void main(String[] args) {

        System.out.println("------------------------------");
        System.out.println("Categoria: Cobradores");
        Cobradores cobradores = new Cobradores();
        System.out.println("");
        cobradores.consultaDeSaldo();
        System.out.println("");
        cobradores.saqueEmDinheiro();
        System.out.println("");
        cobradores.pagamentoDeServicos();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("------------------------------");
        System.out.println("Categoria: Básico");
        Basico basico = new Basico();
        System.out.println("");
        basico.consultaDeSaldo();
        System.out.println("");
        basico.pagamentoDeServicos();
        System.out.println("");
        basico.saqueEmDinheiro();
        System.out.println("");
        basico.transferencia();
        System.out.println("");
        System.out.println("------------------------------");

        System.out.println("------------------------------");
        System.out.println("Categoria: Executivos");
        Executivos executivos = new Executivos();
        System.out.println("");
        executivos.deposito();
        System.out.println("");
        executivos.transferencia();
        System.out.println("");
        executivos.saqueEmDinheiro();
        System.out.println("");
        System.out.println("------------------------------");
    }
}
