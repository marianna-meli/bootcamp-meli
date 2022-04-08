package com.mercadolivre;

public class Main {

    public static void main(String[] args) {

        //Exercício 4
        Person mari = new Person();
        Person lidi = new Person("Lidiane", 27, "Namorada");

        int imc = mari.calculateIMC(90, 1.76);
        if (imc == -1) {
            System.out.println("A Mari está abaixo do peso. :S ");
        } else if (imc == 0) {
            System.out.println("A Mari está no peso ideal! :) ");
        } else if (imc == 1) {
            System.out.println("A Mari está acima do peso. :(");
        }

        boolean ofAge = mari.ofAge(27);
        if (ofAge) {
            System.out.println("A Mari é maior de idade! ");
        } else {
            System.out.println("A Mari não é maior de idade.");
        }

        System.out.println(mari.toString());
        System.out.println(lidi.toString());

        //###################

        Person marianna = new Person("Marianna", 27, "Estudante", 90, 1.76);
        int imc2 = marianna.calculateIMC(marianna.getWeight(), marianna.getHeight());
        if (imc2 == -1) {
            System.out.println("A Marianna está abaixo do peso. :S ");
        } else if (imc2 == 0) {
            System.out.println("A Marianna está no peso ideal! :) ");
        } else if (imc2 == 1) {
            System.out.println("A Marianna está acima do peso. :(");
        }

        boolean ofAge2 = marianna.ofAge(marianna.getAge());
        if (ofAge2) {
            System.out.println("A Marianna é maior de idade! ");
        } else {
            System.out.println("A Marianna não é maior de idade.");
        }

        System.out.println(marianna.toString());

    }
}
