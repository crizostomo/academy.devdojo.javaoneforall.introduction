package academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain;

//78 - Object Orientation - Final Modifier pt 02 - Reference types

public class Buyer {
    private String name;

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
