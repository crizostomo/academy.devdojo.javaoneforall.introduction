package academy.devdojo.javaoneforall.javacore.Ycollection.test;

//166 - Collection pt 06 - List pt 01
//167 - Collection pt 07 - List pt 02

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names.add("Diogo");
        names.add("Almeida");
        names2.add("Dev");
        names2.add("Jr.");
//        System.out.println(names.remove(0));

        names.addAll(0, names2);
        for(String name : names){
            System.out.println(name);
        }
        names.add("Mr.");
        System.out.println("-------------");

        int size = names.size();
        for(int i = 0; i < size; i++){
            System.out.println(names.get(i));
            names.add("Crizostomo");
        }
        System.out.println(names);

    }
}
