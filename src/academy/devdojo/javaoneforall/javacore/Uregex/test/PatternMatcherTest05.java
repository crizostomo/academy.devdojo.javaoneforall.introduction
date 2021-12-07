package academy.devdojo.javaoneforall.javacore.Uregex.test;

//136 - Utility Classes - Regex pt 06 - Pattern and Matcher - Anchor
// regexr.com

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
//        String regex = "ab";
//        \d - All the digits 0-9
//        \D - Everything that is not \d
//        \s - All blank spaces \t \r \f \n
//        \S - everything that is not \s
//        \w - All the letters a-z A-Z, 0-9, _
//        \W - everything that is not \w
//        []
//        ? zero or one
//        * zero or more
//        + one or more
//        {n,n} from n to m
//        () group things
//        | person(a|s) persons or persona
//        $
//        . 1.3 = 123, 133, 1A3, 1@3

//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])+"; This line is not including the .br at the end
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@gmail.br, test@gmail.com.br, sakura@mail";
        String[] emails = text.split(",");
//        System.out.println(Arrays.toString(emails));
        System.out.println(emails[1].trim().matches(regex));
        System.out.println("#@!zoro@gmail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text:  "+text);
        System.out.println("index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found");
        while (matcher.find()){
            System.out.println(matcher.start() + " "+matcher.group());
        }
    }
}
