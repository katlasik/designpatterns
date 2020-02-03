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

        if(notification instanceof UserConfirmed) {
            var n = (UserConfirmed) notification;
            saveLogMessage("Użytkownik " + n.getName() + " potwierdził adres email: " + n.getEmail() +".");
        } else if(notification instanceof  UserCreated) {
            var n = (UserCreated) notification;
            saveLogMessage("Nowy użytkownik: " + n.getName() + ".");
        } else {
            var n = (UserLoggedIn) notification;
            saveLogMessage("Użytkownik " + n.getName() + " się zalogował.");
        }

//        notification.visit(new NotificationVisitor() {
//            @Override
//            public void visit(UserConfirmed notification) {
//                saveLogMessage("Użytkownik " + notification.getName() + " potwierdził adres email: " + notification.getEmail() +".");
//            }
//
//            @Override
//            public void visit(UserCreated notification) {
//                saveLogMessage("Nowy użytkownik: " + notification.getName() + ".");
//            }
//
//            @Override
//            public void visit(UserLoggedIn notification) {
//                saveLogMessage("Użytkownik " + notification.getName() + " się zalogował.");
//            }
//        });

    }

}
