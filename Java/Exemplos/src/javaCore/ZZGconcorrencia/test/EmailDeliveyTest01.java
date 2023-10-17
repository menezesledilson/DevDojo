package javaCore.ZZGconcorrencia.test;





import javaCore.ZZGconcorrencia.dominio.Members;
import javaCore.ZZGconcorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveyTest01 {
    public static void main(String[] args) throws InterruptedException {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members), "jiraya");
        Thread Kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");
        jiraya.start();
        Kakashi.start();
        while (true){
           String email =  JOptionPane.showInputDialog("Entre com seu email");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
