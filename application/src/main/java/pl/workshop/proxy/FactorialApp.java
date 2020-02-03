package pl.workshop.proxy;

import pl.workshop.proxy.calculator.FactorialCalculatorCreator;

/**
 * Zmodyfikuj klasę FactorialCalculatorCreator tak, by jeżeli parametr caching ustawiony jest na true,
 * to zwracała instancję proxy SimpleFactorialCalculator, który posiada wbudowany cache dla obliczonych już silni.
 */

public class FactorialApp {

    public static void main(String[] args) {

        FactorialCalculator fc = FactorialCalculatorCreator.create(false);

        System.out.println("Number of digits in factorial of 1: " + String.valueOf(fc.calculate(1)).length());
        System.out.println("Number of digits in factorial of 100: " + String.valueOf(fc.calculate(100)).length());

        System.out.println("Number of digits in factorial of 100000: " + String.valueOf(fc.calculate(100000)).length());
        System.out.println("Number of digits in factorial of 100000: " + String.valueOf(fc.calculate(100000)).length());

        System.out.println("Number of digits in factorial of 200000: " + String.valueOf(fc.calculate(100001)).length());
        System.out.println("Number of digits in factorial of 200000: " + String.valueOf(fc.calculate(100001)).length());

        System.out.println("Finished.");


    }




}
