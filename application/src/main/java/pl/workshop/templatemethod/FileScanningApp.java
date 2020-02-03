package pl.workshop.templatemethod;

/**
 * Stwórz klasę FileSystemScanner implmentującą interfejs CallbackFileScanner.
 * Skorzystaj z metody nextFile z klasy FileLoader aby pobierać kolejne pliki.
 * Zaprojektuj klasę, w ten sposób, że po każdym znalezionym elemencie będzie wywoływać metodę onFoundFile, a na zakończenie
 * wyszukiwania wywoła raz onComplete.
 *
 * (Opcjonalnie) Stwórz wersję FileSystemScanner, która implementuje FileScanner, a jako argumenty otrzymuje
 * dwie instancję interfejsu funkcyjnego Consumer.
 */

public class FileScanningApp {

    public static void main(String[] args) {

        FileSystemScanner scanner = new FileSystemScanner() {
            @Override
            public void onFoundFile(String filename) {
                System.out.println("Znaleziono plik: " + filename + ".");
            }

            @Override
            public void onComplete(int filesCount) {
                System.out.println("Zakończono wyszukiwanie");
            }
        };

        System.out.println("Znaleziono " + scanner.findAll().size() + " plików.");

        LambdaFileSystemScanner callbackScanner = new LambdaFileSystemScanner(
                filename -> System.out.println("Znaleziono plik: " + filename + "."),
                filesCount -> System.out.println("Zakończono wyszukiwanie")
        );

        System.out.println("Znaleziono " + callbackScanner.findAll().size() + " plików.");
    }

}
