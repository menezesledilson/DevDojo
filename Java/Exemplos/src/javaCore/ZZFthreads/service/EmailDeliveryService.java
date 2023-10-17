package javaCore.ZZFthreads.service;

import javaCore.ZZFthreads.dominio.Members;

import javax.sound.midi.Soundbank;

public class EmailDeliveryService implements Runnable {

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Starting to deliver emails.....");
        while(members.isOpen() || members.pendingEmails() > 0 ){
            try {

                String email = members.retrieveEmail();
                if(email == null) continue;
                System.out.println(threadName + " enviando email para  " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou Email com sucesso para   " +email);
            } catch (InterruptedException e) {
             e.printStackTrace();
            }
        }
        System.out.println(" Todos os emails foram enviados com sucesso!");
    }
}
