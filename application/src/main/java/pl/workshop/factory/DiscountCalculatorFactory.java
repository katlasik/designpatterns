package pl.workshop.factory;

import java.time.LocalDate;

public class DiscountCalculatorFactory {

    private final int christmasDiscount;
    private final int fridayDiscount;

    public DiscountCalculatorFactory(int christmasDiscount, int fridayDiscount) {
        this.christmasDiscount = christmasDiscount;
        this.fridayDiscount = fridayDiscount;
    }

    public DiscountCalculator getDiscountCalculatorByDay(LocalDate date) {
        throw new UnsupportedOperationException("Zaimplentuj!");
    }

}
