package academy.devdojo.javaoneforall.javacore.Einitializationblock.test;

import academy.devdojo.javaoneforall.javacore.Einitializationblock.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime();
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }
    }
}
