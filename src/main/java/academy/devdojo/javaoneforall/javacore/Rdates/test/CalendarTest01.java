package academy.devdojo.javaoneforall.javacore.Rdates.test;

//113 - Utility Classes - Calendar

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

//        System.out.println(c.getFirstDayOfWeek());

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Sunday is the first day of the week");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        c.add(Calendar.DAY_OF_MONTH, 2);
//        c.roll(Calendar.DAY_OF_MONTH, 30);
        c.add(Calendar.HOUR, 2);


        Date date = c.getTime();
        System.out.println(date);
    }
}
