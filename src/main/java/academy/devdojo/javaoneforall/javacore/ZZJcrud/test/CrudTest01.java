package academy.devdojo.javaoneforall.javacore.ZZJcrud.test;

//275 - JDBC pt 24 - Crud pt 01 - findByName and findAll
//276 - JDBC pt 25 - Crud pt 02 - delete
//277 - JDBC pt 26 - Crud pt 03 - save


import academy.devdojo.javaoneforall.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true){
            producerMenu();
            //op = Integer.parseInt(SCANNER.nextLine());
            op = SCANNER.nextInt();
            if(op == 0) break;
            ProducerService.menu(op);
        }
    }

    private static void producerMenu(){
        System.out.println("Type the number of your operation");
        System.out.println("3. Save producer");
        System.out.println("2. Delete producer");
        System.out.println("1. Search for producer");
        System.out.println("0. Exit");
    }
}
