package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

//104 - Exceptions pt 10 - Custom Exception

import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }

    }

    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";
        System.out.println("Username: ");
        String typedUsername = scanner.nextLine();
        System.out.println("Password: ");
        String typedPassord = scanner.nextLine();

        if(!usernameDB.equals(typedUsername) || !passwordDB.equals(typedPassord)){
            throw new LoginInvalidException("Username or password is incorrect");
        }
        System.out.println("Login Completed!");

    }
}
