package com.mercadolivre;

public class Conta implements Transacao{

    public void deposito() {
        System.out.println("Iniciando depósito...");
    }

    public void transferencia() {
        System.out.println("Iniciando transferência...");
    }

    public void saqueEmDinheiro() {
        System.out.println("Sacando dinheiro...");
    }

    public void consultaDeSaldo() {
        System.out.println("Consultando o saldo...");
    }

    public void pagamentoDeServicos() {
        System.out.println("Realizando pagamento...");
    }


    @Override
    public void transacaoOk() {
        System.out.println("Transação realizada com sucesso!");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Erro ao realizar transação.");
    }
}
