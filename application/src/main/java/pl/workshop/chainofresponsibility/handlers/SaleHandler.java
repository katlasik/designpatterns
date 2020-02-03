package pl.workshop.chainofresponsibility.handlers;

import pl.workshop.chainofresposibility.RefundRequestHandler;
import pl.workshop.chainofresposibility.refunds.RefundDecision;
import pl.workshop.chainofresposibility.refunds.RefundRequest;

import java.util.Optional;

public class SaleHandler implements RefundRequestHandler {

    public void setNext(RefundRequestHandler handler) {
        throw new UnsupportedOperationException("Zaimplementuj!");
    }

    @Override
    public Optional<RefundRequestHandler> next() {
        throw new UnsupportedOperationException("Zaimplementuj!");
    }

    @Override
    public RefundDecision process(RefundRequest request) {
        throw new UnsupportedOperationException("Zaimplementuj!");
    }
}
