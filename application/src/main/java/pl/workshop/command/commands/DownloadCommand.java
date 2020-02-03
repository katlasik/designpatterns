package pl.workshop.command.commands;

import pl.workshop.command.RemoteRecorder;
import pl.workshop.command.Command;

public class DownloadCommand implements Command<RemoteRecorder> {
    @Override
    public void execute(RemoteRecorder remoteRecorder) {
        if(remoteRecorder.isAwake() && remoteRecorder.newRecordings() > 0) {
            remoteRecorder.download();
        }
    }
}
