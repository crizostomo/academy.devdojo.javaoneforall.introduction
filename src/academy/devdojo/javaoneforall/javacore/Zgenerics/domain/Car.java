package academy.devdojo.javaoneforall.javacore.Zgenerics.domain;

//186 - Generics pt 04 - Generic Classes pt 01
//191 - Inner classes pt 03 - Anonymous classes

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
