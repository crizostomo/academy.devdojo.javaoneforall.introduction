package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

//212 - Streams pt 10 - Generating Streams pt 02

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n +2)
                .limit(10)
                .forEach(System.out::println);
        // 0,1,1,2,3,5,8,13,21,34 --> Fibonacci
        // (0,1) (1,1) (1,2) (2,3) (3,5) ...
        Stream.iterate(new int[]{0,1}, a -> new int[]{a[1], a[0]+a[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        Stream.iterate(new int[]{0,1}, a -> new int[]{a[1], a[0]+a[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 1000))
                .limit(90)
                .forEach(System.out::println);
    }
}
