package pl.workshop.observer.sensors;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.DoubleConsumer;

import static pl.workshop.utils.Sleeper.sleep;

public class WaterLevelSensor implements Sensor<Double> {

    private final DoubleConsumer callback;
    private double lastRead = 175.0;

    private final ThreadLocalRandom random = ThreadLocalRandom.current();

    public WaterLevelSensor(DoubleConsumer callback) {
        this.callback = callback;
    }

    public void start() {
        new Thread(() -> {
            while(true) {
                callback.accept(read());
            }
        }).start();
    }

    @Override
    public Double read() {
        sleep();
        var read =  lastRead + lastRead * random.nextDouble() / 10;
        System.out.printf("SENSOR: Water level is %.2f.%n", read);
        return read;
    }
}
