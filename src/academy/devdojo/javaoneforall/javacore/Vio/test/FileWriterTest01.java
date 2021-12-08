package academy.devdojo.javaoneforall.javacore.Vio.test;

//139 - Utility Classes - IO pt 02 - FileWriter

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
//      try (FileWriter fw = new FileWriter(file)){

                fw.write("This is a message from DevDojo <3\nThis is a new line");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
