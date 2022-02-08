package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

//197 - Lambdas pt 03 - Function
//198 - Method Reference pt 01 - Reference to static methods

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Allucard");
        List<Integer> integers = map(strings, (String s) -> s.length());
//        List<Integer> integers = map(strings, String::length); the same as line 13
        List<String> list = map(strings, s -> s.toUpperCase());
        System.out.println(integers);
        System.out.println(list);
    }
    private static <T, R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
