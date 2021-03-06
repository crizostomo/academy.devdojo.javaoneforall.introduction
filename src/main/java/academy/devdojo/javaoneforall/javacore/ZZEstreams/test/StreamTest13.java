package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

//215 - Streams pt 13 - Collectors pt 03 - Grouping by pt 02

import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static academy.devdojo.javaoneforall.javacore.ZZEstreams.domain.Promotion.*;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 6.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect =
                lightNovels.stream().collect(groupingBy(StreamTest13::getPromotion
        ));
        System.out.println(collect);

        //Map<Category, Map<Promotion, List<LightNovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        groupingBy(StreamTest13::getPromotion)));
        System.out.println(collect1);

    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ?
                UNDER_PROMOTION : NORMAL_PRICE;
    }
}
