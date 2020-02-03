package pl.workshop.decorator.sensors;

public class TemperatureRepeatingSensorSource implements SensorSource {

    private double lastRead = 0.0;

    private final SensorSource sensorSource;

    public TemperatureRepeatingSensorSource(SensorSource sensorSource) {
        this.sensorSource = sensorSource;
    }

    @Override
    public double read() {

        try {
            lastRead = sensorSource.read();
            return lastRead;
        } catch(IllegalStateException e) {
            return lastRead;
        }

    }
}
