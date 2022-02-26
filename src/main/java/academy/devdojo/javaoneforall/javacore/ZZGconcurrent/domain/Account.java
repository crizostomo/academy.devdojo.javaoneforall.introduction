package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.domain;

//224 - Threads pt 05 - Synchronizing threads pt 01

public class Account {
    private int balance = 50;

    public void withdraw(int amount){
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
