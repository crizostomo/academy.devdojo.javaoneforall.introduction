package academy.devdojo.javaoneforall.javacore.Pwrapper.test;

//106 - Utility Classes - Wrapper pt 01
//107 - Utility Classes - Wrapper pt 02

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'M';
        boolean booleanP = false;

//CTRL + F to change 'W' for 'P'

        Byte byteW = 1;
        Short shortW = 1; //outboxing
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        boolean booleanValue = Boolean.parseBoolean("TruE");
        System.out.println(booleanValue);
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isLetterOrDigit('9'));
        System.out.println(Character.isUpperCase('9'));
        System.out.println(Character.toUpperCase('9'));





    }
}
