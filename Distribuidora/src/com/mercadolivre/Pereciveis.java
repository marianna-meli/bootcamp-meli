package com.mercadolivre;

public class Pereciveis extends Produto {
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        if(this.diasParaVencer == 1) {
            return super.calcular(quantidadeDeProdutos) / 4;
        }
        if(this.diasParaVencer == 2) {
            return super.calcular(quantidadeDeProdutos) / 3;
        }
        if(this.diasParaVencer == 3) {
            return super.calcular(quantidadeDeProdutos) / 2;
        }
        return super.calcular(quantidadeDeProdutos);
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Perecíveis, dias para vencer: " + diasParaVencer;

    }
}
