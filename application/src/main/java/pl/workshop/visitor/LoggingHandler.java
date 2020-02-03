package pl.workshop.visitor;

import pl.workshop.visitor.sources.NotificationHandler;
import pl.workshop.visitor.notifications.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggingHandler implements NotificationHandler {

    private void saveLogMessage(String message) {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + " | " + message);
    }

    @Override
    public void registerNotification(Notification notification) {

        notification.visit(new NotificationVisitor() {
            @Override
            public void apply(UserConfirmed notification) {
                saveLogMessage("Użytkownik " + notification.getName() + " potwierdził adres email: " + notification.getEmail() +".");
            }

            @Override
            public void apply(UserCreated notification) {
                saveLogMessage("Nowy użytkownik: " + notification.getName() + ".");
            }

            @Override
            public void apply(UserLoggedIn notification) {
                saveLogMessage("Użytkownik " + notification.getName() + " się zalogował.");
            }
        });

    }

}
