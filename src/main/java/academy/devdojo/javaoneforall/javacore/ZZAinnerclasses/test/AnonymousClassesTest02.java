package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

//191 - Inner classes pt 03 - Anonymous classes

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class CarTitleComparator implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("Volvo"), new Car("BMW")));
        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(cars);
    }
}
