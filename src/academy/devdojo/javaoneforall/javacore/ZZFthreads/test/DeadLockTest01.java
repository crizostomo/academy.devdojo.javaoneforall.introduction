package academy.devdojo.javaoneforall.javacore.ZZFthreads.test;

//227 - Threads pt 08 - Synchronizing threads pt 04 - Deadlock

public class DeadLockTest01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        Runnable r1 = () -> {
            synchronized (lock1){
                System.out.println("Thread 1: Holding Lock 1");
                System.out.println("Thread 1: Waiting Lock 2");
                synchronized (lock2){
                    System.out.println("Thread 1: Holding lock 2");
                }
            }
        };Runnable r2 = () -> {
            synchronized (lock2){ //Put 'lock1' to fix the DeadLock
                System.out.println("Thread 2: Holding Lock 2");
                System.out.println("Thread 2: Waiting Lock 1");
                synchronized (lock1){ //Put 'lock2' to fix the DeadLock
                    System.out.println("Thread 2: Holding lock 1");
                }
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
