package academy.devdojo.javaoneforall.javacore.ZZDoptional.test;

//202 - Optional pt 02

import academy.devdojo.javaoneforall.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.javaoneforall.javacore.ZZDoptional.repository.MangaRespository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRespository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Boku no Hero 5"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRespository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRespository.findByTitle("Drifters")
                .orElse(new Manga(3, "Drifters", 20));
//              .orElseGet(() -> new Manga(3, "Drifters", 20));

        System.out.println(newManga);
    }
}
