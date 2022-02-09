package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

//206 - Streams pt 04 - FlatMap pt 01

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Designer 1", "Designer 2", "Designer 3");
        List<String> developers = List.of("Developer 1", "Developer 2", "Developer 3");
        List<String> students = List.of("Student 1", "Student 2", "Student 3");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people){
                System.out.println(person);
            }
            System.out.println("-----------------");
            devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);

        }


    }

}
