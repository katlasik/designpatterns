package pl.workshop.proxy.calculator;

import pl.workshop.proxy.FactorialCalculator;
import pl.workshop.proxy.SimpleFactorialCalculator;

public class FactorialCalculatorCreator {

    private FactorialCalculatorCreator() {}

    public static FactorialCalculator create(boolean caching) {
        return new SimpleFactorialCalculator();
    }

}
