package academy.devdojo.javaoneforall.javacore.Wnio.test;

//145 - Utility Classes - NIO pt 02 - Path, Paths, Files pt 02

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("folder");
        if(Files.notExists(folderPath)){ //We need to introduce the if because if we don't put 'if' we will have an exception
            folderPath = Files.createDirectory(folderPath);
        }
        Path subfolderPath = Paths.get("folder/subfolder/subfolder2");
        subfolderPath = Files.createDirectories(subfolderPath); //createDirectories don't throw exception

        Path filePath = Paths.get(subfolderPath.toString(), "filex.txt");
        if(Files.notExists(filePath)){
            filePath = Files.createFile(filePath);
        }
        Path source = filePath;
        Path target = Paths.get(source.getParent().toString(), "file renamed");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
