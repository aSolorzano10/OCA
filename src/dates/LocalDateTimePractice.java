package Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimePractice {
    public static void main(String[] args) {
        System.out.println("LocalDateTime.now: " + LocalDateTime.now());

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.NOVEMBER, 27, 7, 25, 56);
        System.out.println("dateTime 1: " + dateTime1);


        LocalDate date1 = LocalDate.of(2020, Month.NOVEMBER, 27);
        LocalTime time1 = LocalTime.of(7, 25, 56);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println("dateTime 2: " + dateTime2);

        System.out.println();
        dateTime1 =  dateTime1.minusHours(4);
        System.out.println("LocalDateTime after applied minusHours(4): " + dateTime1);

        dateTime1 = dateTime1.minusMinutes(27);
        System.out.println("LocalDateTime after applied minusMinutes(27): " + dateTime1);

        dateTime1 = dateTime1.minusSeconds(14);
        System.out.println("LocalDateTime after applied minusSeconds(14): " + dateTime1);

        System.out.println();
        dateTime2 = dateTime2.minusHours(4).minusMinutes(27).minusSeconds(14);
        System.out.println("Datetime2: " + dateTime2);

    }
}
