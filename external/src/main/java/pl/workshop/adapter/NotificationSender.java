package pl.workshop.adapter;

public interface NotificationSender {

    void email(String sourceEmail, String targetEmail, String message);

    void sms(String recipientPhoneNumber, String message);

}
