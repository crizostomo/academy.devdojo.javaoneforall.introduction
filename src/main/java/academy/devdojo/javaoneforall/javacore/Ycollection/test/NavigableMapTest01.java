package academy.devdojo.javaoneforall.javacore.Ycollection.test;

//181 - Collection pt 21 - NavigableMap, TreeMap

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Customer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("A", "Letter A");
        map.put("B", "Letter B");
        map.put("C", "Letter C");
        map.put("D", "Letter D");
        map.put("E", "Letter E");


        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        System.out.println(map.headMap("C", true));

    }
}
