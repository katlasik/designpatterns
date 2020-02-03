package pl.workshop.decorator;

import pl.workshop.decorator.sensors.SensorSource;
import pl.workshop.decorator.sensors.TemperatureSensorSource;

/**
 * Klasa TemperatureSensorsSource pozwala pobrać bieżącą temperaturę z czujnika. Niestety sporadycznie podczas odczytu występuje błąd,
 * powodujący wyrzucenie wyjątku IllegalStateException.
 *
 * Stwórz dekorator, który będzie otrzymywał instancję TemperatureSensorsSource. W przypadku wystąpnienia błędu, ma zwrócić ostatnią odczytaną wartość.
 *
 * Stwórz dekorator, który będzie implementował klasę AveragingSensorSource, pozwalającą zwrócić średni wynik z n pomiarów.
 * Po wywołaniu metody average, klasa dekoratora powinna zebrać n wyników, a następnie zwrócić ich średnią.
 */

public class SensorsApp {

    public static void main(String[] args) {

        int i = 10;

        SensorSource source = new TemperatureSensorSource();

        while(i-- > 0) {
            System.out.printf("Temperatura wynosi: %.2f° C.\n", source.read());
        }


    }


}
