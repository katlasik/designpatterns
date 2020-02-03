package pl.workshop.factory;

import pl.workshop.factory.ShoppingCart;

public interface DiscountCalculator {

    double calculateDiscountedPrice(ShoppingCart shoppingCard);

}
