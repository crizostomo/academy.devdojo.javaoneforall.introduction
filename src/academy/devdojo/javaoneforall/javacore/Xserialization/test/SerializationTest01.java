package academy.devdojo.javaoneforall.javacore.Xserialization.test;

//159 - Utility Classes - Serialization pt 01
//160 - Utility Classes - Serialization pt 02


import academy.devdojo.javaoneforall.javacore.Xserialization.domain.Seminar;
import academy.devdojo.javaoneforall.javacore.Xserialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "Diogo", "123456");
        Seminar seminar = new Seminar("Special Seminar from DevDojo");
        student.setSeminar(seminar);
        serialize(student);
        deserialize();
    }

    private static void serialize(Student student) { //<--method
        Path path = Paths.get("folder/student.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void deserialize() { //<--method
        Path path = Paths.get("folder/student.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
