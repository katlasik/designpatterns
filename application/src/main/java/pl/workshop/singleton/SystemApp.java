package pl.workshop.singleton;

/**
 * Przerób klasę SystemProbe, tak aby metody getInstance zwracała leniwy singleton.
 *
 * Stwórz podobną klasę o nazwie ApplicationHealthCheck, która wykorzystuje mechanizm enum do stworzenia sigletona.
 */

public class SystemApp {

    public static void main(String[] args) {

        SystemProbe.getInstance().isRunning();
        SystemProbe.getInstance().isRunning();

        ApplicationHealthCheck.INSTANCE.isAlive();
        ApplicationHealthCheck.INSTANCE.isAlive();


    }
}
