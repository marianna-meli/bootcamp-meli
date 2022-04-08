package com.mercadolivre;

public class Main {

    public static void main(String[] args) {
        //Exercício 1 - A
        int a = 0;
        int b = 300;

        try {
            System.out.println(b / a);
        } catch (Exception exception) {
            System.out.println("Ocorreu um erro.");
        } finally {
            System.out.println("Programa finalizado.");
        }

        System.out.println("---------------------------");

        //Exercício 1 - B
        try {
            if (a == 0 || b == 0) {
                throw new IllegalArgumentException("Não pode ser divido por zero.");
            } else {
                System.out.println(b / a);
            }

        } catch (IllegalArgumentException illegalException) {
            System.out.println(illegalException.getMessage());
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}
