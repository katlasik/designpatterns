package pl.workshop.adapter;

import pl.workshop.adapter.emails.SmtpEmailSender;
import pl.workshop.adapter.sms.SmsSender;

/**
 *
 * Klasa NotificationDispatcher zajmuje się zbieraniem informacji o zdarzeniach biznesowych. Używając
 * instancji klasy implementującej interfejs NotificationSender przekazanej w konstruktorze, NotificationDispatcher
 * wysyła wiadomości email oraz sms informujacej o owych zdarzeniach biznesowych.
 *
 * Dysponujemy zewnętrznymi klasami umożliwiającymi wysyłanie wiadomości o nazwach SmtpEmailSender oraz SmsSender.
 *
 * Stwórz klasę NotificationSenderAdapter implementującą interfejs NotificationSender, która jako argument otrzyma instancję obiektów SmtpEmailSender oraz SmsSender.
 *
 */
public class NotificationApp {

    public static void main(String[] args) {

        var service = new NotificationDispatcher(new NotificationAdapter(new SmtpEmailSender(), new SmsSender()));
        service.start();

    }
}
