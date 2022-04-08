package com.mercadolivre;

public class Person {
    //Exercício 1
    private String name;
    private int age;
    private String id;
    private double weight;
    private double height;

    //Exercício 2
    public Person() {

    }

    public Person(String name, int age, String id) {

        this.name = name;
        this.age = age;
        this.id = id;

    }

    public Person(String name, int age, String id, double weight, double height) {

        this.name = name;
        this.age = age;
        this.id = id;
        this.weight = weight;
        this.height = height;
    }

    //Exercício 5
    public int calculateIMC(double weight, double height) {
        int returnImc = 0;
        double result = weight / Math.pow(height, 2);

        if (result < 20) {
            returnImc = -1;
        } else if (result >= 20 && result <= 25) {
            returnImc = 0;
        } else if (result > 25) {
            returnImc = 1;
        }

        return returnImc;

    }

    public boolean ofAge(int age) {
        boolean ofAge;

        if (age >= 18) {
            ofAge = true;
        } else {
            ofAge = false;
        }
        return ofAge;
    }

    @Override
    public String toString() {
        return "A Pessoa " +
                "tem o nome = " + name + '\'' +
                ", e a idade é = " + age +
                ", seu id é = '" + id + '\'' +
                ", seu peso é = " + weight +
                ", e sua altura é = " + height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
