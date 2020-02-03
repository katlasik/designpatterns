package pl.workshop.adapter;


import pl.workshop.adapter.emails.Email;
import pl.workshop.adapter.emails.EmailSender;
import pl.workshop.adapter.sms.TextMessage;
import pl.workshop.adapter.sms.TextMessageSender;

public class NotificationAdapter implements NotificationSender{

    private final EmailSender emailSender;
    private final TextMessageSender textMessageSender;

    public NotificationAdapter(EmailSender emailSender, TextMessageSender textMessageSender) {
        this.emailSender = emailSender;
        this.textMessageSender = textMessageSender;
    }

    @Override
    public void email(String sourceEmail, String targetEmail, String message) {
        emailSender.send(new Email(sourceEmail, targetEmail, message));
    }

    @Override
    public void sms(String recipientPhoneNumber, String message) {
        textMessageSender.send(new TextMessage(recipientPhoneNumber, message));
    }


}
