package pl.workshop.chainofresponsibility.refunds;

import java.util.Objects;

public class RefundRequest {

    private final String item;

    private final int cost;

    private final int daysSincePurchase;

    private final boolean premiumCustomer;

    private final boolean fromSale;

    public String getItem() {
        return item;
    }

    public int getCost() {
        return cost;
    }

    public int getDaysSincePurchase() {
        return daysSincePurchase;
    }

    public boolean isPremiumCustomer() {
        return premiumCustomer;
    }

    public boolean isFromSale() {
        return fromSale;
    }

    public RefundRequest(String item, int cost, int daysSincePurchase, boolean premiumCustomer, boolean fromSale) {
        this.item = item;
        this.cost = cost;
        this.daysSincePurchase = daysSincePurchase;
        this.premiumCustomer = premiumCustomer;
        this.fromSale = fromSale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RefundRequest that = (RefundRequest) o;
        return cost == that.cost &&
                daysSincePurchase == that.daysSincePurchase &&
                premiumCustomer == that.premiumCustomer &&
                fromSale == that.fromSale &&
                Objects.equals(item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, cost, daysSincePurchase, premiumCustomer, fromSale);
    }

    @Override
    public String toString() {
        return "RefundRequest{" +
                "item='" + item + '\'' +
                ", cost=" + cost +
                ", daysSinceBuyed=" + daysSincePurchase +
                ", premiumCustomer=" + premiumCustomer +
                ", fromSale=" + fromSale +
                '}';
    }
}
