package academy.devdojo.javaoneforall.javacore.Uregex.test;

//133 - Utility Classes - Regex pt 03 - Pattern and Matcher - Range

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
//        String regex = "ab";
//        \d - All the digits 0-9
//        \D - Everything that is not \d
//        \s - All blank spaces \t \r \f \n
//        \S - everything that is not \s
//        \w - All the letters a-z A-Z, 0-9, _
//        \W - everything that is not \w
//        []
//        String regex2 = "[a-cA-Z]";
        String regex2 = "0[xX][0-9a-fA-F]";

//        String text = "abaaba";
        String text2 = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Text:  "+text2);
        System.out.println("index: 0123456789");
        System.out.println("Regex: " + regex2);
        System.out.println("Positions found");
        while (matcher.find()){
            System.out.println(matcher.start() + " "+matcher.group());
        }
        int hexNumber = 0xC350;
        System.out.println(hexNumber);
    }
}
