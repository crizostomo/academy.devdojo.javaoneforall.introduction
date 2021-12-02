package academy.devdojo.javaoneforall.javacore.Rdates.test;

//124 - Utility Classes - Period
//125 - Utility Classes - ChronoUnit

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(9);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(30);
        Period p4 = Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.DAYS));
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.YEARS));

    }
}
