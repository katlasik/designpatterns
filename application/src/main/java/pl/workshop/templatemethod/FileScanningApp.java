package pl.workshop.templatemethod;

/**
 * Stwórz klasę FileSystemScanner implementującą interfejs CallbackFileScanner.
 * Skorzystaj z metody nextFile z klasy FileLoader aby pobierać kolejne pliki.
 * Zaprojektuj klasę, w ten sposób, że po każdym znalezionym elemencie będzie wywoływać metodę onFoundFile, a na zakończenie
 * wyszukiwania wywoła raz onComplete.
 *
 * (Opcjonalnie) Stwórz wersję FileSystemScanner, która implementuje FileScanner, a jako argumenty otrzymuje
 * dwie instancję interfejsu funkcyjnego Consumer.
 */

public class FileScanningApp {

    public static void main(String[] args) {

        FileSystemScanner scanner = null;

        System.out.println("Znaleziono " + scanner.findAll().size() + " plików.");

    }

}
