package org.example.encapsulation;



public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        setMake(make);
        setModel(model);
        setYear(year);
    }

    Car(Car x){
        this.copy(x);
    }

    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car item) {
        this.setMake(item.getMake());
        this.setModel(item.getModel());
        this.setYear(item.getYear());
    }
}
