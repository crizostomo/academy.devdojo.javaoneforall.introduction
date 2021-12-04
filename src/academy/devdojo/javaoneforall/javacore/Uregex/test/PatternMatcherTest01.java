package academy.devdojo.javaoneforall.javacore.Uregex.test;

//131 - Utility Classes - Regex pt 01 - Pattern and Matcher

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
//        String regex = "ab";
        String regex2 = "aba";
//        String text = "abaaba";
        String text2 = "abababa";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Text:  "+text2);
        System.out.println("index: 0123456789");
        System.out.println("Regex: " + regex2);
        System.out.println("Positions found");
        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
