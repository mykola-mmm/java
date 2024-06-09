package org.example;

public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    public String toString() {
        String myString = "The pizza consists from " + this.bread + ", " + this.sauce + ", " + this.cheese + " and " + this.topping;
        return myString;
    }
}