package pl.workshop.templatemethod;

public interface CallbackFileScanner extends FileScanner{
    void onFoundFile(String filename);

    void onComplete(int filesCount);
}
