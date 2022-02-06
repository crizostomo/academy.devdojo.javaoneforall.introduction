package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

//188 - Generics pt 06 - Generic methods

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;

import java.util.List;

public class GenericMethodsTest01 {
    public static void main(String[] args) {
        createArrayWithOneObject(new Boat("Big Boat"));


    }
    private static <T> void createArrayWithOneObject(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }
}

//public class GenericMethodsTest01 {
//    public static void main(String[] args) {
//        List<Boat> boatList = createArrayWithOneObject(new Boat("Big Boat"));
//
//
//    }
//    private static <T> List<T> createArrayWithOneObject(T t){
//        return List.of(t);
//    }
//}

