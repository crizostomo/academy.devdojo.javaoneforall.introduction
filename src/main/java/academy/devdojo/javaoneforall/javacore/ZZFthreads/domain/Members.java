package academy.devdojo.javaoneforall.javacore.ZZFthreads.domain;

//228 - Threads pt 09 - Synchronizing threads pt 05 - Wait, notify, notifyAll

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }
    public int pendingEmails(){
        synchronized (this.emails){
            return emails.size();
        }
    }
    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Checking if there are emails");
        synchronized (this.emails){
            while(this.emails.size() == 0){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " no emails found to be sent, waiting for instructions...");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }
    public void addMemberEmail(String email){
        synchronized (this.emails){
            System.out.println(Thread.currentThread().getName() + " just added an email to the list");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }
    public void close(){
        open = false;
        synchronized (this.emails){
            System.out.println(Thread.currentThread().getName() + " Notifying all threads that emails are closed");
            this.emails.notifyAll();
        }
    }
}
