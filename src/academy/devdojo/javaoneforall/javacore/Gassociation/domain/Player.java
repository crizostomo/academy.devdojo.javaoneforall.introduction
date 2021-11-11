package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

//64 - Object Orientation - Association pt 01 - Arrays with objects

public class Player {
    private String name;

    public void print(){
        System.out.println(this.name);
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
