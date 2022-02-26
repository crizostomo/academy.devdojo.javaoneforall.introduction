package academy.devdojo.javaoneforall.javacore.Qstring.test;

//111 - Utility Classes - String pt 05 - StringBuilder

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Diogo Almeida";
        name.concat("DevDojo");
        name = name.substring(0, 3);
        System.out.println(name);
        StringBuilder sb = new StringBuilder("Diogo Almeida");
        sb.append(" DevDojo").append(" Academy").append(" Nice!");
        sb.reverse();
        sb.delete(0,3);
//        sb.delete(0, sb.length());
//        sb.setLength(0);
        System.out.println(sb);
    }
}
