package com.mercadolivre;

public class Basico extends Conta {

    @Override
    public void consultaDeSaldo() {
        super.consultaDeSaldo();
        super.transacaoOk();
    }

    @Override
    public void pagamentoDeServicos() {
        super.pagamentoDeServicos();
        super.transacaoOk();
    }

    @Override
    public void saqueEmDinheiro() {
        super.saqueEmDinheiro();
        super.transacaoOk();
    }

    @Override
    public void transferencia() {
        System.out.println("Transação de Transferência não permitida para categoria Básico.");
        super.transacaoNaoOk();
    }

    @Override
    public void deposito() {
        System.out.println("Transação de Depósito não permitida para categoria Básico.");
        super.transacaoNaoOk();
    }
}
