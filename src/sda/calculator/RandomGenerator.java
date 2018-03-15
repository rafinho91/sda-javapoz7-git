package sda.calculator;

import java.util.Random;

public class RandomGenerator {
    private Random random;

    randomGenarator
    public RandomGenerator() {
        this.random = new Random();


    }

    public int getSmallNumber() {
        return random.nextInt(10);
    }

    public int getBigNumber() {
    randomGenarator
        return random.nextInt(100) + 100;

    }
}
