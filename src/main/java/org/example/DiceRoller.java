package org.example;
import java.util.Random;

public class DiceRoller {
    Random rand;
    int number;
    int sides;

    DiceRoller(int _sides) {
        this.sides = _sides;
        this.rand = new Random();

        roll();
    }

    void roll() {
        this.number = rand.nextInt(this.sides) + 1;
        System.out.println(this.number);
    }
}
