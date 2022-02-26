package academy.devdojo.javaoneforall.javacore.Ycollection.test;

//178 - Collection pt 18 - Map, HashMap, LinkedHashMap pt 01

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>(); //HashMap
        map.put("keuboard", "keyboard");
        map.put("mousw", "mouse");
        map.put("yoi", "you");
        map.put("Andu", "Andy");
        map.putIfAbsent("yoi", "you2"); //ifAbsent will check if the value is there
        System.out.println(map);

        for(String key: map.keySet()){
            System.out.println(key + " : "+map.get(key));
        }
        System.out.println("------------");

        for(String value: map.values()){
            System.out.println(value);
        }

        System.out.println("------------");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
