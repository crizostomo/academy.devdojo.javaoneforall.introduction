package academy.devdojo.javaoneforall.javacore.Ycollection.test;

//166 - Collection pt 06 - List pt 01

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Diogo");
        names.add("Almeida");

        for(String name : names){
            System.out.println(name);
        }
        names.add("Mr.");
        System.out.println("-------------");

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
