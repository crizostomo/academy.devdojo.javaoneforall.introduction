package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

//190 - Inner classes pt 02 - Local class

public class OuterClassesTest02 {

    private String name = "Naruto";

    void print(){
        String lastName = "Uzumaki";
        class LocalClass {
            public void printName(){
                System.out.println(name+" "+lastName);
            }
        }
        new LocalClass().printName();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
