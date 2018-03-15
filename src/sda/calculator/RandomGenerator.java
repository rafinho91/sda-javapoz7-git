package sda.calculator;

import java.util.Random;

public class RandomGenerator {
    private Random random;

    public RandomGenerator(Random random) {
        this.random = random;
    }

    public int getSmallNumber() {
        return random.nextInt(10);
    }

    public int getBigNumber() {
        return random.nextInt(100);
    }
}
