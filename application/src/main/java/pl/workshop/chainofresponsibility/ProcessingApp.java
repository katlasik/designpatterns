package pl.workshop.chainofresponsibility;

import pl.workshop.chainofresponsibility.handlers.SaleHandler;
import pl.workshop.chainofresposibility.refunds.RefundRequest;


/**
 * Używając wzorca chain of resposibility stwórz aplikację procesującą przełane przez klienta żądanie zwrotu produktu.
 * W tym celu stwórz klasy dziedziczące po interfejsie RefundRequestHandler oraz połącz jest w łańcuch przetważąjący obiekt typu RefundRequest i
 * zwracający obiekt typu RefundDecision.
 *
 * W przypadku gdy produkt jest jest z przeceny (pole fromSale jest ustawione na true) decyzja powinna być negatywna.
 * W przypadku gdy produkt został zakupiony przez klienta premium oraz nie jest z wyprzedaży to decyzja powinna być pozytywna.
 * W przypadku gdy cena produktu jest poniżej 1000 oraz produkt był kupiony 60 lub mniej dni wcześniej to dezycja powinan być pozytywna.
 *
 *
 */
public class ProcessingApp {

    public static void main(String[] args) {

        var refundHandler = new SaleHandler();

        var fromSale = refundHandler.process(new RefundRequest("młotek", 111, 14, false, true));
        var lowCost = refundHandler.process(new RefundRequest("gwoździe", 111, 14, false, false));
        var premium = refundHandler.process(new RefundRequest("wiadro", 111, 14, true, false));
        var tooLate = refundHandler.process(new RefundRequest("klawiatura", 111, 99, false, false));
        var veryHighCost = refundHandler.process(new RefundRequest("monitor", 1001, 14, false, false));

        System.out.println(fromSale);
        System.out.println(lowCost);
        System.out.println(premium);
        System.out.println(tooLate);
        System.out.println(veryHighCost);


    }
}

