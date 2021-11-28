package academy.devdojo.javaoneforall.javacore.Oexception.runtime.test;

//101 - Exceptions pt 07 - Capturando múltiplas exceções
//102 - Exceptions pt 08 - Collapsed multi catch

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        }
//        catch (IllegalArgumentException e) {
//            System.out.println("Inside IllegalArgumentException");
//        } catch (ArithmeticException e) {
//            System.out.println("Inside ArithmeticException");
//        }
        catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }
        try{
            mayThrowException();
        }catch(SQLException | FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
//            e =new RuntimeException(); = It's possible but not so used
            e.printStackTrace();
        }
    }
    private static void mayThrowException() throws SQLException, FileNotFoundException{

    }
}
