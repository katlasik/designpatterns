package pl.workshop.adapter.sms;

import static pl.workshop.utils.Sleeper.sleep;

public class SmsSender implements TextMessageSender {

    @Override
    public void send(TextMessage textMessage) {
        System.out.println("Sending text message to " + textMessage.getRecipientPhoneNumber() + " with content: " + textMessage.getText() +".");
        sleep();
    }
}
