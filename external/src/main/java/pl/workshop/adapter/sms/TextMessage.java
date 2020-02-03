package pl.workshop.adapter.sms;

import java.util.Objects;

public class TextMessage {

    private final String recipientPhoneNumber;
    private final String text;

    public String getRecipientPhoneNumber() {
        return recipientPhoneNumber;
    }

    public String getText() {
        return text;
    }

    public TextMessage(String recipientPhoneNumber, String text) {
        this.recipientPhoneNumber = recipientPhoneNumber;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextMessage textMessage = (TextMessage) o;
        return Objects.equals(recipientPhoneNumber, textMessage.recipientPhoneNumber) &&
                Objects.equals(text, textMessage.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipientPhoneNumber, text);
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "recipientPhoneNumber='" + recipientPhoneNumber + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
