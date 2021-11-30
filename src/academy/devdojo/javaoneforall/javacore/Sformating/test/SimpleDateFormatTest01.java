package academy.devdojo.javaoneforall.javacore.Sformating.test;

//118 - Utility Classes - SimpleDateFormat

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
//        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern = "'Brazil' dd 'of' MMMM ',' yyyy";


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            System.out.println(simpleDateFormat.parse("Brazil 30 of November , 2021"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
