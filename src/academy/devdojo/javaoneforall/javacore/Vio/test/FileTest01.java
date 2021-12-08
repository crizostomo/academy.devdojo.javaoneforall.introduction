package academy.devdojo.javaoneforall.javacore.Vio.test;

//138 - Utility Classes - IO pt 01 - File

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println("isCreated"+newFile);

            boolean exists = file.exists();
            System.out.println("exists "+exists);
            System.out.println("path "+file.getPath());
            System.out.println("absolute path "+file.getAbsolutePath());
            System.out.println("isFile path "+file.isFile());
            System.out.println("isDirectory path "+file.isDirectory());
            System.out.println("isHidden path "+file.isHidden());
            System.out.println("lastModified path "+new Date(file.lastModified()));
            System.out.println("lastModified path "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            if(exists){
                boolean delete = file.delete();
                boolean delete2 = file.delete();
                System.out.println("isDeleted"+delete);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
