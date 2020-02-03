package pl.workshop.chainofresponsibility.handlers;

import pl.workshop.chainofresponsibility.refunds.RefundDecision;
import pl.workshop.chainofresponsibility.refunds.RefundRequest;

import java.util.Optional;

public class PremiumCustomerHandler implements RefundRequestHandler {

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
        if(!request.isFromSale() && request.isPremiumCustomer()) {
            return new RefundDecision(true, "Użytkownik premium");
        } else if(next().isPresent()) {
            return next().get().process(request);
        } else {
            return new RefundDecision(false, "Brak decyzji.");
        }
    }
}
