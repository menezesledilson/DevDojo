package javaCore.RDate.test;

import java.util.Date;

public class datetest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L); // long representa milisegundos
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date.toString());
    }
}
