package pl.workshop.adapter.emails;

import java.util.Objects;

public class Email {

    private final String from;
    private final String to;
    private final String message;

    public Email(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(from, email.from) &&
                Objects.equals(to, email.to) &&
                Objects.equals(message, email.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, message);
    }

    @Override
    public String toString() {
        return "Email{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
