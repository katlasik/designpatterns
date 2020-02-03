package pl.workshop.proxy;

import pl.workshop.proxy.FactorialCalculator;

import java.math.BigInteger;

public class SimpleFactorialCalculator implements FactorialCalculator {
    @Override
    public BigInteger calculate(long n) {

        var start = BigInteger.ONE;

        while(n-- > 1) {
            start = start.multiply(BigInteger.valueOf(n));
        }

        return start;
    }
}
