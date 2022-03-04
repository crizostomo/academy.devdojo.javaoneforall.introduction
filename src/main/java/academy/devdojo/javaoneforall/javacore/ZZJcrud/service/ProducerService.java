package academy.devdojo.javaoneforall.javacore.ZZJcrud.service;

//275 - JDBC pt 24 - Crud pt 01 - findByName and findAll
//276 - JDBC pt 25 - Crud pt 02 - delete
//277 - JDBC pt 26 - Crud pt 03 - save


import academy.devdojo.javaoneforall.javacore.ZZJcrud.domain.Producer;
import academy.devdojo.javaoneforall.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op){
        switch (op){
            case 1-> findByName();
            case 2-> delete();
            case 3-> save();
            default-> throw new IllegalArgumentException("Invalid Option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to list all");
        String name = SCANNER.nextLine();
        List<Producer> producers = ProducerRepository.findByName(name);
        producers.forEach(p-> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));
    }

    private static void delete(){
        System.out.println("Type the id of the producer you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if("y".equalsIgnoreCase(choice)){
            ProducerRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }
}
