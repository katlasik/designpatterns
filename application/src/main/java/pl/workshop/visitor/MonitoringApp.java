package pl.workshop.visitor;

import pl.workshop.visitor.sources.NotificationDispatcher;

/**
 * Zrefaktoruj klasę LoggingHandler, tak by używała wzorca Visitor. W tym celu zmodyfikuj interfejs Notification
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
