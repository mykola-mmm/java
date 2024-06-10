package org.example;

public class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        String myString = "This person name is " + this.name + " and he is " + this.age + " years old.";
        return myString;
    }
}
