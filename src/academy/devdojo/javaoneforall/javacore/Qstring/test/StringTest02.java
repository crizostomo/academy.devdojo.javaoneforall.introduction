package academy.devdojo.javaoneforall.javacore.Qstring.test;

//109 - Utility Classes - String pt 02 - Performance


public class StringTest02 {
    public static void main(String[] args) {
        String name = "Luffy";
        String name2 = "luffy";
        String name3 = "  luffy  ";
        String numbers = "012345";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.replace("f", "l"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(numbers.substring(0));
        System.out.println(numbers.substring(0, 3));
        System.out.println(name3.trim());




    }
}
