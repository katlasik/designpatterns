package pl.workshop.singleton;

public class SystemProbe {

    private SystemProbe() {
        System.out.println("Creating system probe...");
    }

    static SystemProbe getInstance() {
        throw new UnsupportedOperationException("Zaimplementuj!");
    }

    public boolean isRunning() {
        System.out.println("Checking system status ... ");
        return true;
    }



}
