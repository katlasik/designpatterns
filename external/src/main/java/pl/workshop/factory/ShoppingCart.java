package pl.workshop.factory;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {

    private final List<ShoppingItem> items;

    public ShoppingCart(List<ShoppingItem> items) {
        this.items = Collections.unmodifiableList(items);
    }

    public List<ShoppingItem> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}
