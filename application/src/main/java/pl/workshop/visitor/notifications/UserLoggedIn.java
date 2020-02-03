package pl.workshop.visitor.notifications;

import java.time.LocalDateTime;

public class UserLoggedIn implements Notification {

    private final String name;
    private final LocalDateTime timestamp;

    public UserLoggedIn(String name, LocalDateTime timestamp) {
        this.name = name;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public void visit(NotificationVisitor visitor) {
        visitor.visit(this);
    }
}
