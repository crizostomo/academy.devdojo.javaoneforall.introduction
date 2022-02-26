package academy.devdojo.javaoneforall.javacore.Cmethodoverloading.test;

import academy.devdojo.javaoneforall.javacore.Cmethodoverloading.domain.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "finished");
//        anime.setName("Akudama Drive");
//        anime.setType("TV");
//        anime.setEpisodes(12);
        anime.print();
    }
}
