package academy.devdojo.javaoneforall.javacore.ZZJcrud.test;

//275 - JDBC pt 24 - Crud pt 01 - findByName and findAll
//276 - JDBC pt 25 - Crud pt 02 - delete
//277 - JDBC pt 26 - Crud pt 03 - save
//279 - JDBC pt 28 - Crud pt 05 - Anime CRUD


import academy.devdojo.javaoneforall.javacore.ZZJcrud.service.AnimeService;
import academy.devdojo.javaoneforall.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true){
            menu();
            //op = Integer.parseInt(SCANNER.nextLine());
            op = SCANNER.nextInt();
            if(op == 0) break;
            switch (op){
                case 1 -> {
                    producerMenu();
                    op = SCANNER.nextInt();
                    ProducerService.menu(op);
                }
                case 2 -> {
                    animeMenu();
                    op = SCANNER.nextInt();
                    AnimeService.menu(op);
                }
            }

        }
    }

    private static void menu(){
        System.out.println("Type the number of your operation");
        System.out.println("2. Anime");
        System.out.println("1. Producer");
        System.out.println("0. Exit");
    }

    private static void producerMenu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer");
        System.out.println("3. Save producer");
        System.out.println("4. Update producer");
        System.out.println("9. Go Back");
    }

    private static void animeMenu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for anime");
        System.out.println("2. Delete anime");
        System.out.println("3. Save anime");
        System.out.println("4. Update anime");
        System.out.println("9. Go Back");
    }
}
