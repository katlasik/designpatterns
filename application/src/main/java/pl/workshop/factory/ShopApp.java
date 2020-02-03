package pl.workshop.factory;

import java.time.LocalDate;

import java.util.List;

/**
 * Używając wzorca strategia zaimplementuj metodę getDiscountCalculatorByDay w DiscountCalculatorFactory, tak by dla
 * zwracała odpowiednią klasę implementującą interfejs DiscountCalculator.
 *
 * Klasa DiscountCalculatorFactory przyjmuje dwa parametry christmasDiscout oraz fridaDiscount.
 *
 * Dla ostatniego dnia listopada (black friday), co drugi przedmiot powinien być darmowy.
 * Dla każdego piątku cena powinna być obniżona o wartość podaną jako christmasDiscout.
 * Dla daty od 24 grudnia do końca roku cena powinna być obniżona o wartość procentową podaną jako christmasDiscount.
 * Dla każdej innej daty cena nie powinna być obniżana.
 */

public class ShopApp {

    public static void main(String[] args) {

        var factory = new DiscountCalculatorFactory(20, 10);

        var blackFridayCalculator = factory.getDiscountCalculatorByDay(LocalDate.parse("2012-11-23"));
        var fridayCalculator = factory.getDiscountCalculatorByDay(LocalDate.parse("2019-12-06"));
        var christmasCalculator = factory.getDiscountCalculatorByDay(LocalDate.parse("2019-12-25"));
        var regularCalculator = factory.getDiscountCalculatorByDay(LocalDate.parse("2019-10-06"));

        var shopping = new ShoppingCart(
                List.of(new ShoppingItem("młotek", 10), new ShoppingItem("gwoździe", 22), new ShoppingItem("śrubokręt", 13))
        );

        System.out.println("Black friday price: " + blackFridayCalculator.calculateDiscountedPrice(shopping));
        System.out.println("Friday price: " + fridayCalculator.calculateDiscountedPrice(shopping));
        System.out.println("Christmas price: " + christmasCalculator.calculateDiscountedPrice(shopping));
        System.out.println("Regular price: " + regularCalculator.calculateDiscountedPrice(shopping));

    }

}
