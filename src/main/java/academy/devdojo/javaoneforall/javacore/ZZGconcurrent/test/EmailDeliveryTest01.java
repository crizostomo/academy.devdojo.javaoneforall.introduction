package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.test;

//228 - Threads pt 09 - Synchronizing threads pt 05 - Wait, notify, notifyAll


import academy.devdojo.javaoneforall.javacore.ZZGconcurrent.domain.Members;
import academy.devdojo.javaoneforall.javacore.ZZGconcurrent.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");
        jiraya.start();
        kakashi.start();

        while (true){
            String email = JOptionPane.showInputDialog("Please type your email");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
