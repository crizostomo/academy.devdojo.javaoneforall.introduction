package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

//199 - Method Reference pt 02 - Reference to non static methods

import academy.devdojo.javaoneforall.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.javaoneforall.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Berske", 40),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)));
        AnimeComparators animeComparators = new AnimeComparators();
        animes.sort(animeComparators::compareByEpisodeNonStatic);
        animes.sort((a1,a2)-> animeComparators.compareByEpisodeNonStatic(a1,a2)); //this method does the same thing as the above one
        System.out.println(animes);
    }
}
