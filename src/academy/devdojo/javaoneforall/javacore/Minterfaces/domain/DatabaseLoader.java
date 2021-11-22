package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

//87 - Object Orientation - Interfaces pt 01 - Introduction
//88 - Object Orientation - Interfaces pt 02 - Implementing multiple interfaces
//89 - Object Orientation - Interfaces pt 03 - Attributes and static methods

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading data from database");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permission in the database");;
    }


    //Static methods cannot be overriden!
    public static void retriveMaxDataSize(){
        System.out.println("Inside retrieveMaxDataSize in the class DatabaseLoader");
    }
}
