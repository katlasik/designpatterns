package pl.workshop.composite;

import pl.workshop.composite.filesystem.Directory;
import pl.workshop.composite.filesystem.File;
import pl.workshop.composite.filesystem.FileSystemEntry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Za pomocą wzorca Composite stwórz klasy File oraz Directory dziedziczące po FileSystemEntry.
 *
 * Klasa File powinna przyjmować dwa argumenty: nazwę pliku oraz jego rozmiar.
 *
 * Klasa directory powinna przyjmować 2 argumenty, nazwę folderu oraz listę elementów (plików lub subfolderów), które
 * zawierą.
 *
 * (Opcjonalnie) Zaimplementuj metodę iterator(), który będzie zwracał iterator przechodzący po wszystkich elementach katalogu,
 * najpierw wyświetlając nazwę folderu, a następnie zawartość folderu.
 */

public class FilesystemApp {

    public static void main(String[] args) {


        FileSystemEntry directory = new Directory("home",
                List.of(
                        new Directory(
                                "obrazki",
                                List.of(
                                        new File("obrazek1.jpg", 1024),
                                        new File("obrazek12.jpg", 4096),
                                        new File("obrazek2.jpg", 10240),
                                        new Directory("emptydir", Collections.emptyList())
                                )
                        ),
                        new File("adresy.txt", 512)
                )
        );


        System.out.println("Size of folder " + directory.getName() + " is " + directory.size() + "B.");


    }

}
