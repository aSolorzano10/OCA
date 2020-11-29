package Dates;

import java.time.*;

public class LocalDatePractice {

    public static void main(String[] args) {
        System.out.println("LocalDate.now: " + LocalDate.now());

        // 2020-11-27
        LocalDate date1 = LocalDate.of(2020, Month.NOVEMBER, 27);
        System.out.println("LocalDate Custom 1: " + date1);

        // 2020-11-27
        LocalDate date2 = LocalDate.of(2020, 11, 27);
        System.out.println("LocalDate Custom 2: " + date2);

        System.out.println();
        date1 = date1.plusDays(2); //2020-11-29
        System.out.println("LocalDate after applied plusDay(2): " + date1);

        date1 = date1.plusWeeks(1); //2020-12-06
        System.out.println("LocalDate after applied plusweeks(1): " + date1);

        date1 = date1.plusMonths(3); //2021-03-06
        System.out.println("LocalDate after applied plusMonths(3): " + date1);

        date1 = date1.plusYears(2); // 2023-03-06
        System.out.println("LocalDate after applied plusTears(2): " +  date1);

        System.out.println();
        date2 = date2.minusDays(5); //2020-11-22
        System.out.println("LocalDate after applied minusDays(5): " + date2);

        date2 = date2.minusWeeks(3); //2020-11-01
        System.out.println("LocalDate after applied minusWeeks(3): " + date2);

        date2 = date2.minusMonths(2); //2020-09-01
        System.out.println("LocalDate after applied minusMonths(2): " + date2);

        date2 = date2.minusYears(7); //2013-09-01
        System.out.println("LocalDate after applied minusYears(7): " + date2);
    }
}
