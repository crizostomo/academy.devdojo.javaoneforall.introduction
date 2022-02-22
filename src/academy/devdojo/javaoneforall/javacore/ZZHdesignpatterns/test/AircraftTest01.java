package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.test;

//248 - Design Patterns pt 03 - Singleton pt 01 - Eager Initialization

import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.Aircraft;
import academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");
        AircraftTest01.bookSeat("1A");

    }
    static void bookSeat(String seat){
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE();
//        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
