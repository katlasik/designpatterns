package pl.workshop.factory.stategies;

import pl.workshop.factory.DiscountCalculator;
import pl.workshop.factory.ShoppingCart;

public class NoDiscountCalculator implements DiscountCalculator {

    public double calculateDiscountedPrice(ShoppingCart shoppingCard) {

        double price = 0;

        for (int i = 0; i < shoppingCard.getItems().size(); i++) {
            price += shoppingCard.getItems().get(i).getPrice();
        }

        return price;

    }

}
