package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

//98 - Exceptions pt 04 - Throw Runtime Exception

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(division(1, 0));
    }

    /**
     *
     * @param a
     * @param b cannot be zero
     * @return
     * @throws IllegalArgumentException if b is zero
     */

    //The lines above were added using '/**' and by pressing 'enter'

    private static int division(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("The second parameter cannot be 'zero'");
        }

//      Best method ^^

//        try{
        return  a/b;
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//        return 0;
    }
}
