package academy.devdojo.javaoneforall.javacore.Wnio.test;

//144 - Utility Classes - NIO pt 01 - Path, Paths, Files pt 01

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\diogo\\IdeaProjects\\academy.devdojo.javaoneforall.introduction\\academy.devdojo.javaoneforall.introduction.iml");
        Path p2 = Paths.get("C:\\Users\\diogo\\IdeaProjects\\academy.devdojo.javaoneforall.introduction","academy.devdojo.javaoneforall.introduction.iml");
        Path p3 = Paths.get("C:\\Users\\diogo\\IdeaProjects\\academy.devdojo.javaoneforall.introduction","academy.devdojo.javaoneforall.introduction.iml");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());


    }
}
