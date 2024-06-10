package org.example;

public class Hero extends Person{
    String power;
    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    @Override
    public String toString(){
        String myString = super.toString() + " The superpower is " + this.power;
        return myString;
    }
}
