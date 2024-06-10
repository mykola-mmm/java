package org.example.encapsulation;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("12", "11", 10);
        System.out.println(myCar.getMake());
        System.out.println(myCar.getModel());
        System.out.println(myCar.getYear());
        Car secondCar = new Car("asd", "ads", 123);
        System.out.println(myCar);
        System.out.println(secondCar);
        Car copyCar = new Car("","", 0);
        System.out.println(secondCar);
        System.out.println(copyCar);
        copyCar.copy(secondCar);
        System.out.println(secondCar);
        System.out.println(copyCar);
        Car thirdCar = new Car(copyCar);
        System.out.println(thirdCar.getMake());
        System.out.println(thirdCar.getModel());
        System.out.println(thirdCar.getYear());
    }
}
