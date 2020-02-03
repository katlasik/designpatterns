package pl.workshop.visitor.notifications;


public class UserConfirmed implements Notification {

    private final String name;
    private final String email;

    public UserConfirmed(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void visit(NotificationVisitor visitor) {
        visitor.visit(this);
    }
}
