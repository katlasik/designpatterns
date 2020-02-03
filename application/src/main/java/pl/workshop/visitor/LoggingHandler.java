package pl.workshop.visitor;

import pl.workshop.visitor.sources.NotificationHandler;
import pl.workshop.visitor.notifications.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggingHandler implements NotificationHandler {

    private void displayMessage(String message) {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + " | " + message);
    }

    @Override
    public void registerNotification(Notification notification) {

        if(notification instanceof UserConfirmed) {
            var n = (UserConfirmed) notification;
            displayMessage("Użytkownik " + n.getName() + " potwierdził adres email: " + n.getEmail() +".");
        } else if(notification instanceof  UserCreated) {
            var n = (UserCreated) notification;
            displayMessage("Nowy użytkownik: " + n.getName() + ".");
        } else if(notification instanceof  BulkUserLoggedInNotification) {
            for(UserLoggedIn n: ((BulkUserLoggedInNotification) notification).getNotifications()) {
                displayMessage("Nowy użytkownik: " + n.getName() + ".");
            }
        } else {
            var n = (UserLoggedIn) notification;
            displayMessage("Użytkownik " + n.getName() + " się zalogował.");
        }

    }

}
