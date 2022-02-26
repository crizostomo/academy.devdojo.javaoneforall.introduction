package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain;

//250 - Design Patterns pt 05 - Singleton pt 03 - Singleton with enumeration

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();

    AircraftSingletonEnum() {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }
    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
