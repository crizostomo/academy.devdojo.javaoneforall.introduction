package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Smartphone;

//168 - Collection pt 08 - List pt 03
//169 - Collection pt 09 - Sorting lists pt 01

import java.util.ArrayList;
import java.util.List;

public class SmatphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1BACN2", "Pixel");
        Smartphone s2 = new Smartphone("22222", "iPhone");
        Smartphone s3 = new Smartphone("33333", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);
//        smartphones.clear();
        for (Smartphone smartphone: smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("22222", "");
//        System.out.println(smartphones.contains(s4)); The same as indexOf
        int indexOf = smartphones.indexOf(s4);
        if(indexOf != -1){
            System.out.println("---------------");
            System.out.println(smartphones.get(indexOf));
        }
    }
}
