package academy.devdojo.javaoneforall.javacore.Wnio.test;

//154 - Utility Classes - NIO pt 11 - SimpleFileVisitor pt 01

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        //Here is to print everything that it is .java
        Path fileName = file.getFileName();
        if(fileName.toString().endsWith(".java")){
            System.out.println(fileName);
        }
//        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllJavaFiles());
    }
}
