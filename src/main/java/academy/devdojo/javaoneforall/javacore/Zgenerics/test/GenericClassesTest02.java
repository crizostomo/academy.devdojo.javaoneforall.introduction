package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

//186 - Generics pt 04 - Generic Classes pt 01

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.Zgenerics.service.BoatRentalService;

public class GenericClassesTest02 {
    public static void main(String[] args) {
        BoatRentalService boatRentalService = new BoatRentalService();
        Boat boat = boatRentalService.retrieveAvailableBoat();
        System.out.println("Using the boat for an entire month");
        boatRentalService.returnRentedBoat(boat);
    }
}
