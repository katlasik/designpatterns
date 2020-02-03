package pl.workshop.visitor.notifications;

public interface Notification {

    void visit(NotificationVisitor visitor);

}

