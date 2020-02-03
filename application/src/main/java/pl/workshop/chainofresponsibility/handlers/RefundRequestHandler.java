package pl.workshop.chainofresponsibility.handlers;

import pl.workshop.chainofresponsibility.refunds.RefundDecision;
import pl.workshop.chainofresponsibility.refunds.RefundRequest;

import java.util.Optional;

public interface RefundRequestHandler {

    Optional<RefundRequestHandler> next();

    void setNext(RefundRequestHandler handler);

    RefundDecision process(RefundRequest request);


}
