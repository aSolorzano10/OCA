package Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatingDates {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, Month.NOVEMBER, 27);

        System.out.println("LocalDate: " + localDate);
        System.out.println();
        System.out.println("Days");
        System.out.println("Day of Week: " +localDate.getDayOfWeek());
        System.out.println("Day of Month: " + localDate.getDayOfMonth());
        System.out.println("Day of Year: " + localDate.getDayOfYear());

        System.out.println();
        System.out.println("Month: " + localDate.getMonth());
        System.out.println("Year: " + localDate.getYear());

        System.out.println();
        LocalTime time = LocalTime.of(10, 13, 28);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, time);
        System.out.println("Formatting Local Date: " + localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("Formatting Local Time: " + time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("Formatting Local Date Time: " + localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println();
        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println("Custom Format Local Date Time Short: " + shortFormat.format(localDateTime));

        DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("Custom Format Local Date Time Medium: " + mediumFormat.format(localDateTime));

        //DateTimeFormatter longFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //System.out.println("Custom Format Local Date Time: " + longFormat.format(localDateTime));

        //DateTimeFormatter fullFormart = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        //System.out.println("Custom Format Local Date Time: " + fullFormart.format(localDateTime));


    }
}
