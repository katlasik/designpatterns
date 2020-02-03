package pl.workshop.adapter.emails;

import static pl.workshop.utils.Sleeper.sleep;

public class SmtpEmailSender implements EmailSender {
    @Override
    public void send(Email email) {
        System.out.println("Sending email from " + email.getFrom() + " to " + email.getTo() + " with content: " + email.getMessage() +".");
        sleep();
    }
}
