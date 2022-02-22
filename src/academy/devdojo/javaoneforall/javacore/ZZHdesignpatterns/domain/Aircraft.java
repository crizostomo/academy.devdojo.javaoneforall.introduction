package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.domain;

//248 - Design Patterns pt 03 - Singleton pt 01 - Eager Initialization
//251 - Design Patterns pt 06 - Data Transfer Object

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public Aircraft(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }

    public String getName() {
        return name;
    }
}
