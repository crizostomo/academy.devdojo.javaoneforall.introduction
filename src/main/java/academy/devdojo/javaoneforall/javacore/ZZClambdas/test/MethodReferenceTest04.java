package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

//200 - Method Reference pt 03 - Reference to constructors

import academy.devdojo.javaoneforall.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.javaoneforall.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
//        Supplier<AnimeComparators> animeComparatorsSupplier = () -> new AnimeComparators();
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new; //the same result as the line above

        AnimeComparators animeComparators = new AnimeComparators();
    List<Anime> animes = new ArrayList<>(List.of(
            new Anime("Berske", 40),
            new Anime("One Piece", 900),
            new Anime("Naruto", 500)));
    animes.sort(animeComparators::compareByEpisodeNonStatic);
        System.out.println(animes);
//        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title,episodes);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new; //the same result as the line above

        System.out.println(animeBiFunction.apply("Saint Seiya", 100));
    }
}