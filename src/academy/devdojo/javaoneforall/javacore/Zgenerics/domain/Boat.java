package academy.devdojo.javaoneforall.javacore.Zgenerics.domain;

//186 - Generics pt 04 - Generic Classes pt 01

public class Boat {
    private String name;

    public Boat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                '}';
    }
}
