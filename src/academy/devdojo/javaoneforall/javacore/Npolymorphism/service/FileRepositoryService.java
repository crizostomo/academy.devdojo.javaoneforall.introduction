package academy.devdojo.javaoneforall.javacore.Npolymorphism.service;

//94 - Object Orientation - Polymorphism pt 05 - Interface oriented programming

import academy.devdojo.javaoneforall.javacore.Npolymorphism.repository.Repository;

public class FileRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in the file");
    }
}
