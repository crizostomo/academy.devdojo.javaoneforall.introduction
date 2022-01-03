package academy.devdojo.javaoneforall.javacore.Wnio.test;

//157 - Utility Classes - NIO pt 14 - PathMatcher pt 02

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTestJavaOrClass extends SimpleFileVisitor<Path>{
    private static final PathMatcher MATCHER = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(MATCHER.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}
public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("."), new FindAllTestJavaOrClass());
    }
}
