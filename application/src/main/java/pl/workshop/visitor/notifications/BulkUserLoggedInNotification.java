package pl.workshop.visitor.notifications;

import java.util.Collections;
import java.util.List;

public class BulkUserLoggedInNotification implements Notification {

    private final List<UserLoggedIn> notifications;

    public BulkUserLoggedInNotification(List<UserLoggedIn> notifications) {
        this.notifications = Collections.unmodifiableList(notifications);
    }

    public List<UserLoggedIn> getNotifications() {
        return notifications;
    }

    @Override
    public void visit(NotificationVisitor visitor) {
        for(UserLoggedIn notification: notifications) {
            visitor.visit(notification);
        }
    }
}
