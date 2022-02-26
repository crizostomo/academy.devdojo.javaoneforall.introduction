package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

//192 - Inner classes pt 04 - Static nested classes


public class OuterClassesTest03 {
    protected String name = "Diogo";

    static class Inner {
        public void printOuterClassAttribute(){
            System.out.println(new OuterClassesTest03().name);
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.printOuterClassAttribute();
    }
}
