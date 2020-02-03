package pl.workshop.chainofresposibility;

import pl.workshop.chainofresposibility.refunds.RefundDecision;
import pl.workshop.chainofresposibility.refunds.RefundRequest;

import java.util.Optional;

public interface RefundRequestHandler {

    Optional<RefundRequestHandler> next();

    void setNext(RefundRequestHandler handler);

    RefundDecision process(RefundRequest request);


}
