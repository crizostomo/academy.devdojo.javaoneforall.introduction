package academy.devdojo.javaoneforall.javacore.Ycollection.test;

//172 - Collection pt 12 - Binary Search

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Pokemon", 19.99));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 59.99));
        mangas.add(new Manga(1L, "Bersek", 29.99));
        mangas.add(new Manga(2L, "Attack on Titan", 39.99));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("---------------");
        Manga mangaToSearch = new Manga(4L, "Dragon Ball Z", 89.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
