package academy.devdojo.javaoneforall.javacore.Dconstructor.test;


import academy.devdojo.javaoneforall.javacore.Dconstructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "finished");
        Anime anime2 = new Anime();
//        anime.init("Akudama Drive", "TV", 12, "finished");
////        anime.setName("Akudama Drive");
////        anime.setType("TV");
////        anime.setEpisodes(12);
        anime.print();
        anime2.print();
    }
}
