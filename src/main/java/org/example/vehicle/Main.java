package org.example.vehicle;

import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Car firstCar = new Car();
        Bicycle firstBicycle = new Bicycle();

        Vehicle[] racers = {firstBicycle, firstCar};

        for (Vehicle x : racers) {
            x.go();
        }

    }
}
