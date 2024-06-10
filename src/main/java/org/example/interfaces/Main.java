package org.example.interfaces;

public class Main {
    public static void main(String[] args) {
        Rabbit myRabbit = new Rabbit();
        myRabbit.flee();
        Hawk myHawk = new Hawk();
        myHawk.hunt();
        Fish myFish = new Fish();
        myFish.flee();
        myFish.hunt();
    }
}
