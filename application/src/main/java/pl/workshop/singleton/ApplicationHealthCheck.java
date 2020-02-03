package pl.workshop.singleton;

public enum ApplicationHealthCheck {
    INSTANCE;

    boolean isAlive() {
        System.out.println("I'm alive!");
        return true;
    }
}
