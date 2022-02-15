package academy.devdojo.javaoneforall.javacore.ZZFthreads.test;

//224 - Threads pt 05 - Synchronizing threads pt 01
//225 - Threads pt 06 - Synchronizing threads pt 02

import academy.devdojo.javaoneforall.javacore.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable{
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();

    }

    private void withdraw(int amount){
        System.out.println("### outside synchronized "+getThreadName());
        synchronized (account) {
            System.out.println("*** inside synchronized "+getThreadName());
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " is going to withdraw money");
                account.withdraw(amount);
                System.out.println(getThreadName() + " finished withdrawing, current balance " + account.getBalance());
            } else {
                System.out.println("Not enough balance for " + getThreadName() + " withdraw money");
            }
        }
    }
    private String getThreadName(){
        return Thread.currentThread().getName();
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdraw(10);
            if(account.getBalance() < 0){
                System.out.println("Something VERY WRONG happened");
            }
        }

    }
}
