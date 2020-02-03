package pl.workshop.proxy.calculator;

import pl.workshop.proxy.SimpleFactorialCalculator;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class CachingFactorialCalculatorProxy extends SimpleFactorialCalculator {

    private final Map<Long, BigInteger> cache = new HashMap<>();

    @Override
    public BigInteger calculate(long n) {

        if(cache.containsKey(n)) {
            return cache.get(n);
        } else {
            var result = super.calculate(n);
            cache.put(n, result);
            return result;
        }

    }
}
