package academy.devdojo.javaoneforall.javacore.Jfinalmodifier.test;

//77 - Object Orientation - Final Modifier pt 01 - Primitive types
//78 - Object Orientation - Final Modifier pt 02 - Reference types

import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.Car;
import academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);
        car.BUYER.setName("Kuririn");
        System.out.println(car.BUYER);
        Ferrari ferrari = new Ferrari();
        ferrari.setName("Vegeta");
        ferrari.print();
    }
}
