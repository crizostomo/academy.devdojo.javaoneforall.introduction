package academy.devdojo.javaoneforall.javacore.Sformating.test;

//115 - Utility Classes - Date Internationalization with Locale

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        //ISO 639, ISO 3166
        // pt-BR, pt-PT
        Locale localItaly = new Locale("it", "IT");
        Locale localCH = new Locale("it", "CH");
        Locale localIndia = new Locale("hi", "IN");
        Locale localJapan = new Locale("ja", "JP");
        Locale localNetherlands = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1= DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localNetherlands);

        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
        System.out.println(df4.format(calendar.getTime()));
        System.out.println(df5.format(calendar.getTime()));

        System.out.println(localItaly.getDisplayCountry());
        System.out.println(localItaly.getDisplayLanguage());

        System.out.println(localItaly.getDisplayCountry(localJapan));
        System.out.println(localItaly.getDisplayLanguage(localJapan));




    }
}
