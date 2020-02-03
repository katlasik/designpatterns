package pl.workshop.chainofresponsibility.handlers;

import pl.workshop.chainofresponsibility.refunds.RefundDecision;
import pl.workshop.chainofresponsibility.refunds.RefundRequest;

import java.util.Optional;

public class SaleHandler implements RefundRequestHandler {
    private RefundRequestHandler handler;

    public void setNext(RefundRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Optional<RefundRequestHandler> next() {
        return Optional.ofNullable(handler);
    }
    @Override
    public RefundDecision process(RefundRequest request) {
        if(request.isFromSale()) {
            return new RefundDecision(false, "Przedmiot z wyprzedaży.");
        } else if(next().isPresent()) {
            return next().get().process(request);
        } else {
            return new RefundDecision(false, "Brak decyzji.");
        }
    }
}
