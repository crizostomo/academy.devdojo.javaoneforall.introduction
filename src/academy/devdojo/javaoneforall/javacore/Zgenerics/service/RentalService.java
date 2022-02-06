package academy.devdojo.javaoneforall.javacore.Zgenerics.service;

//187 - Generics pt 05 - Generic Classes pt 02

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;

import java.util.List;

public class RentalService<T> {

    private List<T> objectsAvailable;

    public RentalService(List<T> objectsAvailable) {
        this.objectsAvailable = objectsAvailable;
    }


    public T retrieveAvailableObject(){
        System.out.println("Searching for any object available");
        T t = objectsAvailable.remove(0);
        System.out.println("Renting the object: "+t);
        System.out.println("Available objects to rent: "+ objectsAvailable);
        return t;
    }
    public void returnRentedObject(T t){
        System.out.println("Returning boat: "+t);
        objectsAvailable.add(t);
        System.out.println("Available objects to rent: "+ objectsAvailable);
    }
}
