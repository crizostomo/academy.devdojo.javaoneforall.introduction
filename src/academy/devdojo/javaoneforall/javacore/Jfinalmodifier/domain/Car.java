package academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain;

//77 - Object Orientation - Final Modifier pt 01 - Primitive types
//78 - Object Orientation - Final Modifier pt 02 - Reference types

public class Car {
    private String name;
    public static final double SPEED_LIMIT = 250;
    public final Buyer BUYER = new Buyer();

    public final void print(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
