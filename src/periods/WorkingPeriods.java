package src.periods;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class WorkingPeriods {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, Month.NOVEMBER, 27);
        System.out.println("Local Date initialize: " + localDate);

        //Periodo Suma 1 años
        Period periodYear = Period.ofYears(1);
        System.out.println();
        LocalDate localDateYear = localDate.plus(periodYear);
        System.out.println("LocalDate after applied Plus-PeriodOfYears(1): " + localDateYear);

        //Perido Suma 2 Meses
        Period periodMonth = Period.ofMonths(2);
        LocalDate localDateMonth = localDate.plus(periodMonth);
        System.out.println("Local date after apllied Plus-PeriodOfMonths(2): " + localDateMonth);

        //Periodo Suma 3 Semanas
        Period periodWeek = Period.ofWeeks(3);
        LocalDate localDateWeek = localDate.plus(periodWeek);
        System.out.println("Local date after applied plus-periodOfWeel(3): " + localDateWeek);

        //Period Suma 17 días
        Period periodOfDays = Period.ofDays(17);
        LocalDate localDateDays = localDate.plus(periodOfDays);
        System.out.println("Local date after applied plus-periodOfDays(17): " + localDateDays);

        //
        System.out.println();
        Period everyYearAndWeek = Period.of(2,0,3);
        LocalDate localDateEveryYearWeek = localDate.plus(everyYearAndWeek);
        System.out.println("Local Date after applied Every Year and Week: " + localDateEveryYearWeek);
    }
}
