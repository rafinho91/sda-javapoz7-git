package sda;

// tworzymy nowy branch na githubie
// git pull
// git checkout >nazwa nowego brancha<
//git merge >nazwa galezi do domerdzowania, trzeba byc na tej ostatecznej

import sda.calculator.Calculator;
import sda.calculator.RandomGenerator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(5,10));
        System.out.println(calculator.divide(5,10));
        System.out.println(calculator.subtract(5,10));
        System.out.println(calculator.multiply(5,10));
        System.out.println(calculator.divide(5,0));

        RandomGenerator randomGenerator = new RandomGenerator();
        System.out.println(randomGenerator.getBigNumber());
        System.out.println(randomGenerator.getSmallNumber());
    }
}
