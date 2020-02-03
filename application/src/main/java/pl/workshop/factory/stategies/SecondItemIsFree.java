package pl.workshop.factory.stategies;

import pl.workshop.factory.DiscountCalculator;
import pl.workshop.factory.ShoppingCart;
import pl.workshop.factory.ShoppingItem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondItemIsFree implements DiscountCalculator {

    public double calculateDiscountedPrice(ShoppingCart shoppingCard) {

        List<ShoppingItem> items = new ArrayList<>(shoppingCard.getItems());

        items.sort(Comparator.comparingDouble(ShoppingItem::getPrice).reversed());

        double price = 0;

        for (int i = 0; i < items.size(); i+=2) {
            price += items.get(i).getPrice();
        }

        return price;

    }

}
