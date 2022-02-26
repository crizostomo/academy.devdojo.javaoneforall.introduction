package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

//189 - Inner classes pt 01 - Introduction

public class OuterClassesTest01 {
    private String name = "Luffy";
    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outer = new OuterClassesTest01();
        Inner inner = outer.new Inner();
//        inner = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
    }
}
