package academy.devdojo.javaoneforall.javacore.Sformating.test;

//116 - Utility Classes - Number Internationalization with Locale

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
//        isoLanguages and Press ALT+Enter = Iterate Over it

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+ " ");
        }
        System.out.println();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+" ");

        }

    }
}
