package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

//87 - Object Orientation - Interfaces pt 01 - Introduction
//88 - Object Orientation - Interfaces pt 02 - Implementing multiple interfaces

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading Data From File");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from file");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permission in the File");;
    }
}
