package pl.workshop.decorator.sensors;

import java.util.ArrayList;

public class TemperatureAveragingErrorsSource implements AveragingSensorSource {

    private final SensorSource sensorSource;

    public TemperatureAveragingErrorsSource(SensorSource sensorSource) {
        this.sensorSource = sensorSource;
    }

    @Override
    public double average(int n) {

        ArrayList<Double> values = new ArrayList<>();

        while(n-- > 0) {
            values.add(read());
        }

        double sum = 0;
        for(Double d: values) {
            sum += d;
        }

        return sum / values.size();

    }

    @Override
    public double read() {
        return sensorSource.read();
    }
}
