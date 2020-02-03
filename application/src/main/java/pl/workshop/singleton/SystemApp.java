package pl.workshop.singleton;

/**
 * Przerób klasę SystemProbe, tak aby metody getInstance zwracała singleton.
 */

public class SystemApp {

    public static void main(String[] args) {

        SystemProbe.getInstance().isRunning();
        SystemProbe.getInstance().isRunning();

    }
}
