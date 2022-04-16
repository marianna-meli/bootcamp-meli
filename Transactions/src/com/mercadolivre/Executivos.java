package com.mercadolivre;

public class Executivos extends Conta{

    @Override
    public void deposito() {
        super.deposito();
        super.transacaoOk();
    }

    @Override
    public void transferencia() {
        super.transferencia();
        super.transacaoOk();
    }

    @Override
    public void saqueEmDinheiro() {
        System.out.println("Transação de Saque não permitida para categoria Executivos.");
        super.transacaoNaoOk();
    }

    @Override
    public void consultaDeSaldo() {
        System.out.println("Transação de Consulta de Saldo não permitida para categoria Executivos.");
        super.transacaoNaoOk();
    }

    @Override
    public void pagamentoDeServicos() {
        System.out.println("Transação de Pagamento de Serviços não permitida para categoria Executivos.");
        super.transacaoNaoOk();
    }
}
