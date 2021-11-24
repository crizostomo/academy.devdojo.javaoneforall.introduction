package academy.devdojo.javaoneforall.javacore.Oexception.error.test;

//95 - Exceptions pt 01 - Errors

//Recursion will be calling recursion and we will have an error

//Errors are not Exception

public class StackOverFlowTest01 {
    public static void main(String[] args) {
//        recursion();

    }
    public static void recursion(){
        recursion();
    }
}

