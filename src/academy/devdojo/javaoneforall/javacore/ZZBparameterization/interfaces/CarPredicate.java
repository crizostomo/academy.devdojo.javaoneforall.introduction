package academy.devdojo.javaoneforall.javacore.ZZBparameterization.interfaces;

//194 - Behavior parameterization pt 02
//195 - Lambdas pt 01 - Predicate

import academy.devdojo.javaoneforall.javacore.ZZBparameterization.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
    //Lambdas = (Parameters) -> <expression>
    // (Car car) -> car.getColor().equals("green");
}
