package pl.workshop.command.commands;

import pl.workshop.command.Command;
import pl.workshop.command.RemoteRecorder;

public class WakeupCommand implements Command<RemoteRecorder> {
    @Override
    public void execute(RemoteRecorder remoteRecorder) {
        if(!remoteRecorder.isAwake()) {
            remoteRecorder.wakeup();
        }
    }
}
