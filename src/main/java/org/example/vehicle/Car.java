package org.example.vehicle;

public class Car extends Vehicle{
    public int wheels = 4;
    public int doors = 2;

    @Override
    void go() {
        System.out.println("the car is going");
    }
}
