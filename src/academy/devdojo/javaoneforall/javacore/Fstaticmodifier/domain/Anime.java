package academy.devdojo.javaoneforall.javacore.Fstaticmodifier.domain;

//63 - Object Orientation - Static Initialization block

public class Anime {
    private String name;
    private static int[] episodes;
    // 0 - Static init block is executed when JVM loads the class and only once
    // 1 - Memory allocated
    // 2 - Each class attribute is initialized
    // 3 - Init block is executed
    // 4 - The constructor is executed
    static {
        System.out.println("Inside static 1 init block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Inside static 2 init block");
    }


//    Initialization block {} can be anywhere in the code and it will be created
//    and it is created every time that we create an object

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
    }

    public String getName() {
        return name;
    }

    public static int[] getEpisodes() {
        return episodes;
    }
}
