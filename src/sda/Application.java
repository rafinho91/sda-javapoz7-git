package sda;

// tworzymy nowy branch na githubie
// git pull
// git checkout >nazwa nowego brancha<

import sda.calculator.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5,10));
    }
}
