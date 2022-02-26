package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

//100 - Exceptions pt 06 - Finally block

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
    }


    private static String openConnection(){
        try{
            System.out.println("Openning Connection");
            System.out.println("Writing to the database");
//            if(true){
//                throw new RuntimeException();
//            }
            return "connected";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Close");
        }
        return "not connected";
    }
}
