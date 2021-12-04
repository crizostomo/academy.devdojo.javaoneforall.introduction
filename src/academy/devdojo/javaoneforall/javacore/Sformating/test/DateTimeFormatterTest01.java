package academy.devdojo.javaoneforall.javacore.Sformating.test;

//129 - Utility Classes - DateTimeFormatter

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20211203", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);
        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2021-12-03T11:11:53.8781524");
        System.out.println(parse4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDateTime.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("03/12/2021", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterIT = DateTimeFormatter.ofPattern("dd.MMM.yyyy", Locale.ITALY);
        String formatIT = LocalDateTime.now().format(formatterIT);
        System.out.println(formatIT);
        LocalDate parseIT = LocalDate.parse("03.dic.2021", formatterIT);
        System.out.println(parseIT);

    }
}
