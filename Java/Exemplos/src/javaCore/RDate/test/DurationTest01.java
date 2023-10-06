package javaCore.RDate.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow = LocalTime.now();

        LocalTime timeMinus7hours = LocalTime.now().minusHours(7);
        Duration d1 =Duration.between(now,nowAfterTwoYears);
        Duration d2 =Duration.between(timeNow,timeMinus7hours);
        System.out.println(d1);
        System.out.println(d2);
    }
}
