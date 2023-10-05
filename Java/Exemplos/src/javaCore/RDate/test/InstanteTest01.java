package javaCore.RDate.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstanteTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
    }
}
