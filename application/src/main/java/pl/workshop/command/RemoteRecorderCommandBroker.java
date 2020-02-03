package pl.workshop.command;

import java.util.ArrayList;
import java.util.List;

public class RemoteRecorderCommandBroker implements CommandBroker<RemoteRecorder> {

    private final List<Command<RemoteRecorder>> commands = new ArrayList<>();
    private final RemoteRecorder recorder;

    RemoteRecorderCommandBroker(RemoteRecorder recorder) {
        this.recorder = recorder;
    }

    @Override
    public void addCommand(Command<RemoteRecorder> command) {
        commands.add(command);
    }

    @Override
    public void executeAll() {

        for(Command<RemoteRecorder> command: commands) {
            command.execute(recorder);
        }

    }
}
