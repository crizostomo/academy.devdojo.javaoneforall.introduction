package academy.devdojo.javaoneforall.javacore.ZZHdesignpatterns.test;

public class test {
    public static void main(String args[]) {
        try{
            int dividend = 69;
            int divisor = 0;
            System.out.println(dividend/divisor);
        } catch(ArithmeticException e){
            System.out.println("Bug");
        }
        finally{
            System.out.println("Bag");
        }
        System.out.println("Big");
    }
}
