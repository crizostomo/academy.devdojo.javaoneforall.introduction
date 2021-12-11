package academy.devdojo.javaoneforall.javacore.Vio.test;

//142 - Utility Classes - IO pt 05 - BufferedReader
// This is how we read entire files

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
