package pl.workshop.visitor.sources;

import pl.workshop.visitor.notifications.Notification;

public interface NotificationHandler {
    void registerNotification(Notification notification);
}
