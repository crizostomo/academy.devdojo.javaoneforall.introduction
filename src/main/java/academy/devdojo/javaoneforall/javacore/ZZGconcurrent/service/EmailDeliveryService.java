package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.service;

//228 - Threads pt 09 - Synchronizing threads pt 05 - Wait, notify, notifyAll

import academy.devdojo.javaoneforall.javacore.ZZGconcurrent.domain.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " preparing to run and deliver emails");
        while (members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmail();
                if(email == null) continue;
                System.out.println(threadName + " sending email to " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " sent the email successfully to + " + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("All emails were sent successfully");
    }
}
