package pl.workshop.factory;

import pl.workshop.factory.stategies.NoDiscountCalculator;
import pl.workshop.factory.stategies.PercentageCalculator;
import pl.workshop.factory.stategies.SecondItemIsFree;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DiscountCalculatorFactory {

    private final int christmasDiscount;
    private final int fridayDiscount;

    public DiscountCalculatorFactory(int christmasDiscount, int fridayDiscount) {
        this.christmasDiscount = christmasDiscount;
        this.fridayDiscount = fridayDiscount;
    }

    public DiscountCalculator getDiscountCalculatorByDay(LocalDate date) {

        if (isBlackFriday(date)) {
            return new SecondItemIsFree();
        } else if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            return new PercentageCalculator(fridayDiscount);
        } else if(isChristmas(date)) {
            return new PercentageCalculator(christmasDiscount);
        } else {
            return new NoDiscountCalculator();
        }

    }

    private boolean isChristmas(LocalDate date) {
        return date.getDayOfMonth() > 24 && date.getMonth().equals(Month.DECEMBER);
    }

    private boolean isBlackFriday(LocalDate date) {
        return date.getMonth().equals(Month.NOVEMBER) && (date.lengthOfMonth() - date.getDayOfMonth()) <= 7 && date.getDayOfWeek().equals(DayOfWeek.FRIDAY);
    }


}
