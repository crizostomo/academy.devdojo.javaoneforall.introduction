package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

//198 - Method Reference pt 01 - Reference to static methods

import academy.devdojo.javaoneforall.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.javaoneforall.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Berske", 40),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)));
//        animes.sort((a1, a2)-> a1.getTitle().compareTo(a2.getTitle()));
//        animes.sort(AnimeComparators::compareByTitle);
        animes.sort(AnimeComparators::compareByEpisode);

        System.out.println(animes);
    }
}
