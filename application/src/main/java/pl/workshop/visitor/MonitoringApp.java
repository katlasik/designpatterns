package pl.workshop.visitor;

import pl.workshop.visitor.sources.NotificationDispatcher;

/**
 * Stwórz klasę LoggingHandler implementującą NotificationHandler, która w odpowiedzi na zdarzenia będzie wypisywać na konsolę komunikaty.
 * Każde ze zdarzeń: UserConfirmed, UserCreated, UserLoggedIn powinno być zalogowane za pomocą innego komunikatu.
 *
 * Skorzystaj ze wzorca Visitor, aby w odpowiedni sposób obsłużyć komunikaty. W tym celu zmodyfikuj interfejs Notification
 * dodając metodę visit oraz stwórz nowy interfejs NotificationVisitor.
 *
 * Zaimplementuj klasę StatisticsHandler, która będzie sumować liczbę użytkowników, którzy zostali stworzeni oraz tych, którzy potwierdzili konta
 * i będzie wyświetlać na konsoli tą statystykę.
 *
 */
public class MonitoringApp {

    public static void main(String[] args) {

        LoggingHandler loggingHandler = new LoggingHandler();
        StatisticsHandler statisticsHandler = new StatisticsHandler();

        new NotificationDispatcher(loggingHandler, statisticsHandler).start();

    }

}
