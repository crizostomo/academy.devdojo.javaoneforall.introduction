package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;

//175 - Collection pt 15 - Set, HashSet

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>(); //or LinkedHashSet if you want to keep the same behavior
        mangas.add(new Manga(5L, "Pokemon", 19.99, 0));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 59.99, 5));
        mangas.add(new Manga(1L, "Bersek", 29.99, 0));
        mangas.add(new Manga(2L, "Attack on Titan", 39.99, 8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99, 0));

        for(Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
