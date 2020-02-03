package pl.workshop.composite;

import pl.workshop.composite.filesystem.Directory;
import pl.workshop.composite.filesystem.File;
import pl.workshop.composite.filesystem.FileSystemEntry;

import java.nio.file.FileSystem;
import java.util.Collections;
import java.util.List;

import static pl.workshop.composite.filesystem.FileSystemEntry.directory;
import static pl.workshop.composite.filesystem.FileSystemEntry.file;


/**
 * Za pomocą wzorca Composite zaimplementuj klasy File oraz Directory dziedziczące po FileSystemEntry.
 *
 * Klasa File powinna przyjmować dwa argumenty: nazwę pliku oraz jego rozmiar.
 *
 * Klasa directory powinna przyjmować 2 argumenty, nazwę folderu oraz listę elementów (plików lub subfolderów), które
 * zawiera.
 *
 * Zmodyfikuj metody statyczne w **file** i **directory** w **FileSystemEntry**, tak by zwracały odpowiednie klasy.
 *
 * (Opcjonalnie) Zaimplementuj metodę iterator(), który będzie zwracał iterator przechodzący po wszystkich elementach katalogu,
 * najpierw wyświetlając nazwę folderu, a następnie zawartość folderu.
 */

public class FilesystemApp {

    public static void main(String[] args) {

        FileSystemEntry directory = directory("home",
                directory(
                        "obrazki",
                        file("obrazek1.jpg", 1024),
                        file("obrazek12.jpg", 4096),
                        file("obrazek2.jpg", 10240),
                        directory("emptydir")
                ),
                file("adresy.txt", 512)
        );

        System.out.println("Size of folder " + directory.getName() + " is " + directory.size() + "B.");


    }

}
