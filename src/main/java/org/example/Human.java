package org.example;

public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        System.out.println("Human constructor is called");
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking");
    }
}
