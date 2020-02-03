package pl.workshop.visitor.notifications;

public class UserCreated implements Notification {

    private final String name;
    private final String email;

    public UserCreated(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
