package sda;

// tworzymy nowy branch na githubie
// git pull
// git checkout >nazwa nowego brancha<
//git merge >nazwa galezi do domerdzowania, trzeba byc na tej ostatecznej
//git stash  git stash pop

import sda.calculator.Calculator;
import sda.calculator.RandomGenerator;

public class Application {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.sum(5,10));
        System.out.println(myCalculator.divide(5,10));
        System.out.println(myCalculator.subtract(5,10));
        System.out.println(myCalculator.multiply(5,10));
        System.out.println(myCalculator.divide(5,0));

        RandomGenerator randomGenerator = new RandomGenerator();
        System.out.println(randomGenerator.getBigNumber());
        System.out.println(randomGenerator.getSmallNumber());
        // git checkout -b factorial -> tworzy branch
        System.out.println("Factorial : " + myCalculator.factorial(3));
        System.out.println();
        System.out.println("blablabla");
    }

}
