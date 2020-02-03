package pl.workshop.visitor.notifications;

public interface NotificationVisitor {

    void apply(UserConfirmed notification);
    void apply(UserCreated notification);
    void apply(UserLoggedIn notification);
}
