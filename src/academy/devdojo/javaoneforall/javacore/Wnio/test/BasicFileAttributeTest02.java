package academy.devdojo.javaoneforall.javacore.Wnio.test;

//150 - Utility Classes - NIO pt 07 - BasicFileAttributes pt 02

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributeTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime "+creationTime);
        System.out.println("lastModifiedTime"+lastModifiedTime);
        System.out.println("lastAccessTime"+lastAccessTime);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newLastAccess = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(null, newLastAccess, null);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
        System.out.println("-------");

        System.out.println("creationTime "+creationTime);
        System.out.println("lastModifiedTime"+lastModifiedTime);
        System.out.println("lastAccessTime"+lastAccessTime);

    }
}
