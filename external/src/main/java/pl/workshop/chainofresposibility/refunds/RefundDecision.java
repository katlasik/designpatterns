package pl.workshop.chainofresposibility.refunds;

import java.util.Objects;

public class RefundDecision {

    private final boolean refund;
    private final String description;

    public RefundDecision(boolean refund, String description) {
        this.refund = refund;
        this.description = description;
    }

    public RefundDecision(boolean refund) {
        this(refund, "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RefundDecision that = (RefundDecision) o;
        return refund == that.refund &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refund, description);
    }

    @Override
    public String toString() {
        return "RefundDecision{" +
                "refund=" + refund +
                ", description='" + description + '\'' +
                '}';
    }
}
