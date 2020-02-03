package pl.workshop.chainofresponsibility.handlers;

import pl.workshop.chainofresposibility.RefundRequestHandler;
import pl.workshop.chainofresposibility.refunds.RefundDecision;
import pl.workshop.chainofresposibility.refunds.RefundRequest;

import java.util.Optional;

public class SmallCostHandler implements RefundRequestHandler {

    private RefundRequestHandler handler;

    @Override
    public void setNext(RefundRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Optional<RefundRequestHandler> next() {
        return Optional.ofNullable(handler);
    }

    @Override
    public RefundDecision process(RefundRequest request) {
        if(request.getCost() < 1000) {
            if (request.getDaysSincePurchase() <= 60) {
                return new RefundDecision(true, "Przedmiot zakupiony poniżej 60 dni.");
            } else {
                return new RefundDecision(false, "Przedmiot zakupiony powyżej 60 dni.");
            }
        } else if(next().isPresent()) {
            return next().get().process(request);
        } else {
            return new RefundDecision(false, "Brak decyzji.");
        }
    }
}
