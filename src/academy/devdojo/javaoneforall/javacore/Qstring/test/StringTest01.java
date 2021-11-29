package academy.devdojo.javaoneforall.javacore.Qstring.test;

//108 - Utility Classes - String pt 01

public class StringTest01 {
    public static void main(String[] args) {
        String name = "William";
        String name2 = "William";
        name = name.concat(" Suane ");
        System.out.println(name);
        System.out.println(name == name2); //Reference of these references
        String name3 = new String("William"); //Creating a new object
        System.out.println(name2 == name3.intern());
        // 1 Creating Reference variable
        // 2 A String object
        // 3 Create in the pool of Strings

    }
}
