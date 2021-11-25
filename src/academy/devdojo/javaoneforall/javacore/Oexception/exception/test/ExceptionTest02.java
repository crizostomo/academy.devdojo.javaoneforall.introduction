package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

//99 - Exceptions pt 05 - Throw Exception

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
    customFileCreator();
    }

    private static void customFileCreator() {
        File folder = new File("folder\\test.txt");
        try{
            boolean isCreated = folder.createNewFile();
            System.out.println("File Created " +isCreated);
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("Something happened...");

//      Totally important to insert ^^  "e.printStackTrace(); after "Try and Catch"
//      because this is what will help you to solve a problem

        }
        System.out.println("Outside custom file creator");
    }
}
