package org.example.vehicle;

public abstract class Vehicle {

    String name;
    double speed;

    Vehicle(){

    }
    Vehicle(String name) {
        this.name = name;
    }

    abstract void go();
}
