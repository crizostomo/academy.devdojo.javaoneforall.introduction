package academy.devdojo.javaoneforall.javacore.Uregex.test;

//137 - Utility Classes - Scanner - Tokens and Delimiters

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Levi, Eren, Mikase, true, 200";
        String[] names = text.split(",");
        for (String name : names){
            System.out.println(name.trim());
        }
    }
}
