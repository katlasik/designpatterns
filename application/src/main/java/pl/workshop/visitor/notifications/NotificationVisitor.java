package pl.workshop.visitor.notifications;

public interface NotificationVisitor {

    void visit(UserConfirmed notification);
    void visit(UserCreated notification);
    void visit(UserLoggedIn notification);
}
