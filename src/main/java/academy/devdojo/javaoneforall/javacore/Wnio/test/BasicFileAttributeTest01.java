package academy.devdojo.javaoneforall.javacore.Wnio.test;

//149 - Utility Classes - NIO pt 06 - BasicFileAttributes pt 01

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributeTest01 {
    public static void main(String[] args) throws IOException {
//        BasicFileAttributes;
//        PosixFileAttributes;
//        DosFileAttributes;
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("Folder2/new_file.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("folder2/file_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime); //Another way to do the same step
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));

    }
}
