package com.mercadolivre;

public class Cobradores extends Conta {

    @Override
    public void saqueEmDinheiro() {
        super.saqueEmDinheiro();
        super.transacaoOk();
    }

    @Override
    public void consultaDeSaldo() {
        super.consultaDeSaldo();
        super.transacaoOk();
    }

    @Override
    public void deposito() {
        System.out.println("Transação de Depósito não permitida para categoria Cobradores.");
        super.transacaoNaoOk();
    }

    @Override
    public void transferencia() {
        System.out.println("Transação de Transferência não permitida para categoria Cobradores.");
        super.transacaoNaoOk();
    }

    @Override
    public void pagamentoDeServicos() {
        System.out.println("Transação de Pagamento de Serviços não permitida para categoria Cobradores.");
        super.transacaoNaoOk();
    }
}
