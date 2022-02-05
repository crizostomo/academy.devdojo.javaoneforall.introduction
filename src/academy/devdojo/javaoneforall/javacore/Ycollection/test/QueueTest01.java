package academy.devdojo.javaoneforall.javacore.Ycollection.test;

//182 - Collection pt 22 - Queue, PriorityQueue

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("B");
        queue.add("A");
        for (String s : queue) {
            System.out.println(s);
        }
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
