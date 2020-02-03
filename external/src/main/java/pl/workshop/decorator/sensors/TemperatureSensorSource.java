package pl.workshop.decorator.sensors;

import java.util.concurrent.ThreadLocalRandom;

import static pl.workshop.utils.Sleeper.sleep;

public class TemperatureSensorSource implements SensorSource {

    double lastRead = 36.6;

    private final ThreadLocalRandom random = ThreadLocalRandom.current();

    @Override
    public double read() {
        sleep();
        if(random.nextInt() % 5 == 0) {
            throw new IllegalStateException("Couldn't make temperature read.");
        }
        return lastRead + lastRead * random.nextDouble() / 10;
    }


}
