package pl.workshop.command;

import pl.workshop.command.commands.DownloadCommand;
import pl.workshop.command.commands.HibernateCommand;
import pl.workshop.command.commands.WakeupCommand;

/**
 * Stwórz polecenia sterujące klasą RemoteRecorder.
 *
 * Polecenie wybudzające (wywołujące metodę wakeup), ale tylko jeżeli urządzenie jest uśpione (skorzystaj z metody **isAwake** aby sprawdzić, czy urządzenie jest uśpione).
 * Polecenie ściągające dane, jeżeli są nowe nagrania (skorzystaj z metod newRecordings oraz download).
 * Polecenie usypiające urządzenie, jeżeli nie jest już uśpione (skorzystaj z metod isAwake oraz hibernate).
 *
 * Stwórz klasę brokera, która wykona wszystkie polecenia na klasie RemoteRecorder w kolejności: wyburzenie, ściągnięcie danych, uśpienie.
 */
public class CommandApp {

    public static void main(String[] args) {
        RemoteRecorder remoteRecorder = new RemoteRecorder();
        RemoteRecorderCommandBroker broker = new RemoteRecorderCommandBroker(remoteRecorder);

        broker.addCommand(new WakeupCommand());
        broker.addCommand(new DownloadCommand());
        broker.addCommand(new HibernateCommand());

        broker.executeAll();
    }

}
