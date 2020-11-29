package Dates;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimePractice {
    public static void main(String[] args) {
        System.out.println("LocalDate.now: " + LocalDate.now());

        LocalTime time1 = LocalTime.of(7,19);
        System.out.println("Time1: " + time1);

        LocalTime time2 = LocalTime.of(7, 19, 25);
        System.out.println("Time2: " + time2);

        LocalTime time3 = LocalTime.of(7, 19, 25, 625);
        System.out.println("Time3: " + time3);


    }
}
