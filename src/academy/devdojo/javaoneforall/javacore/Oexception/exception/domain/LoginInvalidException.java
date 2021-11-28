package academy.devdojo.javaoneforall.javacore.Oexception.exception.domain;

public class LoginInvalidException extends Exception{ //We use extends Exception when we want this to be checked

    public LoginInvalidException() {
        super("Invalid Login");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
