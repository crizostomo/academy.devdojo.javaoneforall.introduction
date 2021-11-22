package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

//87 - Object Orientation - Interfaces pt 01 - Introduction
//88 - Object Orientation - Interfaces pt 02 - Implementing multiple interfaces
//89 - Object Orientation - Interfaces pt 03 - Attributes and static methods

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkPermission(){
        System.out.println("Checking General Permission");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Inside retrieveMaxDataSize in the interface");
    }
}
