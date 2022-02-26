package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

//94 - Object Orientation - Polymorphism pt 05 - Interface oriented programming

import academy.devdojo.javaoneforall.javacore.Npolymorphism.repository.Repository;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.service.DatabaseRepositoryService;

import java.util.LinkedList;
import java.util.List;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new DatabaseRepositoryService();
        repository.save();

        List<String> List = new LinkedList<>();
        List.add("Goku");
        List.add("Vegeta");
        List.add("N18");
        System.out.println(List);

    }
}
