package pl.workshop.command;

import java.security.SecureRandom;

public class RemoteRecorder {

    private RemoteRecorderStatus status = RemoteRecorderStatus.SLEEPING;
    private final SecureRandom secureRandom = new SecureRandom();
    private int newRecordings = 0;

    public void wakeup() {
        if (status == RemoteRecorderStatus.SLEEPING) {
            System.out.println("REMOTE RECORDER: Waking up...");
            status = RemoteRecorderStatus.AWAKE;
            System.out.println("REMOTE RECORDER: Sensor status: " + status + ".");
        } else {
            System.out.println("REMOTE RECORDER: Already waked up.");
        }
    }

    public void hibernate() {
        if (status == RemoteRecorderStatus.AWAKE) {
            System.out.println("REMOTE RECORDER: Hibernating... ");
            status = RemoteRecorderStatus.SLEEPING;
            System.out.println("REMOTE RECORDER: Sensor status: " + status + ".");
        } else {
            System.out.println("REMOTE RECORDER: Already hibernated.");
        }
    }

    public int newRecordings() {
        if (status == RemoteRecorderStatus.AWAKE) {
            newRecordings += secureRandom.nextInt(100) % 3;
            System.out.println("REMOTE RECORDER: There are " + newRecordings + " new records.");
            return newRecordings;
        } else {
            System.out.println("REMOTE RECORDER: Wake up recorder first");
            return 0;
        }
    }

    public void download() {
        System.out.println("REMOTE RECORDER: Downloading new records... ");
        newRecordings = 0;
    }

    public boolean isAwake() {
        return status == RemoteRecorderStatus.AWAKE;
    }
}
