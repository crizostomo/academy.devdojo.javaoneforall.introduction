package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.test;

//234 - Concurrency pt 06 - ArrayBlockingQueue

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Diogo");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add a new value");
        new Thread(new RemoveFromQueue(bq)).start();
        bq.put("Almeida");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());

    }

    static class RemoveFromQueue implements Runnable{
        private final BlockingQueue<String> bq;

        RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s sleeping for 5s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.printf("%s retrieved and removed the value %s%n", Thread.currentThread().getName(), bq.take());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

