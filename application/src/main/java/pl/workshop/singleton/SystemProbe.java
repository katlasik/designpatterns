package pl.workshop.singleton;

public class SystemProbe {

    private SystemProbe() {
        System.out.println("Creating system probe...");
    }

    private static class Holder {
        private static final SystemProbe INSTANCE = new SystemProbe();
    }

    static SystemProbe getInstance() {
        return Holder.INSTANCE;
    }

    public boolean isRunning() {
        System.out.println("Checking system status ... ");
        return true;
    }



}
