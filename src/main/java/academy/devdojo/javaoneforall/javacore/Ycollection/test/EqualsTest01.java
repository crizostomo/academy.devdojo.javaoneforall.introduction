package academy.devdojo.javaoneforall.javacore.Ycollection.test;

//161 - Collection pt 01 - equals pt 01

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1BACN2", "Pixel");
        Smartphone s2 = new Smartphone("1BACN2", "Pixel");
        System.out.println(s1.equals(s2));

    }
}
