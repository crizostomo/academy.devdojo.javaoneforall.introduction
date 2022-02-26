package academy.devdojo.javaoneforall.javacore.Ioverriding.domain;

//76 - Object Orientation - Overriding toString

public class Anime {
    private String name;


    //ALT + INSERT + ToSTRING()
    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                '}';
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
