package org.example.vehicle;

public class Bicycle extends Vehicle {
    int wheels = 2;
    int pedals = 2;

    @Override
    void go(){
        System.out.println("the bicycle is going");

    }
}
