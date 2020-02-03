package pl.workshop.visitor;

import pl.workshop.visitor.notifications.*;
import pl.workshop.visitor.sources.NotificationHandler;

public class StatisticsHandler implements NotificationHandler{

    private int usersConfirmed = 0;
    private int usersCreated = 0;
    private int totalEventsSinceLastShow = 0;

    @Override
    public void registerNotification(Notification notification) {

        notification.visit(new NotificationVisitor() {
            @Override
            public void visit(UserConfirmed notification) {
                usersConfirmed++;
                showStatistics();
            }

            @Override
            public void visit(UserCreated notification) {
                usersCreated++;
                showStatistics();
            }

            @Override
            public void visit(UserLoggedIn notification) {

            }
        });

    }

    void showStatistics() {
        totalEventsSinceLastShow++;
        if(totalEventsSinceLastShow > 10) {
            System.out.println("STATYSTYKA: Użytkownicy zarejestrowani: " + usersCreated + ", użytkownicy potwierdzeni: " + usersConfirmed + ".");
            totalEventsSinceLastShow = 0;
        }
    }




}
